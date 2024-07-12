package aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Aspect
@Component
public class NotEmptyAspect {

    @Before("@annotation(NotEmpty)")
    public void verifyArguments(JoinPoint joinPoint) {
        Object[] arguments = joinPoint.getArgs();

        for (Object argument : arguments) {
            if (argument == null) {
                throw new IllegalArgumentException();
            }

            if (argument instanceof String string && string.isEmpty()) {
                throw new IllegalArgumentException();
            } else if (argument instanceof Collection<?> collection && collection.isEmpty()) {
                throw new IllegalArgumentException();
            }
        }
    }

}

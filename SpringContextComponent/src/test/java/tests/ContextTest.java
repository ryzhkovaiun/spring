package tests;

import application.Application;
import beans.Cat;
import beans.Dog;
import beans.Parrot;
import beans.Person;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {Application.class})
public class ContextTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void catTest() {
        Cat cat = context.getBean(Cat.class);

        assertEquals("Richard", cat.getName());
    }

    @Test
    public void dogTest() {
        Dog dog = context.getBean(Dog.class);

        assertEquals("Loki", dog.getName());
    }

    @Test
    public void parrotShiroTest() {
        Parrot parrot = context.getBean("Shiro", Parrot.class);

        assertEquals("Shiro", parrot.getName());
    }

    @Test
    public void parrotAshTest() {
        Parrot parrot = context.getBean("Ash", Parrot.class);

        assertEquals("Ash", parrot.getName());
    }

    @Test
    public void personTest() {
        Person person = context.getBean(Person.class);

        assertEquals("Richard", person.getCat().getName());
        assertEquals("Loki", person.getDog().getName());
        assertEquals("Shiro", person.getParrotShiro().getName());
        assertEquals("Ash", person.getParrotAsh().getName());
        assertEquals("Andrey", person.getName());
    }
}

package tests;

import components.ArgumentsApp;
import application.Application;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {Application.class})
public class AspectTest {

    @Autowired
    private ArgumentsApp argumentsApp;

    @Test
    public void noArgsTest() {
        assertDoesNotThrow(() -> argumentsApp.withoutArguments());
    }

    @Test
    public void noAnnotationTest() {
        assertDoesNotThrow(() -> argumentsApp.withoutAnnotation(null));
    }

    @Test
    public void noSpecificArgsTest() {
        assertDoesNotThrow(() -> argumentsApp.withInteger(0));
    }

    @Test
    public void validArgsTest() {
        assertDoesNotThrow(() -> argumentsApp.withString("Hello World!"));
        assertDoesNotThrow(() -> argumentsApp.withCollectionOfStrings(List.of("Hello World!")));
        assertDoesNotThrow(() -> argumentsApp.withBothCollectionAndString(List.of("Hello World!"), "Hello World!"));
    }

    @Test
    public void invalidArgsTest() {
        assertThrowsExactly(IllegalArgumentException.class, () -> argumentsApp.withString(null));
        assertThrowsExactly(IllegalArgumentException.class, () -> argumentsApp.withString(""));
        assertThrowsExactly(IllegalArgumentException.class, () -> argumentsApp.withCollectionOfStrings(null));
        assertThrowsExactly(IllegalArgumentException.class, () -> argumentsApp.withCollectionOfStrings(List.of()));
        assertThrowsExactly(IllegalArgumentException.class, () -> argumentsApp.withBothCollectionAndString(List.of(), null));
        assertThrowsExactly(IllegalArgumentException.class, () -> argumentsApp.withBothCollectionAndString(List.of(), "Hello World!"));
        assertThrowsExactly(IllegalArgumentException.class, () -> argumentsApp.withBothCollectionAndString(List.of("Hello World!"), null));
        assertThrowsExactly(IllegalArgumentException.class, () -> argumentsApp.withBothCollectionAndString(List.of("Hello World!"), ""));
    }

}
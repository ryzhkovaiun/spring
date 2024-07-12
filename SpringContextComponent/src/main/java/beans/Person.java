package beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private Cat cat;

    private Dog dog;

    private Parrot parrotShiro;

    private Parrot parrotAsh;

    private String name = "Andrey";

    public Person(Cat cat, Dog dog, @Qualifier("Shiro") Parrot parrotShiro, @Qualifier("Ash") Parrot parrotAsh) {
        this.cat = cat;
        this.dog = dog;
        this.parrotShiro = parrotShiro;
        this.parrotAsh = parrotAsh;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Parrot getParrotShiro() {
        return parrotShiro;
    }

    public void setParrotShiro(Parrot parrotShiro) {
        this.parrotShiro = parrotShiro;
    }

    public Parrot getParrotAsh() {
        return parrotAsh;
    }

    public void setParrotAsh(Parrot parrotAsh) {
        this.parrotAsh = parrotAsh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

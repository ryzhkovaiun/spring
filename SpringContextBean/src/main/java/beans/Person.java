package beans;

public class Person {

    private Cat cat;

    private Dog dog;

    private Parrot parrotShiro;

    private Parrot parrotAsh;

    private String name;

    public Person(Cat cat, Dog dog, Parrot parrotShiro, Parrot parrotAsh, String name) {
        this.cat = cat;
        this.dog = dog;
        this.parrotShiro = parrotShiro;
        this.parrotAsh = parrotAsh;
        this.name = name;
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

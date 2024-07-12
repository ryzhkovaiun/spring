package application;

import beans.Cat;
import beans.Dog;
import beans.Parrot;
import beans.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    @Bean
    public Cat getCat() {
        return new Cat("Richard");
    }

    @Bean
    public Dog getDog() {
        return new Dog("Loki");
    }

    @Bean(name = "Shiro")
    public Parrot getParrotShiro() {
        return new Parrot("Shiro");
    }

    @Bean(name = "Ash")
    public Parrot getParrotAsh() {
        return new Parrot("Ash");
    }

    @Bean
    public Person getPerson(Cat cat, Dog dog, @Qualifier("Shiro") Parrot shiro, @Qualifier("Ash") Parrot ash) {
        return new Person(cat, dog, shiro, ash, "Andrey");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
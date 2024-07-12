package application;

import beans.Parrot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "beans")
public class Application {

    @Bean(name = "Shiro")
    public Parrot getParrotShiro() {
        return new Parrot("Shiro");
    }

    @Bean(name = "Ash")
    public Parrot getParrotAsh() {
        return new Parrot("Ash");
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
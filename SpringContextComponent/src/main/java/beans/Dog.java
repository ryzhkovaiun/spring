package beans;

import org.springframework.stereotype.Component;

@Component
public class Dog {

    private String name = "Loki";

    public Dog() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
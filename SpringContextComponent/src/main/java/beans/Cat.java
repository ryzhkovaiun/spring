package beans;

import org.springframework.stereotype.Component;

@Component
public class Cat {

    private String name = "Richard";

    public Cat() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

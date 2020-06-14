package task3.entity;

import java.util.ArrayList;

public class Author {
    private String name;
    private String telephone;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Author{ " + "name = " + name +
                "   telephone = " + telephone +
                "   age = " + age + "}";
    }
}

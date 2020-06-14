package task3.entity;

import java.util.ArrayList;

public class Student {
    private String name;
    private String telephone;
    private ArrayList<Book> books;
    private int age;

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

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
        return "Student{ " + "name = " + name +
                "   telephone = " + telephone +
                "\n   books = " + books +
                "   age = " + age + " }";
    }
}


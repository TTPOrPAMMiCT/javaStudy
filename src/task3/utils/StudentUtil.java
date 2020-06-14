package task3.utils;

import task3.entity.Book;
import task3.entity.Student;

import java.util.ArrayList;

public class StudentUtil {

    public Student createStudent(String name, String telephone, int age, Book book) {
        Student student = new Student();
        student.setName(name);
        student.setTelephone(telephone);
        student.setAge(age);
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book);
        student.setBooks(books);
        return student;
    }
}

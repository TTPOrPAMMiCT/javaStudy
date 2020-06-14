package task3.utils;

import task3.entity.Author;
import task3.entity.Book;

import java.util.ArrayList;


public class AuthorUtil {
    public Author createAuthor(String name, String telephone, int age) {
        Author author = new Author();
        author.setName(name);
        author.setAge(age);
        author.setTelephone(telephone);
        return author;
    }
}

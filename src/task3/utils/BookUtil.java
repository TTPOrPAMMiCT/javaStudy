package task3.utils;

import task3.entity.Author;
import task3.entity.Book;

import java.util.ArrayList;

public class BookUtil {
    public Book createBook(String name, int amountList, Author author) {
        Book book = new Book();
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(author);
        book.setAuthors(authors);
        book.setName(name);
        book.setAmountList(amountList);
        return book;
    }
}

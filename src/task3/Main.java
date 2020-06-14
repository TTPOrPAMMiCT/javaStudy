package task3;

import task3.entity.Author;
import task3.entity.Book;
import task3.entity.Student;
import task3.utils.AuthorUtil;
import task3.utils.BookUtil;
import task3.utils.StudentUtil;

public class Main {

    public static void main(String[] args) {
        AuthorUtil authorUtil = new AuthorUtil();
        Author author = authorUtil.createAuthor("aristotel", "375", 65);
        BookUtil bookUtil = new BookUtil();
        Book book = bookUtil.createBook("chipolino", 21115, author);

        StudentUtil studentUtil = new StudentUtil();
        Student student = studentUtil.createStudent("gggg", "80", 15, book);
        System.out.println(student);
    }
}

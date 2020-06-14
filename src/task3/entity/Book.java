package task3.entity;

import java.util.ArrayList;

public class Book {
    public String name;
    public ArrayList<Author> authors;
    public int amountList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public int getAmountList() {
        return amountList;
    }

    public void setAmountList(int amountList) {
        this.amountList = amountList;
    }
    @Override
    public String toString() {
        return "Book{ " + "name = " + name +
                "\n   authors = " + authors +
                "   amountList = " + amountList + " }";
    }
}

package SystemObjekts;

public class Book {
    public String name;
    public String bookAuthor;
    public int amountList;

    public Book(String name, String bookAuthor, int amountList) {
        this.name = name;
        this.bookAuthor = bookAuthor;
        this.amountList = amountList;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", amountList=" + amountList +
                '}';
    }
}

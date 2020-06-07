package SystemObjekts;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("gop", "kolas", 200);
        System.out.println(book);

        Student student = new Student("zzz", "+375", 15);
        System.out.println(student);

        Author author = new Author("ggg","80", 20);
        System.out.println(author);
    }
}

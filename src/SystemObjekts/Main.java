package SystemObjekts;

public class Main {

    public static void main(String[] args) {
        Parameters people = new Parameters();

        people.setAge(15);
        people.setId(1);
        people.setName("Vlad");
        people.Enter();

        Parameters book = new Parameters();

        book.setId(3);
        book.setAge(12);
        book.setName("Chipolino");
        book.Enter();

        Parameters author = new Parameters();

        author.setName("Kolas");
        author.setId(2);
        author.setAge(45);
        author.Enter();
    }
}

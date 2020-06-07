package house;

public class Chek {

    public boolean chek(int number) {

        boolean exit = true;
        if (number < 0) {
            System.out.println("the number cannot be negative");
            exit = false;
        } else {
            exit = true;
        }
        return exit;
    }
}
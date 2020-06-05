package house;

public class Chek {

    public Chek chek(int number) {
        boolean exit = true;
        do {
            if (number < 0) {
                System.out.println("Array size cannot be negative");
                exit = false;
            } else {
                exit = true;
            }
        } while (!exit);
        return chek(number);
    }
}
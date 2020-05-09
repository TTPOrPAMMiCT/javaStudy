import java.util.ArrayList;
import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;
        int quantityFlat = scanner.nextInt();

        do {
            if (quantityFlat < 0) {
                System.out.println("Array size cannot be negative");
                exit = false;
            } else {
                exit = true;
            }
        } while (!exit);

        for (int i = 0; i < quantityFlat; i++) {
            int rooms = (int) (Math.random() * 5) + 1;
            array.add(rooms);
        }

        for (int i = 0; i < quantityFlat; i++) {
            int quantity = i + 1;
            System.out.println("Quantity flat  " + quantity + "    quantity rooms  " + array.get(i));
        }
    }
}

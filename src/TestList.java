import java.util.LinkedList;
import java.util.Scanner;

public class TestList {
    public static void main(String[] args) {
        boolean exit = true;
        Scanner scanner = new Scanner(System.in);
        int listSize;

        do {
            listSize = scanner.nextInt();
            if (listSize < 0) {
                System.out.println("list size cannot be negative");
                exit = false;
            } else {
                exit = true;
            }
        } while (!exit);

        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < listSize; i++) {
            int value = scanner.nextInt();
            list.add(value);
        }

        System.out.println(list);
    }
}
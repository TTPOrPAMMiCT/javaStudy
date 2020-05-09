import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        boolean exit = true;
        Scanner scanner = new Scanner(System.in);
        int arraySize;

        do {
            arraySize = scanner.nextInt();
            if (arraySize < 0) {
                System.out.println("отрицательным массив не может быть");
                exit = false;
            } else {
                exit = true;
            }
        } while (!exit) ;
            int[] array = new int[arraySize];

            for (int i = 0; i < arraySize; i++) {
                array[i] = scanner.nextInt();
            }

            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
}
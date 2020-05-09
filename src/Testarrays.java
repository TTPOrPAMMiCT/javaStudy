import java.util.ArrayList;
import java.util.Scanner;

public class Testarrays {
    public static void main(String[] args) {
        int exit;
        int valueArray;
        ArrayList<Integer> array = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int sizeArray = scanner
                .nextInt();
        do {
            if (sizeArray < 0 ) {
                System.out.println("отрицательным массив не может быть");
                exit = 0;
                sizeArray = scanner.nextInt();
            }
            else {
                exit = 1;
            }
        } while (exit != 1);

        for (int i = 0; i < sizeArray; i++) {
            System.out.println("введите " + i + "-ое число" );
            valueArray = scanner.nextInt();
            array.add(valueArray);
        }
        for (int j = 0; j < sizeArray; j++) {
            System.out.println(array
                    .get(j));
        }
    }
}

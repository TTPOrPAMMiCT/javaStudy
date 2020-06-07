package house;

import java.util.ArrayList;
import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        ArrayList<Flats> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int operation = 0;
        while (operation != 4) {

            System.out.println("1 create flat, 2 information about flat, 3 delete flat, sorter flats ");
            operation =  scanner.nextInt();

            switch (operation){
                case 1 :
                    System.out.println("What amount flat?");

                    int amountFlats = scanner.nextInt();
                    for (int i = 0; i < amountFlats; i++) {
                        int numberFlat = i + 1;
                        FlatUtils flat = new FlatUtils();
                    }
                    break;

                case 2 :
                    System.out.println("Information about flats");
                    for (int i = 0; i < array.size(); i++) {
                        System.out.println(array.get(i));
                    }
                    break;

                case 3 :
                    System.out.println("What remove flat?");
                    int idFlat = scanner.nextInt();
                    array.remove(idFlat);
                    break;
            }
        }
    }
}
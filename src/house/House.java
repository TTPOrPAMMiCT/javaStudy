package house;

import java.util.ArrayList;
import java.util.Scanner;


public class House {

    public static void main(String[] args) {
        ArrayList<Flat> flats = new ArrayList<>();
        HouseOperations houseOperations = new HouseOperations();
        Scanner scanner = new Scanner(System.in);
        int idFlat = 0;
        int amountPeople;
        int performance = 0;

        while (performance != 6) {
            System.out.println("1 посмотреть квартиры, \n2 создать квартиру, \n3 квартира по id, \n4 квартира с наибольшим количеством жильцов,\n5 шифровка/дешифровка, \n6 выход");
            System.out.println();
            performance = scanner.nextInt();

            switch (performance) {

                case 1: {
                    for (int i = 0; i < flats.size(); i++) {
                        int numberFlat = i + 1;
                        if (flats.get(i) instanceof FlatSpook) {
                            System.out.print("Квартира " + numberFlat);
                            System.out.println("******");
                        } else {
                            System.out.print("Квартира " + numberFlat + " ");
                            System.out.println(flats.get(i));
                        }
                    }
                    break;
                }
////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case 2: {
                    System.out.println("1 обычная квартира, 2 квартира шпион");
                    int typeFlat = scanner.nextInt();
                    if (typeFlat < 3) {

                        switch (typeFlat) {

                            case 1: {
                                System.out.println("введите количество жильцов");
                                amountPeople = scanner.nextInt();
                                flats.add(idFlat, houseOperations.createFlat(amountPeople));
                                idFlat++;
                                break;
                            }

                            case 2: {
                                System.out.println("введите количесво жильцов");
                                amountPeople = scanner.nextInt();
                                System.out.println("введите пароль");
                                String password = scanner.next();
                                flats.add(idFlat, houseOperations.createFlatSpook(amountPeople, password));
                                break;
                            }
                        }

                    } else {
                        System.out.println("неверное число!");
                    }

                    break;
                }
////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case 3: {
                    System.out.print("введите id квартиры = ");
                    idFlat = scanner.nextInt();
                    System.out.println();
                    if (flats.get(idFlat) instanceof FlatSpook) {
                        System.out.println("******");
                        System.out.println("Если желате получить квартиру, введите 1");
                        int getFlat = scanner.nextInt();

                        if (1 == getFlat) {
                            System.out.print("введите пароль = ");
                            FlatSpook flatSpook = (FlatSpook) flats.get(idFlat);
                            String writePassword = scanner.next();
                            String flatPassword = flatSpook.getPassword();
                            System.out.println();

                            if (flatPassword.equals(writePassword)) {
                                System.out.println("amount people" + flatSpook.getAmountPeople());
                            }
                        }
                    } else {
                        System.out.println(flats.get(idFlat));
                    }
                }
////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case 4:
////////////////////////////////////////////////////////////////////////////////////////////////////////////
                {
                    int maxPeople = 0;
                    int getPeople;
                    int i = 0;
                    while (i != flats.size()) {
                        Flat flat = flats.get(i);
                        if (flat instanceof FlatSpook) {

                            } else {
                            getPeople = flat.getAmountPeople();

                            if (maxPeople < getPeople) {
                                maxPeople = getPeople;
                            }
                        }
                        i++;
                    }
                    System.out.println(maxPeople);
                }
////////////////////////////////////////////////////////////////////////////////////////////////////////////
                case 5:
////////////////////////////////////////////////////////////////////////////////////////////////////////////
                {
                    System.out.println("1 шифровка, 2 дешифровка");
                    int operation = scanner.nextInt();
                    switch (operation) {
                        case 1:
                        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        {
                            System.out.print("введите строку для шифровки: ");
                            String stringSpook = scanner.next();
                            System.out.print("введите ключ шифровки: ");
                            int key = scanner.nextInt();
                            String readyEncryption = houseOperations.encryption(stringSpook, key);
                            System.out.println(readyEncryption);
                        }
                        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        case 2:
                        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        {
                            System.out.print("введите строку для дешифровки: ");
                            String decryptionString = scanner.next();
                            System.out.print("введите ключ шифровки: ");
                            int key = scanner.nextInt();
                            String readyDecryption = houseOperations.encryption(decryptionString, key);
                            System.out.println(readyDecryption);
                        }
                        ////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    }
                }
////////////////////////////////////////////////////////////////////////////////////////////////////////////
            }
        }
    }
}

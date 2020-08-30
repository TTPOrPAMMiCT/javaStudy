package house;

import java.util.Scanner;

public class HouseOperations {

    public Flat createFlat(int amountPeople) {
     Flat flat = new Flat();
     flat.setAmountPeople(amountPeople);
     return flat;
    }

    public FlatSpook createFlatSpook(int amountPeople, String password) {
        FlatSpook flatSpook = new FlatSpook();
        flatSpook.setAmountPeople(amountPeople);
        flatSpook.setPassword(password);
        return flatSpook;
    }

    public String encryption (String stringSpook, int key) {
        char[] readyString = new char[stringSpook.length()];
        char[][] lineCharacter = new char[stringSpook.length()][key];

        int yAxisControl = 1;
        int positionX = 0;
        int positionY = 0;
        for (int i = 0; i < lineCharacter.length; i++) {
            if (positionY >= key - 1) {
                yAxisControl = -1;
            }
            if (positionY == 0) {
                yAxisControl = 1;
            }

            if (stringSpook.charAt(positionX) == ' '){
                stringSpook.replace('\0', '_');
            }

            lineCharacter[positionX][positionY] = stringSpook.charAt(positionX);
            positionX++;
            positionY += yAxisControl;
        }

        /*System.out.println(lineCharacter.length);
        for (int i = 0; i < key; i++) {
            for (int j = 0; j < lineCharacter.length; j++) {
                System.out.print(lineCharacter[j][i] + "\t");
            }
            System.out.println();
        }*/

        int id = 0;
        for (int i = 0; i < key; i++) {
            for (int j = 0; j < lineCharacter.length; j++) {
                if (lineCharacter[j][i] != '\0') {
                    readyString[id] = lineCharacter[j][i];
                    id++;
                }
            }
        }

        return new String(readyString);
    }

    public String decryption(String decryptionString, int key) {
        char[][] lineDecryption = new char[decryptionString.length()][key];

        char placeLetters = '*';
        int yAxisControl = 1;
        int positionX = 0;
        int positionY = 0;
        for (int i = 0; i < decryptionString.length(); i++) {
            if (positionY >= key - 1) {
                yAxisControl = -1;
            }

            if (positionY == 0) {
                yAxisControl = 1;
            }

            lineDecryption[positionX][positionY] = placeLetters;
            positionX++;
            positionY += yAxisControl;
        }

        int idWord = 0;
        for (int i = 0; i < key; i++) {
            for (int j = 0; j < lineDecryption.length; j++) {
                if (lineDecryption[j][i] == placeLetters) {
                    lineDecryption[j][i] = decryptionString.charAt(idWord);
                    idWord++;
                }
            }
        }

        for (int i = 0; i < key; i++) {
            for (int j = 0; j < lineDecryption.length; j++) {
                System.out.print(lineDecryption[j][i] + "\t");
            }
            System.out.println();
        }

        char[] readyDecryption = new char[decryptionString.length()];
        positionX = 0;
        positionY = 0;
        for (int i = 0; i < lineDecryption.length; i++) {
            if (positionY >= key - 1) {
                yAxisControl = -1;
            }
            if (positionY == 0) {
                yAxisControl = 1;
            }


            readyDecryption[positionX] = lineDecryption[positionX][positionY];
            positionX++;
            positionY += yAxisControl;
        }

        return new String(readyDecryption);
    }
}

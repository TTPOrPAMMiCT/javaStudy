package caesarscode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int numberOfСharacterСhanges = scanner.nextInt();

        Scrambler scrambler = new Scrambler();
        String cipherText = scrambler.encryption(string, numberOfСharacterСhanges);
        System.out.println(cipherText);
        String decryptedText = scrambler.decryption(cipherText, numberOfСharacterСhanges);
        System.out.println(decryptedText);
    }
}

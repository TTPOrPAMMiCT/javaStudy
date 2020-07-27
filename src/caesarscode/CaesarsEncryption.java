package caesarscode;


import java.util.Scanner;

public class CaesarsEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char[] lineCharacters = new char[string.length()];
        string.getChars(0, string.length(), lineCharacters, 0);

        int alpabetSize = 33;
        int alpabetIdEnd = 32;
        char[] uppercaseChars = {
                'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й',
                'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф',
                'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'
        };
        char[] lowercaseChars = {
                'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й',
                'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф',
                'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'
        };

        int countOfCharacter = scanner.nextInt();

        for (int i = 0; i < lineCharacters.length; i++) {
            Character check = lineCharacters[i];

            if (Character.isUpperCase(lineCharacters[i])) {

                int seachId = 0;
                while (true) {

                    if (seachId > alpabetIdEnd) {
                        break;
                    }

                    if (check == uppercaseChars[seachId]) {
                        int id = seachId;

                        if (id + countOfCharacter > alpabetSize) {
                            id = (id + countOfCharacter) % alpabetSize;
                            lineCharacters[i] = lowercaseChars[id];
                        } else {
                            lineCharacters[i] = lowercaseChars[id + countOfCharacter];
                        }

                        lineCharacters[i] = uppercaseChars[id + countOfCharacter];

                        break;

                    } else {
                        seachId++;

                    }
                }

            } else {

                int seachId = 0;
                while (true) {

                    if (seachId > alpabetIdEnd) {
                        break;
                    }

                    if (check == lowercaseChars[seachId]) {
                        int id = seachId;

                        if (id + countOfCharacter > alpabetSize) {
                            id = (id + countOfCharacter) % alpabetSize;
                            lineCharacters[i] = lowercaseChars[id];
                        } else {
                            lineCharacters[i] = lowercaseChars[id + countOfCharacter];
                        }

                        break;

                    } else {
                        seachId++;
                    }
                }
            }
        }
        for (int j = 0; j < lineCharacters.length; j++) {
            System.out.print(lineCharacters[j]);
        }
    }
}
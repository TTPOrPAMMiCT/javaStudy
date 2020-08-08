package caesarscode;

public class Scrambler {

    public String encryption(String string, int numberOfСharacterСhanges) {
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


        for (int i = 0; i < lineCharacters.length; i++) {
            Character check = lineCharacters[i];


            if (Character.isUpperCase(lineCharacters[i])) {

                int seachId = 0;
                for (int j = 0; j < alpabetSize; j++) {


                    if (check == uppercaseChars[seachId]) {
                        int id = seachId;

                        if (id + numberOfСharacterСhanges > alpabetIdEnd) {
                            id = (id + numberOfСharacterСhanges) % alpabetSize;
                            lineCharacters[i] = lowercaseChars[id];
                        } else {
                            lineCharacters[i] = lowercaseChars[id + numberOfСharacterСhanges];
                        }

                        lineCharacters[i] = uppercaseChars[id + numberOfСharacterСhanges];


                    } else {
                        seachId++;

                    }
                }

            } else {

                int seachId = 0;
                for (int j = 0; j < alpabetSize; j++) {


                    if (check == lowercaseChars[seachId]) {
                        int id = seachId;

                        if (id + numberOfСharacterСhanges > alpabetIdEnd) {
                            id = (id + numberOfСharacterСhanges) % alpabetSize;
                            lineCharacters[i] = lowercaseChars[id];
                        } else {
                            lineCharacters[i] = lowercaseChars[id + numberOfСharacterСhanges];
                        }


                    } else {
                        seachId++;
                    }
                }
            }
        }
        String finishEncryption = new String(lineCharacters);
        return finishEncryption;
    }

    public String decryption(String string, int numberOfСharacterСhanges) {
        char[] lineCharacters = new char[string.length()];
        string.getChars(0, string.length(), lineCharacters, 0);

        int alpabetSize = 33;
        int alpabetIdEnd = 32;
        int alpabetStart = 0;
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

        for (int i = 0; i < lineCharacters.length; i++) {
            Character check = lineCharacters[i];


            if (Character.isUpperCase(lineCharacters[i])) {

                int seachId = 0;
                for (int j = 0; j < alpabetSize; j++) {


                    if (check == uppercaseChars[seachId]) {
                        int id = seachId;

                        if (id - numberOfСharacterСhanges < alpabetStart) {
                            id = Math.abs(id - numberOfСharacterСhanges);
                            id = alpabetSize - id;
                            lineCharacters[i] = lowercaseChars[id];
                        } else {
                            lineCharacters[i] = lowercaseChars[id - numberOfСharacterСhanges];
                        }

                        lineCharacters[i] = uppercaseChars[id - numberOfСharacterСhanges];


                    } else {
                        seachId++;
                    }
                }

            } else {

                int seachId = 0;
                for (int j = 0; j < alpabetSize; j++) {


                    if (check == lowercaseChars[seachId]) {
                        int id = seachId;

                        if (id - numberOfСharacterСhanges < alpabetStart) {
                            id = Math.abs(id - numberOfСharacterСhanges);
                            id = alpabetSize - id;
                            lineCharacters[i] = lowercaseChars[id];
                        } else {
                            lineCharacters[i] = lowercaseChars[id - numberOfСharacterСhanges];
                        }


                    } else {
                        seachId++;
                    }
                }
            }
        }
        String finishDecryption = new String(lineCharacters);
        return finishDecryption;
    }
}

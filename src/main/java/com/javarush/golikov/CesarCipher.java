package com.javarush.golikov;

import java.util.ArrayList;
import java.util.List;

public class CesarCipher {
    private final char[] alphabet;
    Validator validator = new Validator();

    public CesarCipher(char[] alphabet) {
        this.alphabet = alphabet;
    }

    // Логика шифрования
    public String encrypt(String text, int shift) {
        int charPosition;
        char[] result = new char[text.length()];
        if (validator.isValidKey(shift, alphabet)) {
            List<Character> charList = new ArrayList<>();
            for (char c : alphabet) {
                charList.add(c);
            }
            char[] textFromFile = text.toLowerCase().toCharArray();
            for (int i = 0; i < textFromFile.length; i++) {
                if (charList.contains(textFromFile[i])) {
                    charPosition = charList.indexOf(textFromFile[i]);
                    result[i] = alphabet[(charPosition + shift) % charList.size()];
                } else result[i] = textFromFile[i];
            }
        } else System.out.println("Неверный ключ шифрования");

        return new String(result);

    }
    public String decrypt(String encryptedText, int shift) {
        int charPosition;
        char[] result = new char[encryptedText.length()];
        if (validator.isValidKey(shift, alphabet)) {
            List<Character> charList = new ArrayList<>();
            for (char c : alphabet) {
                charList.add(c);
            }
            char[] textFromFile = encryptedText.toLowerCase().toCharArray();
            for (int i = 0; i < textFromFile.length; i++) {
                if (charList.contains(textFromFile[i])) {
                    charPosition = charList.indexOf(textFromFile[i]);
                    if (charPosition < shift) {
                        result[i] = alphabet[(charList.size() - Math.abs(charPosition - shift) % charList.size())];
                    } else result[i] = alphabet[(charPosition - shift) % charList.size()];
                } else result[i] = textFromFile[i];
            }
        } else System.out.println("Неверный ключ шифрования");

        return new String(result);
        // Логика расшифровки
    }
}
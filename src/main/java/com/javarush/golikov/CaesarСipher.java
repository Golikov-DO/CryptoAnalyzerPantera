package com.javarush.golikov;

public class CaesarСipher {
    private static final char[] ALPHABET = {'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з',
            'и','к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '};
    private char[] inputText;

    public CaesarСipher(char[] inputText) {
        this.inputText = inputText;
    }
    public String encrypt(String text, int shift) {
        return null;
        // Логика шифрования
    }
    public String decrypt(String encryptedText, int shift) {
        return null;
        // Логика расшифровки
    }
}

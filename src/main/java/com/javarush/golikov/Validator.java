package com.javarush.golikov;

import java.nio.file.Files;
import java.nio.file.Path;

public class Validator {
    public boolean isValidKey(int key, char[] alphabet) {
        return (key > 0 && key < alphabet.length);
        // Проверка ключа
    }
    public boolean isFileExists(String filePath) {
        return !Files.exists(Path.of(filePath));
        // Проверка существования файла
    }
}

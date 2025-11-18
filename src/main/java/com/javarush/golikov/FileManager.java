package com.javarush.golikov;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {

    // Логика чтения файла
    public String readFile(String filePath) {
        String fileContent;
        Path path = Paths.get(filePath);
        try {
            byte[] encoded = Files.readAllBytes(path);
            fileContent = new String(encoded, StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fileContent;
    }

    // Логика записи файла
    public void writeFile(String content, String filePath) {
            Path path = Paths.get(filePath);
            try {
                Files.write(path, content.getBytes());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

    }
}

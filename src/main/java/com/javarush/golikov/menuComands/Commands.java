package com.javarush.golikov.menuComands;

import com.javarush.golikov.constatnts.Constants;
import com.javarush.golikov.entite.Result;
import com.javarush.golikov.exception.ApplicationExceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public abstract class Commands implements MenuCommands {
    public Result doCommand(String source, String target, int key) {
        Path sourceFile = Path.of(source);
        Path targetFile = Path.of(target);

        try (BufferedReader fileReader = Files.newBufferedReader(sourceFile);
             BufferedWriter fileWriter = Files.newBufferedWriter(targetFile)) {
            int value;
            int length = Constants.ALPHABET.length;
            while ((value = fileReader.read()) > -1) {
                char character = (char) value;
                character = Character.toLowerCase(character);
                if (Constants.ALPHABET_LIST.contains(character)) {
                    int index = Constants.ALPHABET_LIST.indexOf(character);
                    index = (index + key + Math.abs(key) * length) % length;
                    fileWriter.write(Constants.ALPHABET[index]);
                } else if (character == '\n') {
                    fileWriter.write(character);
                }
            }
        } catch (IOException e) {
            throw new ApplicationExceptions("Файл не найден" + e.getMessage(), e);
        }
        return new Result(this.getClass().getSimpleName(), "Ok");
    }
}

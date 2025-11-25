package com.javarush.golikov.menuComands;

import com.javarush.golikov.constatnts.Constants;
import com.javarush.golikov.entite.Result;
import com.javarush.golikov.exception.ApplicationExceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BruteForce extends Commands {
    @Override
    public Result execute(String[] parametrises) {
        String source = parametrises[0];
        if (Files.isDirectory(Path.of(source))) {
            source += "output.txt";
        }
        String target = parametrises[1];
        if (Files.isDirectory(Path.of(target))) {
            target += "bfresult.txt";
        }
        int bestKey = 0;
        int bestSpaceCount = 0;
        char space = ' ';
        for (int key = 0; key < Constants.ALPHABET.length; key++) {
            int spaceCount = countCharInFileWithKey(source, key, space);
            if (spaceCount > bestSpaceCount) {
                bestSpaceCount = spaceCount;
                bestKey = key;
            }
        }
        return doCommand(source, target, bestKey);
    }

    private int countCharInFileWithKey(String encryptedFilename, int key, char fixChar) {
        int spaceCount = 0;
        Path path = Path.of(encryptedFilename);
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            int value;
            while ((value = reader.read()) > -1) {
                char character = (char) value;
                if (Constants.ALPHABET_LIST.contains(character)) {
                    int index = Constants.ALPHABET_LIST.indexOf(character);
                    index = (index + key + Constants.ALPHABET.length) % Constants.ALPHABET.length;
                    if (Constants.ALPHABET[index] == fixChar) {
                        spaceCount++;
                    }
                }
            }
        } catch (IOException e) {
            throw new ApplicationExceptions("Файл не найден" + encryptedFilename, e);
        }
        return spaceCount;
    }
}

package com.javarush.golikov.menuComands;

import com.javarush.golikov.entite.Result;
import com.javarush.golikov.exception.ApplicationExceptions;

import java.nio.file.Files;
import java.nio.file.Path;

public class Decoding extends Commands {

    @Override
    public Result execute(String[] parametrises) {
        String source = parametrises[0];
        if (Files.isDirectory(Path.of(source))) {
            source += "output.txt";
        }
        String target = parametrises[1];
        if (Files.isDirectory(Path.of(target))) {
            target += "decoding.txt";
        }
        int key;
        try {
            key = Integer.parseInt(parametrises[2]);
        } catch (NumberFormatException e) {
            throw new ApplicationExceptions("Неверный ключ");
        }
        return doCommand(source, target, key * -1);
    }
}

package com.javarush.golikov.menuComands;

import com.javarush.golikov.constatnts.Constants;
import com.javarush.golikov.entite.Result;

public class Encryption implements MenuCommands {

    @Override
    public Result execute(String[] parametrises) {
        int length = Constants.ALPHABET.length;
        return new Result("Шифрование завершено " + length + " букв", "Ok");
    }
}

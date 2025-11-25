package com.javarush.golikov.menuComands;

import com.javarush.golikov.entite.Result;

public class Encryption implements MenuCommands {

    @Override
    public Result execute(String result) {
        return new Result("Encrypted Result", result);
    }
}

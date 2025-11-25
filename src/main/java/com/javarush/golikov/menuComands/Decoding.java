package com.javarush.golikov.menuComands;

import com.javarush.golikov.entite.Result;

public class Decoding implements MenuCommands {

    @Override
    public Result execute(String[] parametrises) {
        return new Result("Дешифрование завершено", "Ok");
    }
}

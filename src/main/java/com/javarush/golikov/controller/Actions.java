package com.javarush.golikov.controller;

import com.javarush.golikov.exception.ApplicationExceptions;
import com.javarush.golikov.menuComands.BruteForce;
import com.javarush.golikov.menuComands.MenuCommands;
import com.javarush.golikov.menuComands.Decoding;
import com.javarush.golikov.menuComands.Encryption;

import java.util.HashMap;
import java.util.Map;

public class Actions {

    private final Map<Integer, MenuCommands> actionMap = new HashMap<>();

    public Actions() {
        actionMap.put(0,new Encryption());
        actionMap.put(1,new Decoding());
        actionMap.put(2, new BruteForce());
    }

    public MenuCommands findAction(int actionIndex) {
        if (actionMap.containsKey(actionIndex)) {
            try {
                return actionMap.get(actionIndex);
            } catch (IllegalArgumentException e) {
                throw new ApplicationExceptions("Пункт меню не реализован!", e);
            }
        } else throw new ApplicationExceptions("Пункт меню не реализован!");
    }
}

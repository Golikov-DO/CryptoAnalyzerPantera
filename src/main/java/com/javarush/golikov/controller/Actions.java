package com.javarush.golikov.controller;

import com.javarush.golikov.menuComands.MenuCommands;
import com.javarush.golikov.menuComands.Decoding;
import com.javarush.golikov.menuComands.Encryption;

import java.util.HashMap;
import java.util.Map;

public class Actions {
    private MenuCommands menuCommands;
    private final Map<Integer, MenuCommands> actionMap = new HashMap<>();

    public Actions() {
        actionMap.put(1,new Encryption());
        actionMap.put(2,new Decoding());
    }

    public MenuCommands findAction(int actionName) {
        MenuCommands menuCommands = null;
        if (actionMap.containsKey(actionName))
            menuCommands = actionMap.get(actionName);
        return menuCommands;
    }
}

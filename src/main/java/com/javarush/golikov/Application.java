package com.javarush.golikov;

import com.javarush.golikov.controller.Controller;
import com.javarush.golikov.entite.Result;

public class Application {
    private final Controller controller;
    private final int menuItem;
    private final String[] parametrises;

    public Application(int menuItem, String[] parametrises) {
        controller = new Controller();
        this.menuItem = menuItem;
        this.parametrises = parametrises;
    }

    public Result run() {
        return controller.doAction(menuItem, parametrises);
    }
}

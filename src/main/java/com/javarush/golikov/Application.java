package com.javarush.golikov;

import com.javarush.golikov.controller.Controller;
import com.javarush.golikov.entite.Result;
import com.javarush.golikov.view.ShowMenu;

public class Application {
    private final Controller controller = new Controller();
    private final ShowMenu showMenu = new ShowMenu();

    public Result run() {
        int menuIndex = showMenu.getMenuItem();
        String[] parametrises = showMenu.getParameterises(menuIndex == 0 || menuIndex == 1);
        return controller.doAction(menuIndex, parametrises);
    }
}

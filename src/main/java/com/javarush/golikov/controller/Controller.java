package com.javarush.golikov.controller;

import com.javarush.golikov.entite.Result;
import com.javarush.golikov.exception.ApplicationExceptions;
import com.javarush.golikov.menuComands.MenuCommands;


public class Controller {
    public Result doAction(int actionNumber, String[] parametrises)  {
        Actions actions = new Actions();
        try{
            MenuCommands menuCommands = actions.findAction(actionNumber);
            return menuCommands.execute(parametrises);
        } catch (IllegalArgumentException | ApplicationExceptions e) {
            return new Result(e.getMessage(), "Error");
        }
    }
}

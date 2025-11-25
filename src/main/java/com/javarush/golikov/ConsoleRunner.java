package com.javarush.golikov;

import com.javarush.golikov.entite.Result;

public class ConsoleRunner {
    public static void main(String[] args) {
        String[] parametrises = {"inn file", "Out file"};
    Application application = new Application(1,parametrises);
    Result result = application.run();
    System.out.println(result);
    }
}

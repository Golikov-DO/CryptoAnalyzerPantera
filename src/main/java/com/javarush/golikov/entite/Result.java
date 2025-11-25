package com.javarush.golikov.entite;

public record Result(String message, String resultCode) {

    @Override
    public String toString() {
        return "Result{" +
                "message='" + message + '\'' +
                ", resultCode='" + resultCode + '\'' +
                '}';
    }
}

package com.javarush.golikov.entite;

public class Result {
private final String message;
private final String resultCode;

public Result(String message, String resultCode){
    this.message = message;
    this.resultCode = resultCode;
}

    @Override
    public String toString() {
        return "Result{" +
                "message='" + message + '\'' +
                ", resultCode='" + resultCode + '\'' +
                '}';
    }
}

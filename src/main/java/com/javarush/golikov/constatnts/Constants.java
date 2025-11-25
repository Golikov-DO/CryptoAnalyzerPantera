package com.javarush.golikov.constatnts;

public class Constants {
    private static final String ruAlphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЭЬЭЮЯ";
    private static final String specialCharacters = "\n.,”’:-!? ";
    
    public static final char[] ALPHABET = (ruAlphabet + specialCharacters).toCharArray();
}

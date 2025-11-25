package com.javarush.golikov.constatnts;

import java.io.File;

public class Constants {
    private static final String ruAlphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЭЬЭЮЯ";
    private static final String specialCharacters = "\n.,”’:-!? ";
    
    public static final char[] ALPHABET = (ruAlphabet + specialCharacters).toCharArray();
    public static final String DEFAULT_FOLDER = System.getProperty("user.dir") + File.separator + "text" +  File.separator;
}

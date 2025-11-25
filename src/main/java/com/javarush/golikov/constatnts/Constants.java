package com.javarush.golikov.constatnts;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Constants {
    private static final String ruAlphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
    private static final String specialCharacters = "\n.,\":-!? ";
    
    public static final char[] ALPHABET = (ruAlphabet.toLowerCase() + specialCharacters).toCharArray();
    public static final String DEFAULT_FOLDER = System.getProperty("user.dir") + File.separator + "text" +  File.separator;

    public static final List<Character> ALPHABET_LIST = new ArrayList<>();

    static {
        for(Character simbol : ALPHABET) ALPHABET_LIST.add(simbol);
    }
}

package com.javarush.golikov;

import java.util.Scanner;

public class ConsoleRunner {
    private static final char[] ALPHABET = {'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з',
            'и','к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '};

    public static void main(String[] args) {
        int selectedItem;
        Scanner sc = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("1. Шифрование");
        System.out.println("2. Расшифровка с ключом");
        System.out.println("3. Brute force");
        System.out.println("4. Статистический анализ");
        System.out.println("0. Выход");
        System.out.println("-------------------------");
        selectedItem = sc.nextInt();
        if (selectedItem < 0 || selectedItem > 4) {
            System.out.println("Введено неверное значение");
        } else {
            switch (selectedItem) {
                case 0 -> System.exit(0);
                case 1 -> System.out.println("1");
                case 2 -> System.out.println("2");
                case 3 -> System.out.println("Не реализованно");
                case 4 -> System.out.println("Не реализованно");
            }
            sc.close();
        }
    }
}

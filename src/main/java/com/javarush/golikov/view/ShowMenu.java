package com.javarush.golikov.view;

import com.javarush.golikov.constatnts.Constants;

import java.util.Scanner;


public class ShowMenu {
    private final Scanner scanner = new Scanner(System.in);

    public int getMenuItem() {
        int item;
        do {
            System.out.println("Выберите пункт меню\n" +
                    """
                    1. Шифрование
                    2. Дешифровка
                    3. "Brute force"
                    4. Анализ
                    5. Выход
                    """ );
            String input = scanner.nextLine();
            item = switch (input) {
                case "1" -> 0;
                case "2" -> 1;
                case "3" -> 2;
                case "4" -> 3;
                case "5" -> 4;
                default -> {
                    System.out.println("Неверный ввод. Повторите ввод");
                    yield -1;
                }
            };
        } while (item < 0);
        return item;
    }

    public String[] getParameterises(boolean isKeyNeeded) {
        String[] parameterises = new String[3];
        if (isKeyNeeded){
            System.out.println("Введите ключ шифрования/дешифрования");
            parameterises[2] = scanner.nextLine();
        }
        System.out.println("Введите путь исходного файла по умолчанию директория пользователя папка text");
        String innFile = scanner.nextLine();
        parameterises[0] = innFile.isEmpty() ? Constants.DEFAULT_FOLDER :  innFile;
        System.out.println("Введите путь конечного файла по умолчанию директория пользователя папка text");
        String outFile = scanner.nextLine();
        parameterises[1] = outFile.isEmpty() ? Constants.DEFAULT_FOLDER :  innFile;
        return parameterises;
    }
}

package by.home.services;

import java.util.Scanner;

public class Login {
    public static boolean checkLogin(String login) {
        boolean rezult = false;

        boolean rezultBigLetter = Login.checkBigLetter(login);
        boolean rezultNumeral = Login.checkNumeral(login);
        boolean rezultSummLetter = Login.checkCountLetter(login);
        boolean rezultOther = Login.checkOther(login);

        if(rezultBigLetter && rezultNumeral && rezultSummLetter && rezultOther){
            rezult = true;
        }

        return rezult;
    }

    /**
     * Разбивает строку и ищет в ней заглавную букву.
     *
     * @param login строка.
     * @return результат проверки есть ли в троке заглавная буква
     */
    public static boolean checkBigLetter(String login) {
        boolean bol = false;
        for (int i = login.length() - 1; i >= 0; i--) {
            if (Character.isUpperCase(login.charAt(i))) {
                bol = true;
                break;
            }
        }
        return bol;
    }
    /**
     * Разбивает строку и ищет в ней цифры.
     *
     * @param login строка.
     * @return результат проверки есть ли в троке цыфры
     */
    public static boolean checkNumeral(String login) {
        boolean bol1 = false;
        for (int i = login.length() - 1; i >= 0; i--) {
            if (Character.isDigit(login.charAt(i))) {
                bol1 = true;
                break;
            }
        }
        return bol1;
    }
    /**
     * Находит длину строки.
     *
     * @param login строка.
     * @return результат проверки  состоит ли строка от 6 до 16 символов
     */
    public static boolean checkCountLetter(String login) {
        boolean bol2 = false;
        if (login.length() < 17 && login.length() > 5) {
            bol2 = true;
        }
        return bol2;
    }
    /**
     * Проверяет строку на условие
     * в строке могут быть только буквы, цифры, знак нижнего подчёркивания, тире
     *
     * @param login строка.
     * @return результат проверки
     */
    public static boolean checkOther(String login) {
        boolean bol3 = false;
        if (login.matches("[a-zA-Z0-9_\\-]*")) {
            bol3 = true;
        }
        return bol3;
    }
}

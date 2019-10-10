package by.home.services;

import java.util.Scanner;

public class Login {
    public static boolean checkLogin(String login) {
        boolean rezult = false;

        boolean rezultBigLetter = Login.checkBigLetter(login);
        boolean rezultNumeral = Login.checkNumeral(login);
        boolean rezultSummLetter = Login.checkSummLetter(login);
        boolean rezultOther = Login.checkOther(login);

        if(rezultBigLetter == true && rezultNumeral == true && rezultSummLetter == true && rezultOther == true){
            rezult = true;
        }

        return rezult;
    }


    public static boolean checkBigLetter(String login) {
        boolean bol = false;
        for (int i = login.length() - 1; i >= 0; i--) {
            if (Character.isUpperCase(login.charAt(i))) {
                bol = true;
            }
        }
        return bol;
    }

    public static boolean checkNumeral(String login) {
        boolean bol1 = false;
        char[] letter = login.toCharArray();
        for (int i = 0; i < letter.length; i++) {
            int x = (int) letter[i];
            System.out.println(x);
            if (x < 58 && x > 47) {
                bol1 = true;
            }
        }
        return bol1;
    }

    public static boolean checkSummLetter(String login) {
        boolean bol2 = false;
        if (login.length() < 17 && login.length() > 5) {
            bol2 = true;
        }
        return bol2;
    }

    public static boolean checkOther(String login) {
        boolean bol3 = false;
        char[] letter = login.toCharArray();
        for (int i = 0; i < letter.length; i++) {
            int x = (int) letter[i];
            if (x == 45 || x == 95 || (x < 91 && x > 64) || (x < 123 && x > 96) || (x < 47 && x > 58)) {
                bol3 = true;
            }
        }
        return bol3;
    }
}

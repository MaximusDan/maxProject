package com.company;

import by.home.services.FileService;
import by.home.services.Login;
import by.home.services.TextService;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1)Заменяет множественные пробелы на один.
        //ArrayList<String> oldText = FileService.loadFile("D:/file.txt");

        /*ArrayList<String> newTextShow = TextService.replaceSpace(oldText);
        for(int i=0;i<newTextShow.size();i++){
            System.out.println(newTextShow.get(i));
        }
        FileService.saveFile(newTextShow,"D:/file.txt");

*/      /*2) Заменяет слова в коллекции text на звёздочки. Список слов, которые нужно заменить приходят во второй коллекции.
        ArrayList<String> word = FileService.loadFile("D:/word.txt"); //Вызываю метод loadFile
        ArrayList<String> replacementText = TextService.replaceWords(oldText,word);
        for(int i=0;i<replacementText.size();i++){
            System.out.println(replacementText.get(i));
        }
        FileService.saveFile(replacementText,"D:/word.txt");*/

        //3)В метод передаётся коллекция с текстом и слово, которое нужно искать в тексте.

        //String words = "тура";
        //int finishSumm = TextService.quantityWords(oldText,words);
        //System.out.println(finishSumm);

        //4)Разбивает текст на отдельные слова. Знаки препинания и пробелы удаляются.
        // ArrayList<String> newWords = TextService.returnWords(oldText);
        //  for(int i=0;i<newWords.size();i++){
        //     System.out.println(newWords.get(i));
        // }

        //5)Разбивает текст на отдельные предложения. (В изначальной коллекции предложения могут быть перенесены в след элементы).
        //ArrayList<String> newStringCollection = TextService.returnStringCollection(oldText);
       // for(int i=0;i<newStringCollection.size();i++){
          //  System.out.println(newStringCollection.get(i));
         //}

        //6)Получает на вход строку и возвращает её в транслите. т.е. русские буквы меняем на англ при помощи оператора switch.
        //String translateText = TextService.translateText("fqrrrrrrrrrer     ttt");
       //System.out.println(translateText);
        boolean login = true;
        while (login) {
            System.out.println("Введите логин");
            Scanner sc = new Scanner(System.in);
            String str = "";
            if (sc.hasNextLine()) {
                str = sc.nextLine();
            }
            boolean rezultLogin = Login.checkLogin(str);
            if(rezultLogin = true){
                System.out.println("Введите логин еще раз");
                System.out.println("В логине должна быть хотя бы одна заглавная буква");
                System.out.println("В логине должна быть хотя бы одна цифра");
                System.out.println("Логин должен состоять минимум из 6 символов максимум 16");
                System.out.println("В логине могут быть только буквы, цифры, знак нижнего подчёркивания, тире");
            }else{
                login = false;
            }
        }
        System.out.println("Введенный логин заебись");
    }
}



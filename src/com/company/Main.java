package com.company;

import by.home.services.FileService;
import by.home.services.TextService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       //1)Заменяет множественные пробелы на один.
        ArrayList<String> oldText = FileService.loadFile("D:/file.txt"); //Вызываю метод loadFile

        /*ArrayList<String> newTextShow = TextService.firstMethod(oldText); //Вызываю метод firstMethod
        for(int i=0;i<newTextShow.size();i++){
            System.out.println(newTextShow.get(i));
        }
        FileService.saveFile(newTextShow,"D:/file.txt"); //Вызываю метод saveFile

*/      /*2) Заменяет слова в коллекции text на звёздочки. Список слов, которые нужно заменить приходят во второй коллекции.
        ArrayList<String> word = FileService.loadFile("D:/word.txt"); //Вызываю метод loadFile
        ArrayList<String> replacementText = TextService.secondMethod(oldText,word);
        for(int i=0;i<replacementText.size();i++){
            System.out.println(replacementText.get(i));
        }
        FileService.saveFile(replacementText,"D:/word.txt");*/

        //3)В метод передаётся коллекция с текстом и слово, которое нужно искать в тексте.

        String words = "тура";
        int finishSumm = TextService.thirdMethod(oldText,words);
        System.out.println(finishSumm);
    }
}



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
*/

        ArrayList<String> replacementText = TextService.secondMethod(oldText);
        for(int i=0;i<replacementText.size();i++){
            System.out.println(replacementText.get(i));
        }
    }
}



package com.company;

import by.home.services.FileService;
import by.home.services.TextService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> text1 = FileService.loadFile("D:/file.txt");
        //for(int i=0;i<text1.size();i++){
            //System.out.println(text1.get(i));
        //}

        //System.out.println("----------------------------------------");
        ArrayList<String> text2 = TextService.first(text1);

        for(int i=0;i<text1.size();i++){
            System.out.println(text2.get(i));
        }


    }
}



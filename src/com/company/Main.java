package com.company;

import by.home.services.FileService;
import by.home.services.TextService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> oldText = FileService.loadFile("D:/file.txt");

        ArrayList<String> newTextShow = TextService.first(oldText);

        for(int i=0;i<oldText.size();i++){
            System.out.println(newTextShow.get(i));
        }


    }
}



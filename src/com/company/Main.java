package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*1) Создай массив размером [5; 7]. Заполни его рандомными значениями. Выведи массив на консоль.

2)Напиши программа, которая спросит из скольки элементов создать массив(одномерный массив).
Массив будет содержать строки. Затем программа будет запрашивать ввести все слова.
Т.е. каждый элемент массива заполняем с консоли.
	 */

        /*int mas[][] = new int[5][7];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) (Math.random() * 100 + 1);
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }*/


        /*int i = 0;
        String m;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите длину массива");
        if (sc1.hasNextInt()) {
            i = sc1.nextInt();
            String masiv[] = new String[i];
            for (int j = 0; j < masiv.length; j++) {
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Введите слово массива");
                if (sc2.hasNextLine()) {
                    m = sc2.nextLine();
                    masiv[j] = m;
                }
            }
            for (int j = 0; j < masiv.length; j++) {
                System.out.println(masiv[j]);
            }
        }*/


        /*Есть строка в которой хранятся слова, разделённые запятой.
                Например:
        "дом, шкаф, природа, огонь, шкаф, солнце, дом, утюг, шкаф".
                Нужно подсчитать количество повторяющихся слов и вывести на консоль в отсортированном виде, начиная с самого большого числа.
        Например:
        шкаф - 3
        дом - 2
        природа - 1
        и тд.*/
        String s = "дом,шкаф,природа,огонь,шкаф,солнце,дом,утюг,шкаф";
int b=0;
        String[] mas = s.split(","); //разбил строку на слова

        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        list.add(mas[0]);
        list3.add(1);

        for (int i = 1; i < mas.length; i++) {       //заполнил коллекцию неповторяющимися словами
            if (list.contains(mas[i])) {
                b = list.indexOf("дом");

            }else{
                list3.add(1);
            }
        }
        for (int i = 0; i < list.size(); i++) {
                list3.add(i, 1);   //создаю элемент числовой коллекции
                for (int j = 1; j < mas.length; j++) {
                    if (list.get(i) == mas[j]) {       //проверяю есть ли в коллекции слов повторяющиеся слова с массивом
                        b = list3.get(i);
                        b = b + 1;
                        list3.remove(i);
                        list3.add(i, b);
                    }
                }
                b = 0;
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " - " + list3.get(i));
        }

        /*for (int i = 1; i < mas.length; i++) {
            for (int j = 1; j < mas.length; j++) {

            }
            }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list3.size(); j++) {
                if (list.get(i) ==)
            }
        }*/


    }
}



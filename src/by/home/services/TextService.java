package by.home.services;

import java.util.ArrayList;

/**
 * В данном классе находятся методы для работы с текстом.
 *
 * todo: по окончанию разработки перечислить тут все методы с кратким описанием
 */
public class TextService {

    /**
     * Меняет все заглавные буквы в тексте на маленькие.
     *
     * @param text коллекция, содержащая строки с текстом
     * @return результирующая коллекция
     */
    public ArrayList<String> listToLowerCase(ArrayList<String> text){
        return null;
    }

/**
 * Заменяет множественные пробелы на один. (Привер: "Привет друг" -> "Привет друг").
 *
 * @param text коллекция, содержащая строки с текстом
 * @return результирующая коллекция
 */
public static ArrayList<String> firstMethod(ArrayList<String> text) {
    ArrayList<String> newText = new ArrayList<String>();
    for(int i=0;i<text.size();i++){
        String deleteSpace = text.get(i).replaceAll("\\s+", " ");
        newText.add(i,deleteSpace);
    }
    return newText;
}

/**
 * Заменяет слова в коллекции text на звёздочки. Список слов, которые нужно заменить приходят во второй коллекции.
 *
 * @param text коллекция, содержащая строки с текстом
 * @param words коллекция, содержащая список слов, которые нужно заменить в коллекции text
 * @return результирующая коллекция
 */
public static ArrayList<String> secondMethod(ArrayList<String> text, ArrayList<String> words) {

    ArrayList<String> newWords = new ArrayList<String>();
    String[] mas = words.get(0).split(",");
    for (int i = 0; i < mas.length; i++) {
        newWords.add(mas[i]);
    }

    for (int i = 0; i < text.size(); i++) {
        for (int j = 0; j < newWords.size(); j++) {
            if (text.get(i).contains(newWords.get(j))) {
                String newWord = text.get(i).replaceAll(newWords.get(j), "***");
                text.remove(i);
                text.add(i, newWord);
            }
        }
    }
    return text;
}
/**
 * В метод передаётся коллекция с текстом и слово, которое нужно искать в тексте.
 *
 * @return количество найденных слов.
 */
public static int thirdMethod(ArrayList<String> text, String word) {
    //System.out.println(word);
    int summ = 0;
    ArrayList<String> wordCollection = new ArrayList<String>();
    for (int i = 0; i < text.size(); i++) {
        String[] mas = text.get(i).split(" ");
        for (int j = 0; j < mas.length; j++) {
            wordCollection.add(mas[j]);
        }
    }
    for (int i = 0; i < wordCollection.size(); i++) {
        if (wordCollection.get(i).contains(word)) {
            summ++;
        }
    }
    //System.out.println(text.size());
    //System.out.println(summ);
    return summ;
}
/**
 * Разбивает текст на отдельные слова. Знаки препинания и пробелы удаляются.
 *
 * @param text коллекция, содержащая строки с текстом
 * @return коллекция слов
 */
// 4)

/**
 * Разбивает текст на отдельные предложения. (В изначальной коллекции предложения могут быть перенесены в след элементы).
 *
 * @param text коллекция, содержащая строки с текстом
 * @return коллекция предложений в которой каждый элемент равен 1 предложению
 */
// 5)

    /**
     * Получает на вход строку и возвращает её в транслите. т.е. русские буквы меняем на англ при помощи оператора switch.
     */
// 6)
}

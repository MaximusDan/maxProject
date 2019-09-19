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
// 1)
public static ArrayList<String> first(ArrayList<String> text) {
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
// 2)

/**
 * В метод передаётся коллекция с текстом и слово, которое нужно искать в тексте.
 *
 * @return количество найденных слов.
 */
// 3)

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
}

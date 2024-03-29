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
    public ArrayList<String> listToLowerCase(ArrayList<String> text) {
        return null;
    }

    /**
     * Заменяет множественные пробелы на один. (Привер: "Привет друг" -> "Привет друг").
     *
     * @param text коллекция, содержащая строки с текстом
     * @return результирующая коллекция
     */
    public static ArrayList<String> replaceSpace(ArrayList<String> text) {
        ArrayList<String> newText = new ArrayList<String>();
        for (int i = 0; i < text.size(); i++) {
            String deleteSpace = text.get(i).replaceAll("\\s+", " ");
            newText.add(i, deleteSpace);
        }
        return newText;
    }

    /**
     * Заменяет слова в коллекции text на звёздочки. Список слов, которые нужно заменить приходят во второй коллекции.
     *
     * @param text  коллекция, содержащая строки с текстом
     * @param words коллекция, содержащая список слов, которые нужно заменить в коллекции text
     * @return результирующая коллекция
     */
    public static ArrayList<String> replaceWords(ArrayList<String> text, ArrayList<String> words) {

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
     * 3)
     * В метод передаётся коллекция с текстом и слово, которое нужно искать в тексте.
     *
     * @return количество найденных слов.
     */
    public static int quantityWords(ArrayList<String> text, String word) {
        int summ = 0;
        for (int i = 0; i < text.size(); i++) {
            String[] mas = text.get(i).split(" ");
            for (int j = 0; j < mas.length; j++) {
                if (mas[j].equals(word)) {
                    summ++;
                }
            }
        }
        return summ;
    }

    /**
     * Разбивает текст на отдельные слова. Знаки препинания и пробелы удаляются.
     *
     * @param text коллекция, содержащая строки с текстом
     * @return коллекция слов
     */
// 4)
    public static ArrayList<String> returnWords(ArrayList<String> text) {
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> newWords = new ArrayList<String>();
        for (int i = 0; i < text.size(); i++) {
            String deleteSymbol = text.get(i).replaceAll("[\\.\\,\\*\\;]", "");
            words.add(i, deleteSymbol);
        }
        for (int i = 0; i < words.size(); i++) {
            String[] resultsMass = words.get(i).split(" ");
            for (int j = 0; j < resultsMass.length; j++) {
                newWords.add(resultsMass[j]);
            }
        }
        return newWords;
    }

    /**
     * Разбивает текст на отдельные предложения. (В изначальной коллекции предложения могут быть перенесены в след элементы).
     *
     * @param text коллекция, содержащая строки с текстом
     * @return коллекция предложений в которой каждый элемент равен 1 предложению
     */
// 5)
    public static ArrayList<String> returnStringCollection(ArrayList<String> text) {

        ArrayList<String> stringText = new ArrayList<String>();
        String lostText = "";
        for (int i = 0; i < text.size(); i++) {
            String st = text.get(i);
            st = lostText + text.get(i);
            while (st.indexOf(".") != -1) {
                stringText.add(st.substring(0, st.indexOf(".") + 1));
                st = st.substring(st.indexOf(".") + 1);
            }
            lostText = st;
        }
        return stringText;
    }

    /**
     * Получает на вход строку и возвращает её в транслите. т.е. русские буквы меняем на англ при помощи оператора switch.
     */
// 6)
    /*public static String translateText(String text) {
        char[] textSymbol = text.toCharArray();
        String newText = "";
        for (int i = 0; i < textSymbol.length; i++) {
            switch (textSymbol[i]) {
                case 'a':
                    newText = newText + " " + "a";
                    break;
                case 'b':
                    newText = newText + " " + "и";
                    break;
                case 'c':
                    newText = newText + " " + "с";
                    break;
                case 'd':
                    newText = newText + " " + "в";
                    break;
                case 'e':
                    newText = newText + " " + "а";
                    break;
                case 'f':
                    newText = newText + " " + "п";
                    break;
                case 'g':
                    newText = newText + " " + "р";
                    break;
                case 'h':
                    newText = newText + " " + "ш";
                    break;
                case 'i':
                    newText = newText + " " + "о";
                    break;
                case 'j':
                    newText = newText + " " + "л";
                    break;
                case 'k':
                    newText = newText + " " + "д";
                    break;
                case 'l':
                    newText = newText + " " + "ь";
                    break;
                case 'm':
                    newText = newText + " " + "т";
                    break;
                case 'n':
                    newText = newText + " " + "щ";
                    break;
                case 'o':
                    newText = newText + " " + "з";
                    break;
                case 'p':
                    newText = newText + " " + "й";
                    break;
                case 'q':
                    newText = newText + " " + "к";
                    break;
                case 'r':
                    newText = newText + " " + "ы";
                    break;
                case 's':
                    newText = newText + " " + "е";
                    break;
                case 't':
                    newText = newText + " " + "г";
                    break;
                case 'u':
                    newText = newText + " " + "м";
                    break;
                case 'v':
                    newText = newText + " " + "ц";
                    break;
                case 'w':
                    newText = newText + " " + "ч";
                    break;
                case 'x':
                    newText = newText + " " + "н";
                    break;
                case 'y':
                    newText = newText + " " + "я";
                    break;
                case 'z':
                    newText = newText + " " + "я";
                    break;
            }
        }
        return newText;
    }*/
}

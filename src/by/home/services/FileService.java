package by.home.services;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FileService {

    /**
     * Загружает данные из файла и возвращает коллекцию строк, где каждая строка = строке в файле.
     * В случае ошибки чтения из файла возвращает null.
     *
     * @param pathToFile путь к файлу (Привер: D:/newFolder/file.txt)
     */
    public static ArrayList<String> loadFile(String pathToFile) {
        try {
            ArrayList<String> lines = new ArrayList<>();
            Files.lines(Paths.get(pathToFile), StandardCharsets.UTF_8)
                    .forEach(lines::add);

            return lines;

        } catch (IOException e) {
            System.out.println("ERROR: произошла ошибка при чтении файла!");
            return null;
        }
    }

    /**
     * Сохраняет данные в файл. Если файл не существует, то создаётся новый.
     * Если файл имеет данные, то они удаляются и записываются новые.
     *
     * @param lines      коллекция строк, которые будут сохранены в файл
     * @param pathToFile путь к файлу (Привер: D:/newFolder/file.txt)
     */
    public static void saveFile(ArrayList<String> lines, String pathToFile) {
        try {
            Files.write(Paths.get(pathToFile), lines, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("ERROR: произошла ошибка во время записи в файл!");
        }
    }

    /**
     * Добавляет данные в файл. Если файл не существует, то создаётся новый.
     * Если файл имеет данные, то новые данные записываются ниже.
     *
     * @param lines      коллекция строк, которые будут сохранены в файл
     * @param pathToFile путь к файлу (Привер: D:/newFolder/file.txt)
     */
    public static void updateFile(ArrayList<String> lines, String pathToFile) {
        try {
            ArrayList<String> fileContent;
            try {
                fileContent = new ArrayList<>(Files.readAllLines(Paths.get(pathToFile), StandardCharsets.UTF_8));
            } catch (IOException e) {
                fileContent = new ArrayList<>();
            }
            fileContent.addAll(lines);
            Files.write(Paths.get(pathToFile), fileContent, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("ERROR: произошла ошибка во время записи в файл!");
        }
    }
}

package HomeWork02;

import java.io.File;

public class Task2 {
    public static void init(String path) {
        /*2. Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида:
        1 Расширение файла: txt
        2 Расширение файла: pdf
        3 Расширение файла:
        4 Расширение файла: jpg*/

        File dir = new File(path);
        File[] files = dir.listFiles();
        assert files != null;
        for (File file : files) {
            String fileName = file.getName();
            String typeFile = "";
            int j = fileName.lastIndexOf('.');
            if (j > 0) {
                typeFile = fileName.substring(j + 1);
            }
            System.out.println("Расширение файла: " + typeFile);
        }
    }
}

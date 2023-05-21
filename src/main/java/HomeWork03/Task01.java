package HomeWork03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task01 {
    public static void CreateList() {
        /*
        *  1. Создать список типа ArrayList<String>.
        * Поместить в него как строки, так и целые числа.
        * Пройти по списку, найти и удалить целые числа.
        * Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"} -> {"Яблоко", "Апельсин", "Дыня"}
        */
        List<String> list = new ArrayList<>(Arrays.asList("Яблоко", "11", "13", "Апельсин", "Дыня", "17"));
        System.out.println("Исходный: ");
        System.out.println("____________________");
        for (String item : list) {
            System.out.println(item);
        }
        System.out.println("____________________");
        list.removeIf(s -> s.matches("\\d+"));
        System.out.println("Удалили числа: ");
        System.out.println("____________________");
        for (String item : list) {
            System.out.println(item);
        }
        System.out.println("____________________");
    }
}

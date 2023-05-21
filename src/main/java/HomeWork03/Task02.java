package HomeWork03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task02 {
    public static void run() {
        List<ArrayList<String>> list = CreateStoreProductCatalog();
        AddElemInProductCatalog(list, "Детектив", "Лунный камень");
        AddElemInProductCatalog(list, "Классика", "Триумфальная арка");
        AddElemInProductCatalog(list, "Классика", "Три товарища");
        AddElemInProductCatalog(list, "Ужасы", "Сияние");
        AddElemInProductCatalog(list, "Приключения", "Вокруг света за 80 дней");
        AddElemInProductCatalog(list, "Приключения", "Всадник без головы");
        System.out.println(list);
    }
    private static void AddElemInProductCatalog(List<ArrayList<String>> dataBase, String genre, String name) {
        /*
         * 2. Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
         * что на нулевой позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
         * Напишите метод для заполнения данной структуры(можно через консоль).
         * Пример:
         * "Классика", "Преступление и наказание", "Война и мир", "Анна Каренина".
         * "Научная фантастика", "Солярис", "Ночной дозор", "Братья Стругацкие".
         * "Детектив", "Десять негритят".
         * "Фантастика", "Хроники Нарнии", "Гарри Поттер и философский камень", "Грозовой перевал".
         */
        ArrayList<String> li = new ArrayList<>(Collections.singletonList(genre));
        for (ArrayList<String> strings : dataBase) {
            if (genre.equals(strings.get(0))) {
                strings.add(name);
                return;
            }
        }
        dataBase.add(li);
        dataBase.get(dataBase.size()-1).add(name);
    }
    private static List<ArrayList<String>> CreateStoreProductCatalog() {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Классика", "Преступление и наказание", "Война и мир", "Анна Каренина"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Научная фантастика", "Солярис", "Ночной дозор", "Братья Стругацкие"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("Детектив", "Десять негритят"));
        ArrayList<String> list4 = new ArrayList<>(Arrays.asList("Фантастика", "Хроники Нарнии", "Гарри Поттер и философский камень", "Грозовой перевал"));
        List<ArrayList<String>> dataBase = new ArrayList<>();
        dataBase.add(list1);
        dataBase.add(list2);
        dataBase.add(list3);
        dataBase.add(list4);
        System.out.println(dataBase);
        return dataBase;
    }
}

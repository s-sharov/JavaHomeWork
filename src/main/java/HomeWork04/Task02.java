package HomeWork04;

import java.util.LinkedList;

public class Task02 {
    public static LinkedList<String> ReversList(LinkedList<String> arr) {
        /*
         * 2.
         * Пусть дан LinkedList с несколькими элементами.
         * Реализуйте метод, который вернет “перевернутый” список.
         */
        for (int i = 1; i < arr.size(); i++) {
            arr.addFirst(arr.get(i));
            arr.remove(i + 1);
        }
        return arr;
    }
}

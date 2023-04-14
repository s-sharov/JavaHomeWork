import java.util.Arrays;

public class Task1 {
    public int[] createArraySameValue(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

    public void msg(){
        //    1. Написать метод, принимающий на вход два аргумента: len и initialValue,
        //    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
        int lenArray = 10;
        int initialValueArray = 4;
        System.out.println("Создаем одномерный массив.");
        System.out.printf("Размер массива: %d%n", lenArray);
        System.out.printf("Значения в массиве будут равны: %d%n", initialValueArray);
        int[] newArr = createArraySameValue(lenArray, initialValueArray);
        for (int item: newArr) {
            System.out.print(item + " ");
        }
        // end
    }
}

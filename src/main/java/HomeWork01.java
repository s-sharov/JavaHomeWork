import java.util.Arrays;
import java.util.Random;

public class HomeWork01 {
    public static void main(String[] args) {
        //    1. Написать метод, принимающий на вход два аргумента: len и initialValue,
        //    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
//        int lenArray = 3;
//        int initialValueArray = 11;
//        System.out.println("Создаем одномерный массив.");
//        System.out.printf("Размер массива: %d%n", lenArray);
//        System.out.printf("Значения в массиве будут равны: %d%n", initialValueArray);
//        int[] newArr = createArraySameValue(lenArray, initialValueArray);
//        for (int item: newArr) {
//            System.out.print(item + " ");
//        }
        // end
    }

//    1. Написать метод, принимающий на вход два аргумента: len и initialValue,
//    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static int[] createArraySameValue(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

//    2. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;






    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    public static int[] createRandomArray(int len) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandomNumber(1, 100);
        }
        return arr;
    }

    public static int findMaxElemInArray(int[] arr) {
        int maxNum = arr[0];
        for (int j : arr) {
            if (j > maxNum) {
                maxNum = j;
            }
        }
        return maxNum;
    }

    public static int findMinElemInArray(int[] arr) {
        int minNum = arr[0];
        for (int j : arr) {
            if (j < minNum) {
                minNum = j;
            }
        }
        return minNum;
    }

}

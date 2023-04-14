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

        //    2. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
//        int lenArray = 10;
//        int[] newArr = createRandomArray(lenArray);
//        int maxNumInArray = findMaxElemInArray(newArr);
//        int minNumInArray = findMinElemInArray(newArr);
//        System.out.println("Создаем одномерный массив");
//        System.out.println("_________________________");
//        for (int item: newArr) {
//            System.out.print(item + " ");
//        }
//        System.out.println("\n_________________________");
//        System.out.printf("Максимальное элемент в созданом массиве равен: %d%n", maxNumInArray);
//        System.out.printf("Минимальный элемент в созданом массиве равен: %d%n", minNumInArray);
        // end

//        3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//        и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//        Определить элементы одной из диагоналей можно по следующему принципу:
//        индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        int lenArray = 5;
        System.out.println("Создаем двумерный массив.");
        System.out.printf("Размер массива: %dх%d%n", lenArray, lenArray);
        int[][] newArr = create2DArray(lenArray);
        System.out.println("_________________________");
        for (int[] ints : newArr) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        System.out.println("_________________________");
        System.out.println("Заполняем диагонали созданного двумерного массива единицами!");
        int[][] fillArrDiag = fillArrayDiagonal(newArr);
        System.out.println("_________________________");
        for (int[] ints : fillArrDiag) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        System.out.println("_________________________");
    }

//    1. Написать метод, принимающий на вход два аргумента: len и initialValue,
//    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static int[] createArraySameValue(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

    public static int[][] create2DArray(int size) {
        return new int[size][size];
    }

    public static int[][] fillArrayDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[arr.length - 1 - i][i] = 1;
        }
        return arr;
    }

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

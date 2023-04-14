import java.util.Random;

public class Task2 {
    public void msg(){
        //    2. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
        int lenArray = 10;
        int[] newArr = createRandomArray(lenArray);
        int maxNumInArray = findMaxElemInArray(newArr);
        int minNumInArray = findMinElemInArray(newArr);
        System.out.println("Создаем одномерный массив");
        System.out.println("_________________________");
        for (int item: newArr) {
            System.out.print(item + " ");
        }
        System.out.println("\n_________________________");
        System.out.printf("Максимальное элемент в созданном массиве равен: %d%n", maxNumInArray);
        System.out.printf("Минимальный элемент в созданном массиве равен: %d%n", minNumInArray);
        // end
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

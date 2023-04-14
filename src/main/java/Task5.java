import java.util.Scanner;

public class Task5 {
//    5.** Написать метод, которому на вход подается одномерный массив и число n
//    (может быть положительным, или отрицательным), при этом метод должен сместить
//    все элементы массива на n позиций. Элементы смещаются циклично.
//    Для усложнения задачи нельзя пользоваться вспомогательными массивами.
//    Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
//    [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
//    При каком n в какую сторону сдвиг можете выбирать сами.
    public void msg() {
        Task2 task2 = new Task2();
        System.out.println("Cоздадим одномерный массив.");
        int arrLen = getLengthArray();
        int[] arr = task2.createRandomIntArray(arrLen);
        System.out.println("_____________________");
        task2.printIntArray(arr);
        System.out.println("\n_____________________");
        System.out.println("Давайте сдвинем элементы массива.");
        int shift = getShiftNumber();
        System.out.println("А сейчас нужно узнать направление движения.");
        int direction = getDirectionTravel();
        System.out.println("Давайте наконец-то сдвинем элементы.");
        int[] shiftArr = moveArrayElements(arr, shift, direction);
        task2.printIntArray(shiftArr);
    }

    public int getLengthArray() {
        Scanner scLen = new Scanner(System.in);
        System.out.print("Укажите длину массива: ");
        return scLen.nextInt();
    }
    public int getShiftNumber() {
        Scanner scShift = new Scanner(System.in);
        System.out.print("На сколько сдвинуть элементы массива: ");
        return scShift.nextInt();
    }
    public int getDirectionTravel() {
        int direction = 0;
        System.out.println("Укажите 1 - двигаться вправо; 2 - двигаться влево");
        Scanner sc = new Scanner(System.in);
        direction = sc.nextInt();
        boolean flag = false;
        while (!flag) {
            if(direction == 1 | direction == 2) {
                flag = true;
            }
            else {
                System.out.println("Укажите 1 - двигаться вправо; 2 - двигаться влево");
                direction = sc.nextInt();
            }
        }
        return direction;
    }
    public int[] moveArrayElements(int[] lArr, int lShift, int lDirection) {
        if (lDirection == 2) {
            lShift *= -1;
        }
        int length = lArr.length;
        int fullTurns = Math.abs(lShift) / length;
        int offset = lShift % length;
        if (offset < 0) {
            offset += length;
        }
        for (int i = 0; i < fullTurns; i++) {
            int temp = lArr[length - 1];
            for (int j = length - 1; j > 0; j--) {
                lArr[j] = lArr[j - 1];
            }
            lArr[0] = temp;
        }
        for (int i = 0; i < offset; i++) {
            int temp = lArr[length - 1];
            for (int j = length - 1; j > 0; j--) {
                lArr[j] = lArr[j - 1];
            }
            lArr[0] = temp;
        }
        return lArr;
    }
}

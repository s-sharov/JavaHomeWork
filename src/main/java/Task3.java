public class Task3 {
    public void msg(){
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
        int[][] fillArrDig = fillArrayDiagonal(newArr);
        System.out.println("_________________________");
        for (int[] ints : fillArrDig) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
        System.out.println("_________________________");
        // End
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
}

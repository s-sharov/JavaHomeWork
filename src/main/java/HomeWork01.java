import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        msg();
        int mode = 0;
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        while (!flag) {
            mode = sc.nextInt();
            switch (mode) {
                case 1:
                    Task1 task1 = new Task1();
                    task1.msg();
                    msg();
                    break;
                case 2:
                    Task2 task2 = new Task2();
                    task2.msg();
                    msg();
                    break;
                case 3:
                    Task3 task3 = new Task3();
                    task3.msg();
                    msg();
                    break;
                case 4:
                    Task4 task4 = new Task4();
                    task4.msg();
                    msg();
                    break;
                case 5:
                    Task5 task5 = new Task5();
                    task5.msg();
                    msg();
                    break;
                default:
                    flag = true;
                    break;
            }
        }
    }

    public static void msg() {
        System.out.println("Выберите: ");
        System.out.println("1. Задание 1");
        System.out.println("2. Задание 2");
        System.out.println("3. Задание 3");
        System.out.println("4. Задание 4");
        System.out.println("5. Задание 5");
    }
}

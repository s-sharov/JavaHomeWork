package HomeWork04;

import java.util.LinkedList;
import java.util.Scanner;

public class Task01 {
    public static void Run(LinkedList<String> arr) {
        /*
        * 1.
        * Реализовать консольное приложение, которое:
        * Принимает от пользователя и “запоминает” строки.
        * Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
        * Если введено revert, удаляет предыдущую введенную строку из памяти.
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку или команду: ");
        while (true){
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("print")){
                print(arr);
                continue;
            }
            if (input.equalsIgnoreCase("revert")){
                arr.removeFirst();
                System.out.println("Предыдущая строка удалена");
                continue;
            }
            if (input.equalsIgnoreCase("stop")){
                print(arr);
                System.out.println("Приложение остановлено");
                return;
            }
            arr.addFirst(input);
            System.out.print("Введите новую стоку: ");
        }
    }

    private static void print(LinkedList<String> list){
        for (String item: list) {
            System.out.println(item);
        }
    }
}

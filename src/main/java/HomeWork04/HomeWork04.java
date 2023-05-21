package HomeWork04;

import java.util.Arrays;
import java.util.LinkedList;

public class HomeWork04 {
    public static void main(String[] args) {
        LinkedList<String> str = new LinkedList<>();
        LinkedList<String> list = new LinkedList<>(Arrays.asList("zero", "one", "two", "three","four", "five", "six", "seven"));
        System.out.println("_________Task 1__________");
        Task01.Run(str);
        System.out.println("_________End Task 1__________");

        System.out.println("_________Task 2__________");
        System.out.println(list);
        System.out.println(Task02.ReversList(list));
        System.out.println("_________End Task 2__________");
    }
}

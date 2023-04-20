package HomeWork01;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Task4 {

    public void msg() {
        //        4. В консоли запросить имя пользователя.
        //        В зависимости от текущего времени, вывести приветствие вида:
        //        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
        //        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
        //        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
        //        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
        String userName = getName();
        String currentTime = getCurrentTime();
        int intervalDay = getIntervalDay(currentTime);
        switch (intervalDay) {
            case 1:
                System.out.printf("Доброе утро, %s!%n", userName);
                break;
            case 2:
                System.out.printf("Добрый день, %s!%n", userName);
                break;
            case 3:
                System.out.printf("Добрый вечер, %s!%n", userName);
                break;
            case 4:
                System.out.printf("Доброй ночи, %s!%n", userName);
                break;
        }

    }

    public String getName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Как вас зовут?: ");
        String name = sc.nextLine();
        sc.close();
        return name;
    }

    public String getCurrentTime(){
        return DateTimeFormatter.ofPattern("HH:mm")
                .format(LocalDateTime.now());
    }

    public int getIntervalDay(String time){
        String[] lTime = time.split(":");
        int hour = Integer.parseInt(lTime[0]);
        if (hour >= 5 & hour <= 11)
            return 1;
        else if (hour >= 12 & hour <= 17)
            return 2;
        else if (hour >= 18 & hour <= 22)
            return 3;
        return 4;
    }
}

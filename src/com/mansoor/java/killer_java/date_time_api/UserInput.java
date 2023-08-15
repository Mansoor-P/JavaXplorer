package date_time_api;

import java.sql.SQLOutput;
import java.time.DayOfWeek;
import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Month");
        int m=sc.nextInt();
        System.out.println("Enter Day");
        int d=sc.nextInt();
        System.out.println("Enter Year");
        int y=sc.nextInt();


        LocalDate date= LocalDate.of(y,m,d);
        DayOfWeek dayOfWeek=date.getDayOfWeek();
        System.out.println(date);
    }
}

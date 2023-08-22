package com.mansoor.java.killer_java.advancedjava.jdbc_connectivity.date_time_api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {
//        LocalDate ld= LocalDate.now();
//        System.out.println(ld);
//        LocalTime lt=LocalTime.now();
//        System.out.println(lt);


//        LocalTime time= LocalTime.now();
//        int hour=time.getHour();
//        int min=time.getMinute();

//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter hour");
//        int hour=sc.nextInt();
//        if(hour<11 ){
//            System.out.println("good morning");
//        } else if (hour>=12 && hour <16 ) {
//            System.out.println("good afternoon");
//        } else if (hour>=16 && hour < 19) {
//            System.out.println("good evining");
//        }
//        else{
//            System.out.println("Good night");
//        }

        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After Formatting: " + formattedDate);



    }
}

package com.mansoor.java.killer_java.date_time_api;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DtFormating {
    public static void main(String[] args) {
        LocalDateTime ld=LocalDateTime.now();
        System.out.println(ld);
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
        String formattedDate = ld.format(dtf);
        System.out.println(formattedDate);
    }
}

package br.com.igorgc.utilityclasses.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

        LocalDate date = LocalDate.parse("2026-09-22");
        LocalTime time = LocalTime.parse("17:47:00");

        System.out.println(dateTime);
        System.out.println(date);
        System.out.println(time);

        LocalDateTime dateTime1 = date.atTime(time);
        LocalDateTime dateTime2 = time.atDate(date);

        System.out.println(dateTime1);
        System.out.println(dateTime2);
    }
}

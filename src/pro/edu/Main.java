package pro.edu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Hello world!");

        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate the1stOfAugust = LocalDate.of(2020, Month.AUGUST, 1);
        LocalDate date = today.plusDays(10);
        System.out.println(date);
        LocalDate newYear = LocalDate.of(2020, Month.JANUARY,1);
        LocalDate itHoliday = newYear.plusDays(255);
        System.out.println(itHoliday);
        System.out.println(itHoliday.getMonth());
        System.out.println(itHoliday.isAfter(LocalDate.of(2020, Month.SEPTEMBER, 1)));
        System.out.println(ChronoUnit.DAYS.between(newYear, today));

        String may15thAsString = "2020-05-15";

        LocalDate may15thAsLocalDate = LocalDate.parse(may15thAsString);
        System.out.println(may15thAsLocalDate);

        LocalDateTime time = LocalDateTime.of(2020,Month.AUGUST,1,8,15,10,455000000);
        System.out.println(time);
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now().getNano());

        System.out.println(ChronoUnit.SECONDS.between(newYear.atTime(0,0), time));


        //  20.16.06


    }
}

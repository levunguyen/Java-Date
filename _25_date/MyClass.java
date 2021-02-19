package _25_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class MyClass {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);

        LocalTime myObj1 = LocalTime.now();
        System.out.println(myObj1);

        LocalDateTime myObj2 = LocalDateTime.now();
        System.out.println("Before formatting: " + myObj2);

        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myFormat.format(myObj2);

        System.out.println("After formatting: " + formattedDate);
    }
}

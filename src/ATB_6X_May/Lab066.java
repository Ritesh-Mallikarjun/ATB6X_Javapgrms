package ATB_6X_May;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Lab066 {
    public static void main(String[] args) {
        LocalDate onedate = LocalDate.of(1990, 12, 12);

        LocalDate secondadate = LocalDate.of(2024, 10, 13); //alternative of LocalDate.now() method

//calculates the amount of time between two specified temporal objects
        long years = ChronoUnit.YEARS.between(onedate, secondadate);
        System.out.println("your age is " + years);
        long months=ChronoUnit.MONTHS.between(onedate,secondadate);
        System.out.println("your month is "+months);
        long days=ChronoUnit.DAYS.between(onedate,secondadate);
        System.out.println("your day is "+days);

    }
}

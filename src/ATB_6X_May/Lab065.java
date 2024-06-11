package ATB_6X_May;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab065 {
    public static void main(String[] args) {
        System.out.println("this program is to find the age,month and days of the user");
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your DOB in YYYY-MM-DD format only");
        String uinput= sc.nextLine();
        LocalDate uinputOne= LocalDate.parse(uinput);
        try {
            calculatueage(uinputOne);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    private static void calculatueage(LocalDate uinput) throws Exception {
        LocalDate currentDate= LocalDate.now();

        Period between = Period.between(uinput, currentDate);

        System.out.printf("the users age is %d years %d months %d days",between.getYears(),between.getMonths(),between.getDays());
    }
}

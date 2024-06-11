package ATB_6X_May;

import javax.xml.transform.Source;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab064 {
    public static void main(String[] args) throws Exception {
        LocalDate currentDate = LocalDate.now();
        System.out.println("current date is " + currentDate);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your date of birth in YYYY-MM-DD format only");
        String dateinput = sc.nextLine();

        //the parse() method obtains an instance of LocalDate from a text string such as 1992-08-11
        LocalDate userdate=LocalDate.parse(dateinput);
        System.out.println("the userdate is "+userdate);

        int userage=calculateage(userdate);

        System.out.println("Your current age is: "+userage);


    }

    private static int calculateage(LocalDate userdate) throws Exception{

        LocalDate curDate=LocalDate.now();

        if(userdate!=null && curDate!=null){
            return Period.between(userdate,curDate).getYears();
        }
        else{
            return 0;
        }
    }

}

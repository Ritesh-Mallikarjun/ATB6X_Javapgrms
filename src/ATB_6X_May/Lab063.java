package ATB_6X_May;

import java.util.Calendar;
import java.util.Date;

public class Lab063 {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();

        System.out.println("calendar type: "+c.getCalendarType());
        System.out.println("get time -> "+c.getTime());
        System.out.println("first day of week -> "+c.getFirstDayOfWeek());
        System.out.println("get time in milli seconds -> "+c.getTimeInMillis());
        System.out.println("get minimal days in first week -> "+c.getMinimalDaysInFirstWeek());
        System.out.println("get time zone -> "+c.getTimeZone());
        System.out.println("get weeks in week year -> "+c.getWeeksInWeekYear());
        System.out.println("get week year -> "+c.getWeekYear());

        System.out.println("todays date is -> "+c.get(Calendar.DATE));
        System.out.println("todays day of month is -> "+c.get(Calendar.DAY_OF_MONTH));
        System.out.println("todays day of week is -> "+c.get(Calendar.DAY_OF_WEEK));
        System.out.println("todays day of week in month is -> "+c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("todays day of week in year is -> "+c.get(Calendar.DAY_OF_YEAR));
        System.out.println("todays day of week of month is -> "+c.get(Calendar.WEEK_OF_MONTH));
        System.out.println("todays hour of the day is  -> "+c.get(Calendar.HOUR_OF_DAY));
        System.out.println("todays minute is  -> "+c.get(Calendar.MINUTE));
        System.out.println("Current year is  -> "+c.get(Calendar.YEAR));


        Date d1= new Date();
        System.out.println("the date is: "+d1);




    }
}

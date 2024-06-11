package ATB_6X_May.Enum;

public class Lab076 {
    public static void main(String[] args) {
        System.out.println("Days of the week are as follows:");
        Days day1= Days.SUNDAY;
        System.out.println(day1);
        Days day2= Days.MONDAY;
        System.out.println(day2);
        Days day3=Days.TUESDAY;
        System.out.println(day3);
        Days day4=Days.WEDNESDAY;
        System.out.println(day4);
        Days day5=Days.THURSDAY;
        System.out.println(day5);
        Days day6=Days.FRIDAY;
        System.out.println(day6);
        Days day7=Days.SATURDAY;
        System.out.println(day7);

        System.out.println("----------------------------");
        Fruits fruit1= Fruits.APPLE;
        System.out.println(fruit1);

        System.out.println("=======");
        for(Fruits fruits:Fruits.values()){
            System.out.println(fruits);
        }


    }
}

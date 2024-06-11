package ATB_6X_May.Exceptions;

public class Lab077 {
    public static void main(String[] args) {
        String s1=null;
//        System.out.println(s1);
        try {
            s1.trim();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
//            System.out.println("string is null, please insert valid data");
        }

        String s2= null;
        try {
            s2 = args[0];
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        Integer i1= 0;
        try {
            i1 = Integer.parseInt(s2);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        Integer c= null;
        try {
            c = 10/i1;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(c);
        System.out.println(i1);

    }
}

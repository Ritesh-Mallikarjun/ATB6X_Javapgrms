package ATB_6X_May;

public class Lab073 {
    public static void main(String[] args) {
        Integer a1= 10;
        System.out.println(a1);
        a1 = Integer.valueOf(50); //valueof int and give it to int
        System.out.println(a1);
        String s="1233";
        a1=Integer.parseInt(s); //parseint the string value and give it to integer
        System.out.println(a1);
        int a2=500;
        System.out.println(Integer.compare(a1,a2));//(1233,500)
        Integer a3=Integer.max(50,78);
        System.out.println(a3);
        Integer a4= Integer.min(9889,9812);
        System.out.println(a4);
        double d1=12.5689;
        Double doub=Double.valueOf(d1);
        Double doub1=Double.valueOf(12.5689);
        int id= (int)d1;
        int id1=Integer.valueOf((int)d1);
        int id2=Integer.valueOf((int)12.568988989);
        System.out.println(Integer.compare(10,15));
        System.out.println(Integer.compare(115,115));
        System.out.println(Integer.compare(200,115));
        Integer sum=Integer.sum(50,6080);
        System.out.println(sum);
        String s2=Integer.toString(150);
        System.out.println(s2.length());

        String s3="2568";
        Integer a;
        try {
              a = Integer.parseInt(s3);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
        System.out.println(a);
        String s4=Integer.toString(2568);
        System.out.println(s4);

        String s5="2536";
        System.out.println(s3.equals(s5));
        Integer rev=Integer.reverse(2568);
        System.out.println(rev);



    }

}

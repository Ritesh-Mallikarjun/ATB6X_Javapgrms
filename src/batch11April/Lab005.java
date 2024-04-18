package batch11April;

public class Lab005 {
    public static void main(String[] args) {
        int s=20;
        int s1=30;
        System.out.println(s); //20
        System.out.println(s1); //30
        System.out.println("-----------");
        int res= --s + s--;  //--s (20-1=19, s-19) + (s=19 s-- 19-1=18 , so s=18) )
        System.out.println(res); //38
        System.out.println("s value is "+s); //18
        System.out.println("-------------");
        int res1= --s1 + s1-- + s-- + --s; //(30-1=29 + 29 s1=28 +18 s--(18-1=17) +16 s=16) --> (29+29+18+16)
        System.out.println("s1 value is "+s1); //28
        System.out.println("s value is "+s); //16
        System.out.println(res1); //92
    }
}

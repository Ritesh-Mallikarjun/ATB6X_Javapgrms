package batch11April;

public class Lab004 {
    public static void main(String[] args) {
        int a=10;
        int b=30;
        int c=a++; //c=10 a=11;
        int c1=++a; //c1=12 a=12;
        int d=++b; // d=31 b=31
        d=b++; // d=31 b=32

        System.out.println(a); //12
        System.out.println(b); //32
        System.out.println(c); //10
        System.out.println(c1); //12
        System.out.println(d); //31
        System.out.println(b); //32
        System.out.println("=============================");
        int res= (++c + c++ + c1++ + ++c1); // (c= 11+11 and c=12 +12 c1=13 +14 c1=14 11+11+12+14)
        System.out.println(res);
        System.out.println(c);
        System.out.println(c1);
    }
}

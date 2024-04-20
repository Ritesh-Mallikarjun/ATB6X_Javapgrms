package batch11April;

public class Lab012 {
    public static void main(String[] args) {
        String s1= new String("Pappu rahul");
        System.out.println("s1 value is: "+s1);
        String s2=new String("Pappu Priya");
        System.out.println("s2 value is: "+s2);
        System.out.printf("Is s1 reference with s2: %b\n",s1==s2);
        System.out.printf("Is s1 content is equal to s2 content: %b\n",s1.equals(s2));
        System.out.println("-------------------------------------");
        String s4= new String("carlsen metani");
        String s5=new String("Carlsen metani");
        String s3=s4.equals(s5) ? "true" : "false";
        System.out.println("the value of s4 is: "+s4);
        System.out.println("the value of s5 is: "+s5);
        System.out.println("the value of s3 with actual content : "+s3);
        System.out.println("ignore case of s4 and s5 is listed below");
        System.out.printf("Is s4 and s5 contents with ignorecase status is: %b",s4.equalsIgnoreCase(s5));

    }
}

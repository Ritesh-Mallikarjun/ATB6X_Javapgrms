package batch11April;

public class Lab011 {
    public static void main(String[] args) {
        String s1="test";
        String s2="Test";
        System.out.println("s1 value is "+s1);
        System.out.println("s2 value is "+s2);
        System.out.printf("the reference value of s1 & s2 is %b\n", s1==s2);
        String s3="test";
        System.out.println("s3 value is "+s3);
        System.out.printf("the reference value of s1 & s3 is %b\n", s1==s3); // usage of comparison operator with 2 references/string literals
        System.out.println("-----------");
        //usage of equals function of the string , which exactly checks whether s1 content is equal to s2 or not, same for
        //other literals for s2,s3;
        System.out.printf("Is s1 & s2 contents are same: %b\n",s1.equals(s2));
        System.out.printf("Is s1 & s3 contents are same: %b\n",s1.equals(s3));
        System.out.printf("Is s2 & s3 contents are same: %b\n",s2.equals(s3));
    }
}

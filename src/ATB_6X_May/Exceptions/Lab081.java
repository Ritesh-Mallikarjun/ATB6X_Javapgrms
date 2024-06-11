package ATB_6X_May.Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Lab081 {
    public static void main(String[] args) throws Exception {
        try {
            int a=10/0;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()+":- ArithmeticException ");
        }

        try {
            String s1=null;
            System.out.println(s1);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        try {
            FileInputStream fis = new FileInputStream(new File("C://Strings.java"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            //throw new FileNotFoundException(e.getMessage());
        }

        try {
            String s2= args[0];
            System.out.println(s2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
//            throw new Exception(e);
        }

        try {
            String s3="Arun";
            Integer b=Integer.parseInt(s3);
            Integer i1=10/b;
        } catch (NumberFormatException e) {
//            throw new NumberFormatException(e.getMessage());
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I will be executing the code finally through the program");
        }

    }
}

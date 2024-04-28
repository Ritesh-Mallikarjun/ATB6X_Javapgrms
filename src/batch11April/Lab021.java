package batch11April;

public class Lab021 {
    public static void main(String[] args) {
        System.out.println("this program is to print first even numbers then odd numbers from 1 to 10");
        for (int i = 0; i <=10 ; i++) {
            if (i % 2 == 0) {
                System.out.println("even numbers " + i);
            }
        }
        System.out.println("***************************");
        for (int i = 0; i <=10 ; i++) {
            if (i % 2 != 0) {
                System.out.println("odd numbers " + i);
            }
        }
        
    }
}

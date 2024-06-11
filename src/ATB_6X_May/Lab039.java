package ATB_6X_May;

import java.util.Scanner;

public class Lab039 {
    public static void main(String[] args) {
        System.out.println("this program is to find the occurance of each characters in the string !!");
        Scanner sc = new Scanner(System.in);
        String yourName = sc.nextLine();
        int[] count = new int[250];
        int charCount = 0;
        int in = yourName.charAt(0) + yourName.charAt(1);
        System.out.println(yourName.charAt(0));
        System.out.println(yourName.charAt(1));
        System.out.println(count[0] = yourName.charAt(0));
        System.out.println(count[1] = yourName.charAt(1));
        System.out.println(in);

        for (int i = 0; i < yourName.length(); i++) {
            count[yourName.charAt(i)]++;
        }

        for (int i = 0; i < yourName.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (yourName.charAt(i) == yourName.charAt(j)) {
                    charCount++;
                }
            }
            if (charCount == 1) {

                System.out.println("the occurance of " + yourName.charAt(i) + " is " + count[yourName.charAt(i)]);
            }
            charCount = 0;
        }

    }
}

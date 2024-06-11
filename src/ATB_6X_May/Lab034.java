package ATB_6X_May;

import java.util.Scanner;

public class Lab034 {
    public static void main(String[] args) {
        System.out.println("This program is to open the browser");
        Scanner sc=new Scanner(System.in);
        int browserOption=sc.nextInt();

        switch (browserOption){
            case 1: chromebrowser();
                    break;
            case 2: mozillaFireFox();
                    break;
            case 3: operaBrowser();
                    break;
            case 4: IOSBrowser();
                    break;
            default: System.out.println("This browser is not in the list, so we will see later !!!!");

        }
    }

    private static void IOSBrowser() {
        System.out.println("Hi there, IOS browser is getting opened !!!");
    }

    private static void operaBrowser() {
        System.out.println("Hi there, Opera browser is getting opened !!!");
    }

    private static void mozillaFireFox() {
        System.out.println("Hi there, mozilla browser is getting opened !!!");
    }

    private static void chromebrowser() {
        System.out.println("Hi there, Google browser is getting opened !!!");
    }
}

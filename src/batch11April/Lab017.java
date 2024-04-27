package batch11April;

import java.util.Scanner;

public class Lab017 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("This program is to open the web browser application");
        System.out.println("=================");
        System.out.println("Enter the browser to be opened!!!");
        String browserName= sc.nextLine().toLowerCase();

        switch (browserName){
            case "google":
                System.out.println("The google web browser is getting opened");
                break;
            case "opera":
                System.out.println("The opera web browser is getting opened");
                break;
            case "safari ios":
                System.out.println("The safari ios browser is getting opened");
                break;
            case "firefox":
                System.out.println("The firefox browser is getting opened");
                break;
            case "microsoft edge":
                System.out.println("The edge browser is getting opened");
            default:
                System.out.println("Sorry ,we will check and reply back to you !!!!!!!!!!");
        }

    }
}

package ATB_6X_May;

public class Lab033 {
    public static void main(String[] args) {
        //function without returntype and without parameters
        chromeBrowser();
        mozillaFireFox();
        operaBrowser();
    }

    private static void operaBrowser() {
        System.out.println("The Opera browser is getting opened !!!");
    }

    private static void mozillaFireFox() {
        System.out.println("The mozilla firefox browser is getting opened !!!");
    }

    private static void chromeBrowser() {
        System.out.println("The google browser is getting opened !!!");
    }

}

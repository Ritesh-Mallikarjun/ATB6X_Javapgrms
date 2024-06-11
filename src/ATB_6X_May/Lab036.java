package ATB_6X_May;

public class Lab036 {
    public static void main(String[] args) {
         openBrowser();
         testLoginPage();
         closeBrowser();

        System.out.println("==================");

        openBrowser();
        testPage("Home");
        closeBrowser();

        System.out.println("==================");

        openBrowser();
        testPage("About Us");
        closeBrowser();

    }

    private static void testPage(String pageName) {
        System.out.println("The browser is testing the "+ pageName +" page!!!");
        System.out.println(pageName+" page is tested successfully!!!");
    }

    private static void closeBrowser() {
        System.out.println("The browser is getting closed !!!");
    }

    private static void testLoginPage() {
        System.out.println("The user is testing the login page ");
    }

    private static void openBrowser() {
        System.out.println("The browser is getting opened !!!");
    }
}

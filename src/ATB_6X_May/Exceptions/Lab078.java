package ATB_6X_May.Exceptions;

public class Lab078 {
    public static void main(String[] args) {

        try {
            String s1=args[0]; //ArrayIndexOutOfBoundsException
            Integer a1= Integer.parseInt(s1); //NumberFormatException
            Integer result=100/a1; //ArithmeticException
            System.out.println(a1);
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
            e.printStackTrace();
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("I am finally , who will be executed last");
        }


    }
}

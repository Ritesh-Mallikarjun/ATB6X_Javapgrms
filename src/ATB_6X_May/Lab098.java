package ATB_6X_May;

public class Lab098 {
    public void step1(){
        System.out.println("function 1");
    }

    public void step2(){
        System.out.println("function 2");
    }

    public void step3(){
        System.out.println("Function 3");
    }
    public static void step4()
    {
        System.out.println("hi i am static method");
    }
    public static void main(String[] args) {
        Lab098 l2= new Lab098();
        l2.step1();
        l2.step2();
        l2.step3();
        step4(); //calling a static method by making the method static
    }
}

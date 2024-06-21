package ATB_6X_May;

public class Lab099_BuilderPattern {
    String namefun2;
    public Lab099_BuilderPattern fun1(){
        System.out.println("this is func1");
        return this;
    }
    public Lab099_BuilderPattern fun2(String name2){
        this.namefun2=name2;
        System.out.println("this is func2");
        System.out.println("the details of func2 is "+namefun2);
        return this;
    }
    public Lab099_BuilderPattern fun3(String name,Integer age){
        System.out.println("this is func3");
        System.out.println("here are the details of fun3 "+"name:- "+name+" and age:- "+age);
        namefun2="venky";
        return this;
    }

    public static void main(String[] args) {
        Lab099_BuilderPattern lbp= new Lab099_BuilderPattern();
        lbp.fun1().fun2("Revan").fun3("Rishab shiny",22);
        System.out.println(lbp.namefun2);
    }
}

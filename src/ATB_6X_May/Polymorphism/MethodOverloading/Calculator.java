package ATB_6X_May.Polymorphism.MethodOverloading;

public class Calculator {
    Calculator(){
        System.out.println("this is the calculator class!!!! ");
    }
    void add(){
        System.out.println("i am adding sum of variables!!");
    }

    void add(int a, int b,int c){
        c= a+b;
        System.out.println("sum result is "+c);
    }

    int add(int a , int b){
        int c=0;
        return c=a+b;
    }

    String add(String s1,String s2){
        return s1+s2;
    }

    int add(char c1,char c2){
        return (int) (c1 + c2);
    }

    String add(String s1,char c1){
        return s1+String.valueOf(c1);
    }

    String add(String s1,int i1){
        return s1+String.valueOf(i1);
    }

    public static void main(String[] args)
    {

       Calculator c1=new Calculator();
        c1.add();
        c1.add(10,18);
        int ab=c1.add('d','a');
        System.out.println("the result of adding characters are "+ab);
        String s1=c1.add("lord","hanuman");
        System.out.println("the result of adding 2 strings are "+s1);
        String s2=c1.add("shambu",'B');
        System.out.println("the result of adding string and char is "+s2);
        String s3=c1.add("dambu",25);
        System.out.println("the result of adding string and int is "+s3);
    }
}


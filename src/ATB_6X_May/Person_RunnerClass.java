package ATB_6X_May;

public class Person_RunnerClass {
    public static void main(String[] args) {
        Person ritesh=new Person();
        ritesh.walk();
        String ritEat=ritesh.eating();
        System.out.println("I love eating "+ritEat);
        ritesh.cycling("AVON Cycle");
        String sleepAnswer=ritesh.sleep("How many hours do you sleep?");
        System.out.println("I normally sleep for "+sleepAnswer+" hours daily!!");

        Person person2=new Person("Alia","30-12-1995",28);
        Person person3=new Person("Rahul","24-02-1993",31);
        person3.walk();
        person3.setName("Rahul Singhania");
        person3.changeData();
        System.out.println(person3.getClass().getSimpleName());
    }
}

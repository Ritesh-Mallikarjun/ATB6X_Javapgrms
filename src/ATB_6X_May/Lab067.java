package ATB_6X_May;

public class Lab067 {
    public static void main(String[] args) {
        ATB a1 = new ATB(15,"zolo","amirta",95555555555l);
        a1.display();
        ATB.stm1();
        System.out.println("calling using a1 obj reference");
        a1.stm1();
        System.out.println(ATB.nationName);
        System.out.println(ATB.schoolName);
        ATB a2 = new ATB(16,"myjio","sangita",989255555l);
        ATB.stm1();
        a1.stm1();
        a2.stm1();

        System.out.println("a2 info details");
        a2.display();
        System.out.println(a2.nationName);
        System.out.println(a2.schoolName);
        //ATB.display(); not possible
//        ATB.a; not possible
//        ATB.pendriveName;  not possible
//        ATB.name;    not possible
//        ATB.phoneNum;  not possible
        ATB.stm1();
        System.out.println(ATB.schoolName);
        System.out.println(ATB.nationName);
    }
}
    class ATB{
        int a;
        String pendriveName;
        static String nationName="INDIA";
        static String schoolName="BISHOP COTTON SCHOOL";
        String name;
        long phoneNum;

        public ATB(int a, String pendriveName, String name, long phoneNum) {
            this.a = a;
            this.pendriveName = pendriveName;
            this.name = name;
            this.phoneNum = phoneNum;
        }

        void display(){
            System.out.println("a value is "+a);
            System.out.println("pendrive name is "+pendriveName);
            System.out.println("name is "+name);
            System.out.println("phone number is "+phoneNum);
        }

        static void stm1(){
            System.out.println("nation name is "+nationName);
            System.out.println("school name is "+schoolName);
//            System.out.println(a);
//            System.out.println(pendriveName);
        }

    }

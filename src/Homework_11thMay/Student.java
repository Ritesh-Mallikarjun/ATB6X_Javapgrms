package Homework_11thMay;

public class Student {
    String name;
    String dob;
    long phoneNumber;
    String sex;
    int age;
    String isGraduateOrNot;
    boolean isPaymentDoneOrNot;

    public Student(String name, String dob, long phoneNumber, String sex, int age, String isGraduateOrNot, boolean isPaymentDoneOrNot) {
        this.name = name;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.age = age;
        this.isGraduateOrNot = isGraduateOrNot;
        this.isPaymentDoneOrNot = isPaymentDoneOrNot;
    }

    public Student(String name,String sex) {
        this.name=name;
        this.sex=sex;
    }

    public Student(String name, String sex, int age, String isGraduateOrNot) {
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.isGraduateOrNot=isGraduateOrNot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String isGraduateOrNot() {
        return isGraduateOrNot;
    }

    public void setGraduateOrNot(String graduateOrNot) {
        isGraduateOrNot = graduateOrNot;
    }

    public boolean isPaymentDoneOrNot() {
        return isPaymentDoneOrNot;
    }

    public void setPaymentDoneOrNot(boolean paymentDoneOrNot) {
        isPaymentDoneOrNot = paymentDoneOrNot;
    }

    void isloginOk(){
        if(!isPaymentDoneOrNot){
            System.out.println(name+" is not able to login as payment is not made");
        }
        else{
            System.out.println(name+" is made the payment and able to login successfully!!");
        }
    }

    void displayInfo(){
        System.out.println("name: "+name+" ,dob: "+dob+" ,phoneno: "+phoneNumber+
                " ,sex: "+sex+" ,age: "+age+" ,Graduate ?: "+isGraduateOrNot+
                " ,Payment Done? "+isPaymentDoneOrNot);
    }

    void isLearning(){
        System.out.println(name+" is learning this course!!!");
    }

    void isPractisingProg(){
        System.out.println(name+" is practising the program regularly");
    }



}


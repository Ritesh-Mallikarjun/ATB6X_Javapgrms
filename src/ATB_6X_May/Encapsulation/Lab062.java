package ATB_6X_May.Encapsulation;

public class Lab062 {
    public static void main(String[] args) {
        carDriver cd = new carDriver();
        cd.ownerInfo();

        System.out.println("------------------------");
        CarOwner owner1=new CarOwner();
        owner1.ownerMyInfo();

        CarOwner co=new carDriver("Nikita","Tesla","IND109",9845984565L,20135.35);
        co.ownerMyInfo();
        co.businessPlace();
    }
}

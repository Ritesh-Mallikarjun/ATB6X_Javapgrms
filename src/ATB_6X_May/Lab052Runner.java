package ATB_6X_May;

public class Lab052Runner {
    public static void main(String[] args) {
        Lab052Auto l1= new Lab052Auto();
        System.out.println(l1.name);
        l1.ExcelOpenBook();
        l1.dbSQLConnection();
        Lab052Auto l2= new Lab052Auto("ATB_TC_1");
        System.out.println(l2.name);
        l2.dbSQLConnection();
        l2.ExcelOpenBook();
        l2.TestCase1(l2.name);
        l2.TestCase2(l2.name);
        Lab052Auto l3= new Lab052Auto("ATB_TC_2");
        System.out.println(l3.name);
        l3.TestCase1(l3.name);
        l3.TestCase2(l3.name);
        Lab052Auto l4=new Lab052Auto("ATB_TC_3",25);
        l4.TestCase1(l4.name);
        l4.TestCase2(l4.name);
        l4.ExcelOpenBook();
        l4.dbSQLConnection();
    }
}

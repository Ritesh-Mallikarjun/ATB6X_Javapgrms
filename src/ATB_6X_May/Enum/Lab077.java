package ATB_6X_May.Enum;

import javax.crypto.spec.PSource;

public class Lab077 {
    public static void main(String[] args) {
//        HTTPStatusCode status= HTTPStatusCode.OK;
//        System.out.println(status);
//        System.out.println(status.getCode());
//        System.out.println(status.getStatusName());

        for(HTTPStatusCode status:HTTPStatusCode.values()){
            System.out.println(status.getCode()+" - "+status.getStatusName());
        }

        Size s1= Size.SMALL;
        System.out.println(s1);
        System.out.println(s1.getSizecode());

        System.out.println("-------------------------------------");

        for(Size sizeNames:Size.values()){
            System.out.println(sizeNames+" - "+sizeNames.getSizecode());
        }

        pages pg1= pages.HOMEPAGE;
        System.out.println(pg1);
        System.out.println(pg1.getPageUrl());
        System.out.println(pg1.getPageNames());

        System.out.println("*****************************************");
        for(pages page:pages.values()){
            System.out.println(page.getPageNames()+" - "+page.getPageUrl());
        }
    }
}

package ATB_6X_May.Collections;

import java.util.List;

public class Lab084 {
    public static void main(String[] args) {
        List fruitsList = List.of("Apple","Orange","Mango","Strawberry","Grapes","Peach");
        System.out.println(fruitsList);
        System.out.println(fruitsList.size());

        List shoppingList = List.of("Milk","Bread","Butter","Fruits","Rusk");
        System.out.println(shoppingList);
        System.out.println(shoppingList.size());

        //List interface and collections are heterogenous in nature , which accepts all sorts of data types
        List differentTypes = List.of("String",2.345,true,null,false,15000);
        System.out.println(differentTypes);
        System.out.println(differentTypes.size());
    }
}

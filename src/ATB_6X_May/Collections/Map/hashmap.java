package ATB_6X_May.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {

        //Hashmap , order is not preserved and its displayed in random order.
        //Hashmap, null values are allowed
        //keys are unique in nature.
        //values can be duplicate in map.
        //Iterators are also allowed to traverse the element
        //Map is used to store the data in key and value pair.
        //Insertion order is not preserved
        //Serializable and cloneable interfaces are implemented.
        //Map is a interface and Hashmap is a concrete and complete class which implements Map interface.
        //In map , keys are case-sensitive in nature.
        // printing using map and also using toString() method is one and the same , both will fetch the same results.

        Map<String,String> map = new HashMap<>();
        map.put("name","Rihanna");
        map.put("age","35");
        map.put("Height","5.6");
        map.put("Occupation","Singer");
        map.put("Country","USA");
        map.put("Color","Dark Brown");
        map.put("Salary","25Billion");
        map.put("null_value",null);
        System.out.println("Printing only using map");
        System.out.println(map);

        System.out.println();

        System.out.println("Printing only using toString() method");
        System.out.println(map.toString());

        System.out.println(map.size());

        System.out.println(map.get("name"));
//        System.out.println(map.get("occupation")); //occupation provides null , but Occupation gets a clear value
        System.out.println(map.get("Occupation"));
        System.out.println(map.get("Color"));
        System.out.println(map.containsKey("null"));
        System.out.println(map.containsKey("null_value"));
        System.out.println(map.getClass().getSimpleName()); // it will fetch the class name in which it is present or called

        System.out.println(map.keySet());
        //map.keySet() will print all the keys present in the current map , and it will be separated in comma
        System.out.println(map.values());
        //map.values() will print all the values present in the current map.
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map.isEmpty());
        System.out.println(map.toString()); // {} its empty nothing is present as its cleared

        map.put("name","Sam Curran");
        map.put("age","40");
        map.put("Height","7..2");
        map.put("Occupation","English Cricketer");
        map.put("Country","England");
        map.put("Color","White");
        map.put("Salary","10 Million");
        map.put("null_value",null);
        map.put("null_values",null);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.keySet());
        System.out.println(map.values());
        //printing the entry set using map.entrySet() , this will fetch this result
        //[Occupation=English Cricketer, Salary=10 Million, null_values=null, Color=White,
        // null_value=null, name=Sam Curran, Country=England, Height=7..2, age=40]
        System.out.println(map.entrySet());

        System.out.println("Printing the foreach loop using Map.Entry<K,V> and map.entrySet()");

        for (Map.Entry<String,String> item: map.entrySet()) {
            System.out.println(item.getKey()+" - "+item.getValue());
        }


    }
}

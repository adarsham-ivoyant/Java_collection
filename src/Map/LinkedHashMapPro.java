package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapPro {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();

        // Adding key-value pairs to the LinkedHashMap
        linkedHashMap.put(3, "Apple");
        linkedHashMap.put(2, "Cherry");
        linkedHashMap.put(5, "Date");
        linkedHashMap.put(1, "Banana");
        linkedHashMap.put(4, "Elderberry");

        for (Map.Entry<Integer,String> entry : linkedHashMap.entrySet() ){
            System.out.println(entry.getKey()+"  "+ entry.getValue());
        }
    }
}

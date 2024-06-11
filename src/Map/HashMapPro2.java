package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapPro2 {
    public static void main(String[] args) {
        // Create a HashMap to store String keys and Integer values
        Map<String,Integer> map = new HashMap<>();

        map.put("Apple",1);
        map.put("Banana",2);
        map.put("orange",3);

        int bananacount = map.get("Banana");
        System.out.println("Banana Count "+ bananacount);


        // Retrieve a value by key
        int appleCount = map.get("Apple");
        System.out.println("Apple count: " + appleCount); // Output: Apple count: 1


        boolean hasvalue3 = map.containsKey(3);
        System.out.println(hasvalue3);

        map.remove("orange");

        System.out.println(map);
    }
}

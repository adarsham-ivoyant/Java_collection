package Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapPro {
    public static void main(String[] args) {

        TreeMap<Integer,String> treeMap = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        treeMap.put(3, "Apple");
        treeMap.put(2, "Cherry");
        treeMap.put(5, "Date");
        treeMap.put(4, "Elderberry");
        treeMap.put(1, "Banana");


        for(Map.Entry<Integer,String> temp: treeMap.entrySet()){
            System.out.println(temp);
        }

    }



}

package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetPro {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Banana");

        fruits.stream()
                .forEach(System.out::println);

        // Check if a specific element exists
        System.out.println("Specific element:"+fruits.contains("Apple"));
        System.out.println("Does the set contain 'Grapes'? " + fruits.contains("Grapes"));

        // Remove an element
        fruits.remove("Banana");

        fruits.stream()
                .forEach(System.out::println);

        System.out.println("display using iterator");
        Iterator<String> it = fruits.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Size of that arr:"+fruits.size());

        // Clear all elements from the set
        fruits.clear();
        System.out.println("After clearing the set, is it empty? " + fruits.isEmpty());

    }
}

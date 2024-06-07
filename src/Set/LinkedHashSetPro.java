package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetPro {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Banana");  // Duplicate element, will not be added

        linkedHashSet.stream()
                .forEach(System.out::println);

        // Check if a specific element exists
        System.out.println("Does the set contain 'Apple'? " + linkedHashSet.contains("Apple"));
        System.out.println("Does the set contain 'Grapes'? " + linkedHashSet.contains("Grapes"));


        System.out.println("after removing one fruites");
        // Remove an element
        linkedHashSet.remove("Orange");
        linkedHashSet.stream()
                .forEach(System.out::println);

        System.out.println("list with Iterator");
        Iterator<String> it = linkedHashSet.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("List with for each");
        for(String temp:linkedHashSet){
            System.out.println(temp);
        }

        // Get the size of the set
        System.out.println("Size of the set: " + linkedHashSet.size());

        // Clear all elements from the set
        linkedHashSet.clear();
        System.out.println("After clearing the set, is it empty? " + linkedHashSet.isEmpty());


    }
}

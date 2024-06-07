package Set.sortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class Program1 {
    public static void main(String[] args) {
        SortedSet<Integer> numbers = new TreeSet<>();

        // Add elements to the SortedSet
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);
        numbers.add(7);

        numbers.stream()
                .forEach(System.out::println);

        // Check if a specific element exists
        System.out.println("Does the set contain 3? "+ numbers.contains(3));


        // Remove an element
        numbers.remove(5);
        System.out.println("After removing the data");
        numbers.stream()
                .forEach(System.out::print);

        // Get the first (lowest) and last (highest) elements
        System.out.println("smallEle: "+numbers.first());
        System.out.println("LargeEle: "+numbers.last());

        // Get a subset of the SortedSet
        System.out.println("subset of number:"+numbers.subSet(2,8));

        // Get a headSet (elements less than the specified element)
        System.out.println("Headset less than 5:"+numbers.headSet(5));

        // Get a tailSet (elements greater than or equal to the specified element)
        System.out.println("tailset greater than or equal to 5: "+numbers.tailSet(5));


    }
}

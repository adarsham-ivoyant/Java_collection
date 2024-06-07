package Set.sortedSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NaviagbleSet {
    public static void main(String[] args) {
        NavigableSet<Integer> numbers = new TreeSet<>();

        // Add elements to the NavigableSet
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);
        numbers.add(7);

        // Elements are automatically sorted in ascending order
        numbers.stream()
                .forEach(System.out::println);

        // Using NavigableSet methods
        System.out.println("Lower than 5: " + numbers.lower(5)); // Output: 3
        System.out.println("Floor of 5: " + numbers.floor(5)); // Output: 5
        System.out.println("Ceiling of 5: " + numbers.ceiling(5)); // Output: 5
        System.out.println("Higher than 5: " + numbers.higher(5)); // Output: 7

        // Polling first and last elements
        System.out.println("Polling first: " + numbers.pollFirst()); // Output: 1
        System.out.println("After polling first: " + numbers); // Output: [3, 5, 7, 9]
        System.out.println("Polling last: " + numbers.pollLast()); // Output: 9
        System.out.println("After polling last: " + numbers); // Output: [3, 5, 7]
    }
}

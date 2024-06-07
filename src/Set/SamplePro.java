package Set;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Removing Duplicates from a List
public class SamplePro {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        numbers.add(5);

        numbers.stream()
                .forEach(System.out::println);

        Set<Integer> s1 = new HashSet<>(numbers);

        System.out.println("after converting to set for removing duplicate");

        s1.stream()
                .forEach(System.out::println);

        System.out.println("Then COnvert that back to ArrayList");

        List<Integer> temp = new ArrayList<>(s1);

        temp.stream()
                .forEach(System.out::println);
    }
}

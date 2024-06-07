package List.ArrayList.other;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("adarsh",23,"dvg"));
        personList.add(new Person("chethan",22,"ranebennur"));
        personList.add(new Person("Lingraj",21,"Blore"));
        personList.add(new Person("abhishek",20,"bihar"));


        //sort by age
        Collections.sort(personList, Comparator.comparing(Person::getName));
        System.out.println("Sorted By Name");
        personList.forEach(System.out::println);

    }
}

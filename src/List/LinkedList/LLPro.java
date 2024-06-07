package List.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LLPro {
    public static void main(String[] args) {
        List<String> l1 = new LinkedList<>();

        l1.add("adarsh");
        l1.add("abhishek");
        l1.add("sagar");
        l1.add("lingraj");
        l1.add("chetan");
        l1.add("halesh");
       // l1.addFirst("sinchana");
        // l1.addLast("shradha");
        /* above  if we use List we
            can't able to use this method but if we use
            LinkedList we can add this methods */
        l1.add(2,"sinchana");
        l1.add(5,"shradha");

        System.out.println(l1);

        l1.remove("sagar");
        l1.remove(6);
        System.out.println(l1);

        for(String t1:l1){
            System.out.println(t1);
        }

    }
}

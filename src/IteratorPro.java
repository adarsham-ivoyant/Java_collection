import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPro {

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("adarsh");
        arr.add("chethan");
        arr.add("lingraj");
        arr.add("Abhishek");


        Iterator<String> it =arr.iterator();


        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.hasNext());

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }


}

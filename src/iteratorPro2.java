import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iteratorPro2 {
    public static void main(String[] args) {
        List<Integer> arr =new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        Iterator<Integer> it = arr.iterator();

        System.out.println(it.hasNext());//T
        System.out.println(it.next());//10
        System.out.println(it.hasNext());//T
        System.out.println(it.next());//20
        System.out.println(it.hasNext());//T
        System.out.println(it.next());//30
        System.out.println(it.hasNext());//T
        System.out.println(it.next());//40
        System.out.println(it.hasNext());//T
        System.out.println(it.next());//50
        System.out.println(it.hasNext());//F


    }
}

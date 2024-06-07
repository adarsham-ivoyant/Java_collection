package List.LinkedList;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LLPro2 {
    public static void main(String[] args) {

        List<Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);

        System.out.println("Linked List:"+l1);

        Iterator<Integer> it = l1.iterator();

        System.out.println("List Item using Iterator");
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(l1.contains(10));

        System.out.println("LinkedList Size:"+l1.size());

        Object[] a = l1.toArray();
        System.out.println("converted ll to arrayList");
        for(Object b:a)
            System.out.println(b);
    }
        


}

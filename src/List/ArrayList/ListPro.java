package List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ListPro {
    public static void main(String[] args) {
        List<Integer> l1 =new ArrayList<>();

        l1.add(0,10);
        l1.add(1,20);
        l1.add(2,30);
        l1.add(3,40);

        System.out.println(l1);

        List<Integer> l2 =new ArrayList<>();
        l2.add(100);
        l2.add(200);
        l2.add(300);

        //add l2 ele to l1
        l1.addAll(1,l2);

        //print l1 data
        System.out.println(l1);

        //remove index 1
        l1.remove(1);

        System.out.println(l1);

        //get data using index
        System.out.println("getting data by using index: "+l1.get(3));

        //Replace 0 index with 1000
        l1.set(0,1000);

        System.out.println(l1);

        //get the index of 300 data
        System.out.println("index of: " +l1.indexOf(300));

        System.out.println(l1.contains(30));

        System.out.println("size of arr:"+l1.size());

        for(Integer arr:l1){
            System.out.println("arrays are :"+arr);
        }


        System.out.println(l1.hashCode());

    }
}

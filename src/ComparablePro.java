
import java.util.*;
class Point implements Comparable{
    int x;
    int y;
    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public String toString()
    {
        return "x="+x+"y="+y;
    }
    @Override
    public int compareTo(Object o){
        System.out.println("obj value:"+ o);
        Point p=(Point)o;
        System.out.println("p: "+p);

        System.out.println("p.x: "+p.x+"  "+"this x: "+this.x);

        if(this.x<p.x)
            return -1;
        else if(this.x>p.x)
            return 1;
        else
        {
            if(this.y<p.y)
                return -1;
            else if(this.y>p.y)
                return 1;
            else
                return 0;
        }
    }
}
public class ComparablePro {
    public static void main(String[] args) {
        TreeSet<Point> ts=new TreeSet<>();

        ts.add(new Point(1,7));
        System.out.println("next val");
        ts.add(new Point(2,2));
        System.out.println("netx val");
        ts.add(new Point(5,5));
        System.out.println("next val");
         ts.add(new Point(5,2));
        System.out.println("Netval");
        ts.add(new Point(2,6));

        System.out.println(ts);
    }
}

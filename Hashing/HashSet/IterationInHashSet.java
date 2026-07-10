import java.util.HashSet;
import java.util.Iterator;

public class IterationInHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(45);
        hs.add(55);
        hs.add(65);
        hs.add(75);
        System.out.println(hs.size());
        System.out.println(hs);
        // First method is to use use the Iterator interface Basically it allows to traverse the set and using its function that is iterator() we store these values of the set in it and then once it is done then we can simply get the value by using the has next function and the Dot Next function
        Iterator it = hs.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        //  advanced for loop.
        for (Integer key : hs) {
            System.out.print(key+" ");
        }
    }
}

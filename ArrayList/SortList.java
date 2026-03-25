import java.util.ArrayList;
import java.util.Collections;
public class SortList {
    public static void main(String[] args) {
        // Collections class we use to sort an arrayList.
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(45);
        arr.add(2);
        arr.add(9);
        arr.add(3);
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);
    }
}

import java.util.ArrayList;

public class Operations {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        // data adding
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        // Get the value
        // System.out.println(list[4]); Wrong
        System.out.println(list.get(2)); // Right

        // Delete the value
        // list.remove(2);
        // System.out.println(list);

        // Set Value
        list.set(2, 55);
        System.out.println(list);

        // Value contains or not
        System.out.println(list.contains(5));
        System.out.println(list.contains(56));

        // add data with index
        list.add(2,3);
        System.out.println(list);
        System.out.println(list.size());
    }
}

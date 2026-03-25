import java.util.ArrayList;

public class MultiDimension {
    public static void main(String[] args) {
        ArrayList <ArrayList<Integer>> mainList = new ArrayList<>();
        // creating the lists;
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(45); l1.add(85);
        mainList.add(l1); 
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(55); l2.add(65);
        mainList.add(l2);
        ArrayList<Integer> l3 = new ArrayList<>();
        l3.add(155); l3.add(615);
        mainList.add(l3);

        // Accessing the elements
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList <Integer> var = mainList.get(i);
            for (int j = 0; j < var.size(); j++) {
                System.out.print(var.get(j)+" ");
            }            
            System.out.println();
        }
        System.out.println(mainList);
    }
}

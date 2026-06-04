import java.util.ArrayList;

public class MultiDimension {
    public static void main(String[] args) {
        // 2D arraylist....//
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> li1 = new ArrayList<>();
        ArrayList<Integer> li2 = new ArrayList<>();
        li1.add(2);
        li1.add(4);
        li1.add(6);
        li1.add(7);
        
        li2.add(20);
        li2.add(40);
        li2.add(60);
        li2.add(70);

        arr.add(li1);
        arr.add(li2);

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) { // to get the size of inner list.
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}

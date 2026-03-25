import java.util.ArrayList;

public class FunctionInIt {
    public static void swap(ArrayList<Integer> list,int i1,int i2)
    {
       int t = list.get(i1);
       list.set(2,list.get(i2));
       list.set(4, t);
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        swap(list, 2, 4);
        System.out.println(list);
    }
}

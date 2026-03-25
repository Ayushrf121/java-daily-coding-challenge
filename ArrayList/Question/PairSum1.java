import java.util.ArrayList;
public class PairSum1
{
    // O(n^2);
    // public static ArrayList<Integer> func(ArrayList<Integer> list,int target)
    // {
    //     ArrayList<Integer> li = new ArrayList<>();
    //     for (int i = 0; i < list.size()-1; i++) {
    //         for (int j = i+1; j < list.size(); j++) {
    //             if(list.get(i)+list.get(j) == target)
    //             {
    //                 li.add(list.get(i));
    //                 li.add(list.get(j));
    //                 return li;
    //             }
    //         }
    //     }
    //     return li;
    // }
    public static boolean checkPair(ArrayList<Integer> list,int target)
    {
        int p1 = 0 , p2 = list.size()-1;
        while (p1<p2) {
            if(list.get(p1)+list.get(p2) == target)
            {
                return true;
            }else if(list.get(p1)+list.get(p2) < target)
            {
                p1++;
            }else
            {
                p2--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 5;
        if(checkPair(list, target))
        {
            System.out.println("Yes it exists");
        }else
        {
            System.out.println("No it didn't exist");
        }
    }
}
/*Lonely Numbers in ArrayList(MEDIUM)
Youaregivenanintegerarraylistnums.Anumberxislonelywhenitappearsonlyonce,and
no adjacent numbers (i.e. x + 1 and x - 1) appear in the arraylist.
Return all lonely numbers in nums. You may return the answer in any order.
Sample Input 1: nums = [10,6,5,8]
Sample Output 1: [10,8]
Explanation :- 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.- 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums. */

import java.util.ArrayList;

public class LonelyNum {
    public static ArrayList<Integer> findArrayList(ArrayList<Integer> li)
    {
        ArrayList <Integer> result = new ArrayList<>();
        if(li.size()==1)
        {
            result.add(li.get(0));
            return result;
        }
        if(li.size()==2)
        {
            if(li.get(0)+1 != li.get(1) && li.get(0)-1 != li.get(1))
            {
                result.add(li.get(0));
                result.add(li.get(1));
                return result ;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        
    }
}

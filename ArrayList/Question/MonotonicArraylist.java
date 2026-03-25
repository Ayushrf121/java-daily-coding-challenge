/*Monotonic ArrayList(EASY)
An Arraylist is monotonic if it is either monotone increasing or monotone decreasing.
AnArraylist nums ismonotone increasing if for all i <= j, nums.get(i) <=nums.get(j). An
Arraylist nums is monotone decreasing if for all i <= j, nums.get(i) >= nums.get(j).
Given an integer Arraylist nums, return true if the given list is monotonic, or false otherwise.
Sample Input 1 : nums = [1,2,2,3]
Sample Output 1: true
Sample Input 2 : nums = [6,5,4,4]
Sample Output 2: true
Sample Input 3 : nums = [1,3,2]
Sample Output 3: false
Constraints:
● 1 <= nums.size() <= 105
●-105 <= nums.get(i) <= 105 */

import java.util.ArrayList;

public class MonotonicArraylist {
    public static boolean check(ArrayList <Integer> li)
    {
        boolean inc = true , dec =true;
        for (int i = 1; i < li.size(); i++) {
            if(li.get(i)>li.get(i-1))
            {
                dec = false;
            }
            if(li.get(i)<li.get(i-1))
            {
                inc = false;
            }
        }
        return inc || dec ;
    }
    public static void main(String[] args) {
        ArrayList <Integer> li = new ArrayList<>();
        // li.add(1);
        // li.add(2);
        // li.add(2);
        // li.add(3);
        // li.add(6);
        // li.add(5);
        // li.add(4);
        // li.add(4);
        li.add(3);
        li.add(3);
        li.add(2);
        System.out.println(check(li));
    }
}

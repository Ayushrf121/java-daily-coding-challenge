package QuesPracticeArray;

public class Array7 {
    public static void main(String[] args) {
        int arr[]= {2,3,4,5,1,4,7};
        int cp = Integer.MAX_VALUE , mp =0,day=0;
        for (int i = 0; i < arr.length; i++) {
            if(cp<arr[i])
            {
                mp = Math.max(mp,(arr[i]-cp));
                day = i+1;
            }
            else
            {
                cp = arr[i];
            }
        }
        System.out.println(mp+" "+day);
    }
}

package QuesPracticeArray;

public class Array8 {
    public static void main(String[] args) {
        int arr[]= {0,1,0,2,1,0,1,3,2,1,2,1};
        int vol=0;
        int l[]=new int[arr.length];
        l[0]=arr[0];
        for (int i = 1; i < l.length; i++) {
            l[i] = Math.max(arr[i], l[i-1]);
        }
        int r[]=new int[arr.length];
        r[r.length-1] = arr[arr.length-1];
        for (int i = arr.length-2; i >= 0; i--) {
            r[i] = Math.max(arr[i],r[i+1]);
        }
        for (int i = 0; i < arr.length; i++) {
            vol += ((Math.min(l[i], r[i])-arr[i])*1); 
        }
        System.out.println(vol);
    }
}

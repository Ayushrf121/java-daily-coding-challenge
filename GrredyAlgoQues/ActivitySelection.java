import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {

    public static int selectActivityWithUnsortedEnd(int[]start,int[]end){
        
        int maxAct =0;
        // sort the end for the activity...
        int arr[][] = new int[start.length][3];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = i;
            arr[i][1] = start[i];
            arr[i][2] = end[i];
        }
        // sorting the 2d array for getting the sorted end so we use the comparator and its Lambda Function
        // Comparator is an interface which is used to sort the java objects.
        // It tell the java to sort the 2d array based on their 2nd column.
        Arrays.sort(arr,Comparator.comparingDouble(o->o[2]));
        ArrayList<Integer> li = new ArrayList<>();
        maxAct = 1;
        li.add(arr[0][0]);
        int lastEnd = arr[0][2];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i][1]>=lastEnd){
                maxAct++;
                li.add(arr[i][0]);
                lastEnd=arr[i][2];
            }
        }
        System.out.println(li);
        return maxAct;
    }
    public static int selectActivity(int[]start,int[]end){

        // initially we take no activity
        int maxAct=0;//count the no. of activities
        // now we choosed the activity first..
        ArrayList<Integer> li = new ArrayList<>();
        maxAct = 1;
        li.add(0);
        int lastEnd = end[0];
        for (int i = 1; i < end.length; i++) {
            if(start[i]>=lastEnd){
                maxAct++;
                // it tell which activity we done till end..
                li.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println(li);
        return maxAct;
    }
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        System.out.println("Total no. of activity a person can do : "+selectActivity(start, end));
        // if the end is not sorted or sorting done based on the start then higher chance that only 1 activity will be done and rest get skipped so we need to sort using end.
        int st[]={0,1,3,5,5,8};
        int ed[]={6,2,4,7,9,9};
        System.out.println("Total no. of activity a person can do(when given the unsorted end time) : "+selectActivityWithUnsortedEnd(st, ed));
    }
}

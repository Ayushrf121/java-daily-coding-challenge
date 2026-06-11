import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JobSequencing {
    static class Job{
        int deadline;
        int profit;
        char id;
        Job(int deadline,int profit,char id){
            this.deadline = deadline;
            this.profit = profit;
            this.id = id;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][] = {{4, 80}, {1, 10}, {1, 40}, {1, 30}};
        ArrayList<Job> jobs = new ArrayList<>();
        char ch = 'A';
        for(int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(jobsInfo[i][0],jobsInfo[i][1],ch));
            ch++;
        }
        // Collections.sort(jobs,(a,b)-> a.profit-b.profit); // sort in ascending order.
        Collections.sort(jobs,(a,b)-> b.profit-a.profit); // sort in descending order.

        // get the maximum deadline.
        int maxDeadline = 0;
        for (int i = 0; i < jobsInfo.length; i++) {
            maxDeadline = Math.max(maxDeadline, jobsInfo[i][0]);
        }
        int totalProfit= 0;
        char slots[] = new char[maxDeadline];
        Arrays.fill(slots,'-');
        for (int i = 0; i < jobs.size(); i++) {
            for (int j = jobs.get(i).deadline-1; j>=0; j--) {
                if(slots[j]=='-'){
                    slots[j]=jobs.get(i).id;
                    totalProfit+=jobs.get(i).profit;
                    break;
                }
            }
        }
        System.out.println("Total Profit : "+totalProfit);
    }
}

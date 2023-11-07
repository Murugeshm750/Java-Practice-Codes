package pattern;
import java.util.*; 
class Job {
    int start_time;
    int end_time;
    int profit;
    
    Job(int start_time, int end_time, int profit) {
        this.start_time = start_time;
        this.end_time = end_time;
        this.profit = profit;
    }
}

class JobComparator implements Comparator<Job> {
    public int compare(Job a, Job b) {
        return a.end_time - b.end_time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Jobs");
        int n = sc.nextInt();
        List<Job> jobs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter job start time, end time, and earnings");
            int start_time = sc.nextInt();
            int end_time = sc.nextInt();
            int profit = sc.nextInt();
            jobs.add(new Job(start_time, end_time, profit));
        }
        Collections.sort(jobs, new JobComparator());
        int max_profit = getMaxProfit(jobs);
        System.out.println("The number of tasks and earnings available for others");
        System.out.println("Task: " + (n - jobs.size()));
        System.out.println("Earnings: " + max_profit);
    }
    
    public static int getMaxProfit(List<Job> jobs) {
        int n = jobs.size();
        int[] dp = new int[n];
        dp[0] = jobs.get(0).profit;
        for (int i = 1; i < n; i++) {
            int profit = jobs.get(i).profit;
            int prev_job_index = getPrevNonConflictingJob(jobs, i);
            if (prev_job_index != -1) {
                profit += dp[prev_job_index];
            }
            dp[i] = Math.max(profit, dp[i-1]);
        }
        return dp[n-1];
    }
    
    public static int getPrevNonConflictingJob(List<Job> jobs, int i) {
        for (int j = i-1; j >= 0; j--) {
            if (jobs.get(j).end_time <= jobs.get(i).start_time) {
                return j;
            }
        }
        return -1;
    }
}

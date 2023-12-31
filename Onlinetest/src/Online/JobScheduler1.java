package Online;
import java.util.*;

	class Job implements Comparable<Job>{
	    int startTime;
	    int endTime;
	    int profit;

	    public Job(int startTime, int endTime, int profit){
	        this.startTime = startTime;
	        this.endTime = endTime;
	        this.profit = profit;
	    }

	    @Override
	    public int compareTo(Job other){
	        return this.endTime - other.endTime;
	    }
	}

	public class JobScheduler1{
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of Jobs");
	        int n = sc.nextInt();

	        List<Job> jobs = new ArrayList<>();

	        for(int i=0; i<n; i++){
	            System.out.println("Enter job start time, end time, and earnings");
	            int startTime = sc.nextInt();
	            int endTime = sc.nextInt();
	            int profit = sc.nextInt();
	            jobs.add(new Job(startTime, endTime, profit));
	        }

	        // sort the jobs based on their end times in ascending order
	        Collections.sort(jobs);

	        // use dynamic programming to find the maximum profit
	        int[] maxProfit = new int[n];
	        maxProfit[0] = jobs.get(0).profit;

	        for(int i=1; i<n; i++){
	            // find the latest non-conflicting job
	            int latestNonConflictingJob = -1;
	            for(int j=i-1; j>=0; j--){
	                if(jobs.get(j).endTime <= jobs.get(i).startTime){
	                    latestNonConflictingJob = j;
	                    break;
	                }
	            }

	            // include the current job or exclude it
	            int includeProfit = jobs.get(i).profit;
	            if(latestNonConflictingJob != -1){
	                includeProfit += maxProfit[latestNonConflictingJob];
	            }

	            int excludeProfit = maxProfit[i-1];

	            maxProfit[i] = Math.max(includeProfit, excludeProfit);
	        }

	        // the maximum profit will be at the last index of the maxProfit array
	        int maxLokeshProfit = maxProfit[n-1];
	        int tasksLeft = n;
	        int otherEarnings = 0;

	        // calculate the number of tasks and earnings available for others
	        for(int i=n-1; i>=0; i--){
	            if(maxProfit[i] == maxLokeshProfit){
	                tasksLeft--;
	                otherEarnings += jobs.get(i).profit;
	                maxLokeshProfit -= jobs.get(i).profit;
	            }
	            else{
	                break;
	            }
	        }

	        System.out.println("The number of tasks and earnings available for others");
	        System.out.println("Task: " + tasksLeft);
	        System.out.println("Earnings "+otherEarnings);

	        

	    }
	}


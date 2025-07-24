package binarySearchMedium;

//You are given an array weights where weights[i] represents the weight of the i-th package on a conveyor belt. All the packages must 
//be shipped in the order given from one port to another within days days.
//Each day, the ship can carry a contiguous sequence of packages, as long as the total weight does not exceed its maximum capacity.
//Your task is to find the minimum possible capacity of the ship so that all packages can be shipped within the given number of days.
//Examples:
//Input: weights = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], days = 5
//Output: 15
//Explanation:
//Minimum ship capacity = 15. One way to ship in 5 days:
//
//Day 1: 1 + 2 + 3 + 4 + 5 = 15
//Day 2: 6 + 7 = 13
//Day 3: 8
//Day 4: 9
//Day 5: 10
public class shipPackageswithinDdays {
	
	public static int findDays(int[] weights,int capacity) {
		int days=1;
		int load=0;
		for(int i=0;i<weights.length;i++) {
			if(load+weights[i]>capacity) {
				days+=1;//move to next day
				load=weights[i];//load the weight
			}else {
				load+=weights[i];
			}
		}
		return days;
	}

	public static void main(String[] args) {
		 int nums[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; int days = 5;
		 //here range is from max in array to sumof elements in array
		 int h=0;int l=Integer.MIN_VALUE;
		 for(int i=0;i<nums.length;i++) {
			 h+=nums[i];
			 l=Math.max(l,nums[i]);
		 }
		 int ans=-1;
		 while(l<=h) {
			 int mid=(l+h)/2;
			 int numOfDays=findDays(nums,mid);
			 if(numOfDays<=days) {
				 ans=mid;
				 h=mid-1;
			 }else {
				 l=mid+1;
			 }
		 }
		 System.out.println(ans);
		 
		 //brute force
//	     for (int i = l; i <= h; i++) {
//	            if (findDays(weights, i) <= d) {
//	                return i;
//	            }
//	        }

	}

}

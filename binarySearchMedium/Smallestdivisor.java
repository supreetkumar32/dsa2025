package binarySearchMedium;

//Given an array of integers nums and an integer limit as the threshold value, find the smallest positive integer divisor such that
//upon dividing all the elements of the array by this divisor, the sum of the division results is less than or equal to the threshold 
//value.
//Each result of the division is rounded up to the nearest integer greater than or equal to that element.
//Input: nums = [1, 2, 3, 4, 5], limit = 8
//Output: 3
//Explanation: We can get a sum of 15(1 + 2 + 3 + 4 + 5) if we choose 1 as a divisor. 
//The sum is 9(1 + 1 + 2 + 2 + 3) if we choose 2 as a divisor. Upon dividing all the elements of the array by 3, we get 1,1,1,2,2
//respectively. Now, their sum is equal to 7 <= 8 i.e. the threshold value. So, 3 is the minimum possible answer.

public class Smallestdivisor {
	
	public static int maxinarray(int nums[]) {
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>ans) {
				ans=nums[i];
			}
		}
		return ans;
	}
	
	public static int sumofdivisors(int[] nums,int mid) {
		int ans=0;
		for(int i=0;i<nums.length;i++) {
			ans+=Math.ceil((double)nums[i]/(double)mid);
		}
		return ans;
	}

	public static void main(String[] args) {
		int nums[]= {8,4,2,3};
		int limit=10;
		int ans=0;
		int l=1,h=maxinarray(nums);
		while(l<=h) {
			int mid=(l+h)/2;
			int total=sumofdivisors(nums,mid);
			if(total<=limit) {
				ans=mid;
				h=mid-1;
			}else {
				l=mid+1;
			}
			
		}
		System.out.println(ans);

	}

}

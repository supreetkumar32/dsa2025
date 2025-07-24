package binarySearchMedium;

//A monkey is given n piles of bananas, where the 'ith' pile has nums[i] bananas. An integer h represents the total time in hours to 
//eat all the bananas.
//Each hour, the monkey chooses a non-empty pile of bananas and eats k bananas. If the pile contains fewer than k bananas, the monkey
//eats all the bananas in that pile and does not consume any more bananas in that hour.
//Determine the minimum number of bananas the monkey must eat per hour to finish all the bananas within h hours.

public class KokoEatingBananas {
	
	public static int maxinarray(int nums[]) {
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>ans) {
				ans=nums[i];
			}
		}
		return ans;
	}
	
	public static int sumofhours(int[] nums,int mid) {
		int ans=0;
		for(int i=0;i<nums.length;i++) {
			ans+=Math.ceil((double)nums[i]/(double)mid);
		}
		return ans;
	}

	public static void main(String[] args) {
		int nums[]= {7,15,6,3};
		int target=8;
		int n=nums.length;
		int l=1,h=maxinarray(nums);
		int ans=0;
		while(l<=h) {
			int mid=(l+h)/2;
			int totalh=sumofhours(nums,mid);
			if(totalh<=target) {
				ans=mid;
				h=mid-1;
			}else {
				l=mid+1;
			}
		}
		System.out.println(ans);
	}

}

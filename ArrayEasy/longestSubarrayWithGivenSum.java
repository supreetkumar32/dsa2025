package ArrayEasy;

import java.util.HashMap;

public class longestSubarrayWithGivenSum {

	public static void main(String[] args) {
		int[] nums = {10, 5, 2, 7, 1, 9, 15};
		//prefixSum   10  15 17 24 25 34 49
		int target=15;
		int n=nums.length;
		
		//efficient 
		HashMap<Integer,Integer> hm = new HashMap<>();
		int currSum=0,start=0,end=-1,finalStart=0,finalEnd=0;
		int maxlength=0,length=0;

		for(int i=0;i<n;i++) {
			currSum=currSum+nums[i];
			if(hm.containsKey(currSum-target)) {
				start=hm.get(currSum-target)+1;
				end=i;
				length=end-start+1;
				if(length>maxlength) {
					maxlength=length;
					finalStart=start;
					finalEnd=i;
				}
			}
			hm.put(currSum, i);
		}
		if(end==-1) {
			System.out.println("not found");
		}else {
			System.out.println("Found at starting "+ finalStart +" end "+finalEnd);
			System.out.println("maxlength "+maxlength);
		}
		
		
		
		
		
		
		
		
		
				
//		//brute force
//		int length=0;
//		for(int i=0;i<n;i++) {
//			int sum=0;
//			for(int j=i;j<n;j++) {
//				sum=sum+nums[j];
//				if(sum==k) {
//					length=Math.max(length, j-i+1);
//					
//				}
//			}
//		}
//		System.out.println(length);

	}

}

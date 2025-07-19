package ArrayMedium;

import java.util.Arrays;
import java.util.HashMap;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		int[] nums= {100, 4, 200, 1, 3, 2};
		int n=nums.length;
		
		//optimal
		HashMap<Integer,Boolean> hm=new HashMap<>();
		for(int x:nums) {
			hm.put(x,true);
		}
		for(int x:nums) {
			if(hm.containsKey(x-1)) {
				hm.put(x, false);
			}
		}
		
		int maxstartpoint=0;
		int maxlen=0;
		for(int val:nums) {
			if(hm.get(val)==true) {
				int templen=1;
				int tempstartpoint=val;
				while(hm.containsKey(val+templen)) {
					templen++;
				}
				if(templen>maxlen) {
					maxstartpoint=tempstartpoint;
					maxlen=templen;				
				}
			}
		}
		System.out.println("maxstartpoint "+maxstartpoint);
		System.out.println("maxlen "+maxlen);
		
//		note:
//			The outer for loop runs n times.
//
//			The while loop looks for consecutive numbers.
//
//			Across all numbers, each key is checked in the while loop at most once because you only start sequences at hm.get(val) == true.
//
//			So, the total work done inside the while loop across all n elements is O(n).
//
//			Hence, this step is O(n).
		
		//better
//		Arrays.sort(nums);
//		int count=0,longest=1,lastSmaller=Integer.MIN_VALUE;
//		for(int i=0;i<n;i++) {
//			if(nums[i]-1 ==lastSmaller) {
//				count++;
//				lastSmaller=nums[i];
//			}else if(lastSmaller!= nums[i]) {
//				count=1;
//				lastSmaller=nums[i];				
//			}
//			longest=Math.max(count, longest);
//		}
//		
//		System.out.println(longest);
		
				
		//brute force
//		int longest=1;
//		for(int i=0;i<n;i++) {
//			int element=nums[i];
//			int count=0;
//			while(linearSearch(nums,element+1)==true) {
//				element+=1;
//				count+=1;
//			}
//			longest=Math.max(count, longest);
//		}
//		System.out.println(longest);

	}

//	private static boolean linearSearch(int[] nums, int element) {
//		int n=nums.length;
//		for(int i=0;i<n;i++) {
//			if(nums[i]==element)
//				return true;
//		}
//		
//		return false;
//	}

}

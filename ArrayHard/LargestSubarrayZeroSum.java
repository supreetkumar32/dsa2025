package ArrayHard;

import java.util.HashMap;

public class LargestSubarrayZeroSum {

	public static void main(String[] args) {
		int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
		int target=0;
		
		HashMap<Integer,Integer> hm=new HashMap<>();
		hm.put(0, -1);
		int currSum =0,start=0,end=-1,finalStart=0,finalEnd=0;
		int length=0,maxLength=0;
		for(int i=0;i<arr.length;i++) {
			currSum+=arr[i];
			if(hm.containsKey(currSum-target)) {
				start=hm.get(currSum-target)+1;
				end=i;
				length=end-start+1;
				if(length>maxLength) {
					maxLength=length;
					finalStart=start;
					finalEnd=i;				
				}
			}
			if(!hm.containsKey(currSum)) {
				hm.put(currSum, i);
			}
		}
		
		System.out.println("Found at starting "+ finalStart +" end "+finalEnd);
		System.out.println("maxlength "+maxLength);

	}

}

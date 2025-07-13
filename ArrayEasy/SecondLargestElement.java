package ArrayEasy;

import java.util.Arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
	   int nums[]= {3, 3, 6, 1,-1,99,99,7};
	   
//	   //brute force
//	   int largest=nums[nums.length-1];
//	   int secondLargest=0;
//	   Arrays.sort(nums);
//	   for(int i=nums.length-2;i>=0;i--) {
//		   if(nums[i]!=largest) {
//			   secondLargest=nums[i];
//			   break;
//		   }
//	   }
//	   System.out.println("largest "+largest);
//	   System.out.println("second largest "+secondLargest);
	   
	   //optimize
	   int n=nums.length;
	   int largest=nums[0];
	   int secondlargest=Integer.MIN_VALUE;
	   for(int i=1;i<n;i++) {
		   if(nums[i]>largest ) {
			   secondlargest=largest;
			   largest=nums[i];
		   }else if(nums[i]<largest && nums[i]>secondlargest) {
			   secondlargest=nums[i];
		   }
	   }
	   
	   System.out.println("largest "+largest);
	   System.out.println("second largest "+secondlargest);
	   
	   

	}

}

package ArrayEasy;

public class LargestElement {

	public static void main(String[] args) {
       int nums[]= {3, 3, 6, 1,-1,99};
       int max=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++) {
    	   if(max<nums[i]) {
    		   max=nums[i];
    	   }
       }
       System.out.println(max);

	}

}

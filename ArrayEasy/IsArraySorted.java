package ArrayEasy;

//https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2/
public class IsArraySorted {

	public static void main(String[] args) {
		 int nums[]= { 1,2,3,4,5,6,5,4};
		 int n=nums.length;
		 int flag=0;
		 for(int i=1;i<n;i++) {
			 if(nums[i-1]>nums[i]) {
				 flag=1;
			 }
		 }
		 if(flag==1) {
			 System.out.println("not sorted");
		 }else {
			 System.out.println("sorted");
		 }
		 

	}

}

package ArrayEasy;

public class maxConsecutiveOne {

	public static void main(String[] args) {
		 int nums[]= {1, 1, 0, 0, 1, 1, 1, 0};
		 int n=nums.length;
		 int count=0;
		 int maxcount=0;
		 for(int i=0;i<n-1;i++) {
			if(nums[i]==1) {
				count++;
			}else {
				count=0;
			}
			maxcount=Math.max(maxcount, count);
		 }
		 System.out.println(maxcount);

	}

}

package binarySearchBasic;

public class searchInsertPosition {

	public static void main(String[] args) {
		int[] nums = {1, 3, 5, 6};
		int target = 5;
		int l=0;
        int h=nums.length-1;
        int ans=nums.length;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]>=target){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        System.out.println(ans);

	}

}

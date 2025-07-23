package binarySearchBasic;

public class searchInRotatedSortedArray {

	public static void main(String[] args) {
		int [] nums= {4, 5, 6, 7, 0, 1, 2};
		int target=0;
		int n=nums.length;
		int low=0,high=n-1;
		int ans=-1;
		while(low<=high) {
			//left sorted
			int mid=(low+high)/2;
			if(nums[mid]==target) {
				ans=mid;
				System.out.println("found "+ans);
				break;
			}
			if(nums[low]<=nums[mid]) {
				if(nums[low]<=target && target<=nums[mid]) {
					high=mid-1;
				}else {
					low=mid+1;
				}
			}else {
			
			//right sorted
				if(nums[mid]<=target && target<=nums[high]) {
					low=mid+1;
				}else {
					high=mid-1;
				}	
			}
		}
		
		

	}

}

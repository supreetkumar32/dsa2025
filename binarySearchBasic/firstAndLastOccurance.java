package binarySearchBasic;

public class firstAndLastOccurance {

	 public static  int lowerPosition(int [] nums,int target){
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
	        return ans;
	    }

	        public static int upperPosition(int [] nums,int target){
	        int l=0;
	        int h=nums.length-1;
	        int ans=nums.length;
	        while(l<=h){
	            int mid=(l+h)/2;
	            if(nums[mid]>target){
	                ans=mid;
	                h=mid-1;
	            }else{
	                l=mid+1;
	            }
	        }
	        return ans;
	    }

	    public  static int[] searchRange(int[] nums, int target) {
	       int[] ans =new int[2];
	       int lb= lowerPosition(nums,target);
	       int ub= upperPosition(nums,target)-1;
	       if(lb==nums.length || nums[lb]!=target) {
	        ans[0]=-1;
	        ans[1]=-1;
	        return ans;
	       }
	        ans[0]=lb;
	        ans[1]=ub;
	 
	        return ans;
	    }
	    
	    public static void main(String[] args) {
	    	int nums[]= {5,7,7,8,8,10};
	    	int target=8;
	    	searchRange(nums,target);
	    }
}

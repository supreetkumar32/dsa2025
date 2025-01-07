package array;

public class prac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {7,8,9,11,12};
		int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i] && nums[i]>=0){
                min=nums[i];
            }
        }
        int max=Integer.MIN_VALUE;
	    for(int i=0;i<nums.length;i++){
	        if(max<nums[i] && nums[i]>=0){
	            max=nums[i];
	        }
	    }
       System.out.println("min: "+ min);
       System.out.println("max: "+ max);
       
       int sum=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]>0){
            sum=sum+nums[i];
        }
       }
       System.out.println("sum: "+ sum);
       int maxsum=(max*(max+1))/2;
       int minsum=(min*(min+1))/2;
       System.out.println("maxsum: "+ maxsum);
       System.out.println("minsum: "+ minsum);
       int totalsumfrommintomax=maxsum-minsum+min;
       System.out.println("totalsumfrommintomax: "+ totalsumfrommintomax);
       int result=totalsumfrommintomax-sum;
       System.out.println("result: "+result);


	}

}

package recursion;

public class targetSumSubset {
	
	public static void printTargetSumSubsets(int[] arr,int idx,String set,int sum,int target) {
		if(idx==arr.length) {
			if(sum==target) {
				System.out.println(set);
			}
			return;
		}
		printTargetSumSubsets(arr,idx+1,set+arr[idx]+",",sum+arr[idx],target);
		printTargetSumSubsets(arr,idx+1,set,sum,target);
	}

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,70};
		int target=70;
		printTargetSumSubsets(arr,0,"",0,target);

	}

}

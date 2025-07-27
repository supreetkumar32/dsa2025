package ArrayHard;

public class maxProductSubarray {

	public static void main(String[] args) {
		int [] arr= {4, -5, 3,0, 7, 1, 2};
		//int[] arr= {1,-1,0,-1,-2};
		
		//optimal solution
		int pre=1,suff=1;
		int maxProd=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(pre==0) pre=1;
			if(suff==0) suff=1;
			pre=pre*arr[i];
			suff=suff*arr[arr.length-i-1];
			maxProd=Math.max(maxProd, Math.max(pre,suff));
		}
		System.out.println(maxProd);
		
		
		//brute force
//		int maxProd=Integer.MIN_VALUE;
//		for(int i=0;i<arr.length;i++) {
//			int prod=1;
//			for(int j=i;j<arr.length;j++) {
//				prod=prod*arr[j];
//				maxProd=Math.max(maxProd, prod);
//			}
//		}
//
//		System.out.println(maxProd);
	}

}

package recursion;

public class MaxInArray {
	public static int maxOfArray(int[]a, int i) {
		if(i==a.length-1) return a[i];
		int misa=maxOfArray(a,i+1);
		if(misa>a[i])
			return misa;
		else
			return a[i];
	}

	public static void main(String[] args) {
		int a[]= {11,222,31,4,50};
		int i=0;
		int max=maxOfArray(a,i);
		System.out.println(max);
	}

}

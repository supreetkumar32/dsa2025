package recursion;

public class PrintArrayElements {
	public static void pt(int[]a,int n) {
		if(n>=a.length) return;
		System.out.print(a[n]+" ");
		pt(a,n+1);
		//System.out.print(a[n]+" ");//printing in reverse order
	}
	
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int i=0;
		pt(a,i);

	}

}

package recursion;

public class reverse {
	public static void reverse(int a[],int i,int j) {
		
		if(i>=j)
			return;
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		reverse(a,i+1,j-1);
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int i=0,j=arr.length-1;
		reverse(arr,i,j);
        for(int z=0;z<arr.length;z++) {
        	System.out.print(arr[z]+ " ");
        }

	}

}

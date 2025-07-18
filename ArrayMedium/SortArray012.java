package ArrayMedium;

public class SortArray012 {

	public static void main(String[] args) {
		int[] arr= {0,2,2,1,1,0,0,2,1};
		int n=arr.length;
		int zero=0,one=0,two=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				zero++;
			}else if(arr[i]==1){
				one++;
			}else {
				two++;
			}
		}
		for(int i=0;i<zero;i++) {
			arr[i]=0;
		}
		for(int i=zero;i<zero+one;i++) {
			arr[i]=1;
		}
		for(int i=zero+one ;i<zero+one+two;i++) {
			arr[i]=2;
		}
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}

}

package array;

public class movezerostoright {
	
	public static void main(String[] args) {
		
		int a[]= {0,3,0,5,4,0,7,8,0};
		int i=0;
		int j=a.length-1;
		while(i<j) {
			if(a[i]!=0) {
				i++;
			}else if(a[i]==0 && a[j]!=0) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}else {
				j--;
			}
		}
	     

		
        for(int z=0;z<a.length;z++) {
        	System.out.println(a[z]);
        }
	}
	

}

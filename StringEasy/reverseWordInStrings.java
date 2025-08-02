package StringEasy;

public class reverseWordInStrings {
    public static void reversed(char a[],int start,int end) {
  	  while(start<end) {
  		  char temp=a[start];
  		  a[start]=a[end];
  		  a[end]=temp;
  		  start++;end--;
  	  }
    }

	public static void main(String[] args) {
		
		//type1
//		String s="    hello     world   ";
//		
//		//brute force
//		String arr[]=s.split(" ");
//		//String res="";
//		StringBuilder res=new StringBuilder();
//		for(int i=arr.length-1;i>=0;i--) {
//			if(arr[i].length()==0) {
//				continue;
//			}
//			//for first word
//			if(res.length()==0) {
//				//res+=arr[i];
//				res.append(arr[i]);
//			}else {
//				//res+=" "+arr[i];
//				res.append(" ");
//				res.append(arr[i]);
//			}
//		}
//		//System.out.println(res);
//		System.out.println(res.toString());//world hello
		
		//type2
		String s="how's the josh";//s'woh eht hsoj		

		char a[]=s.toCharArray();
		int n=a.length;
		int startPointer=0;
		for(int endpointer=0;endpointer<=n;endpointer++) {
			if(endpointer==n || a[endpointer]==' ') {
				reversed(a,startPointer,endpointer-1);
				startPointer=endpointer+1;
			}
		}
      System.out.println(new String(a));
      

	}

}

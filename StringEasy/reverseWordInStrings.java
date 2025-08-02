package StringEasy;

public class reverseWordInStrings {

	public static void main(String[] args) {
		String s="    hello     world   ";
		
		//brute force
		String arr[]=s.split(" ");
		//String res="";
		StringBuilder res=new StringBuilder();
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i].length()==0) {
				continue;
			}
			//for first word
			if(res.length()==0) {
				//res+=arr[i];
				res.append(arr[i]);
			}else {
				//res+=" "+arr[i];
				res.append(" ");
				res.append(arr[i]);
			}
		}
		//System.out.println(res);
		System.out.println(res.toString());

	}

}

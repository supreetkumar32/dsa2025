package recursion;

public class reverseString {
	public static String ReverseString(String s,String res,int index) {
		if(index<0) {
			return res;
		}
		res=res+s.charAt(index);
		return ReverseString(s,res,index-1);
	}

	public static void main(String[] args) {
		String s="hello";
		String result="";
		int index=s.length()-1;
		String output=ReverseString(s,result,index);
		System.out.println(output);

	}

}

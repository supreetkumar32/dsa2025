package recursion;

public class permutation {

	public static void printPermutation(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<ques.length();i++) {
			char ch=ques.charAt(i);
			String qleft=ques.substring(0,i);
			String qright=ques.substring(i+1);
			String roq=qleft+qright;
			printPermutation(roq,ans+ch);
		}
	}
	
	public static void main(String[] args) {
		String str="abcd";
		printPermutation(str,"");

	}

}

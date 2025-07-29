package StringBasics;

public class removeOutermostParenthesis {

	public static void main(String[] args) {
		String s="(()())(())";
		int count=0;
		String ans="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==')') {
				count--;
			}
			if(count!=0) {
				ans = ans+ s.charAt(i);
			}
			if(s.charAt(i)=='(') {
				count++;
			}			
		}
		
		System.out.println(ans);
		
		//using stringBuffer
//		  StringBuilder ans = new StringBuilder();
//	        int count=0;
//	        for(int i=0;i<s.length();i++){
//	            			if(s.charAt(i)==')') {
//					count--;
//				}
//				if(count!=0) {
//					ans.append(s.charAt(i));
//				}
//				if(s.charAt(i)=='(') {
//					count++;
//				}	
//	        }
//	        return ans.toString();

	}

}

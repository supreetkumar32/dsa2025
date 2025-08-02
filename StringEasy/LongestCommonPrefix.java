package StringEasy;

import java.util.Arrays;

public class LongestCommonPrefix {
	
	//brute force
//    public static String common(String s1,String s2){
//        int n=Math.min(s1.length(),s2.length());
//        StringBuilder sb=new StringBuilder();
//        for(int i=0;i<n;i++){
//            if(s1.charAt(i)==s2.charAt(i)){
//                sb.append(s1.charAt(i));
//            }else{
//                break;
//            }
//        }
//        return sb.toString();
//    }
//
//    public static String longestCommonPrefix(String[] strs) {
//        String res=strs[0];
//        for(int i=1;i<strs.length;i++){
//            res=common(res,strs[i]);
//        }
//        return res;
//    }
	
	 public static String longestCommonPrefix(String[] strs) {
	 StringBuffer ans=new StringBuffer();
	 Arrays.sort(strs);
	 String one=strs[0];
	 String two=strs[strs.length-1];
	 int n=Math.min(one.length(),two.length());
	 for(int i=0;i<n;i++) {
		 if(one.charAt(i)==two.charAt(i)) {
			 ans.append(one.charAt(i));
		 }else {
			 break;
		 }
	 }
	 return ans.toString();
	 }

	public static void main(String[] args) {
		String strs[] = {"flower","flow","flight"};
		String ans=longestCommonPrefix(strs);
		System.out.println(ans);
		
		

	}

}

package StringEasy;


import java.util.Arrays;
import java.util.HashMap;
//https://www.youtube.com/watch?v=TKGEUoVwdOk
public class Isomorphic {
	
	//method 1
//	public static boolean isisomorphic(String a,String b) {
//		HashMap<Character,Character> one=new HashMap<>();
//		HashMap<Character,Character> two=new HashMap<>();
//		int n=a.length();
//		for(int i=0;i<n;i++) {
//			char s1=a.charAt(i);
//			char t1=b.charAt(i);
//			if(!one.containsKey(s1)) {
//				one.put(s1, t1);
//			}
//			if(!two.containsKey(t1)) {
//				two.put(t1, s1);
//			}
//			if(one.get(s1)!=t1 || two.get(t1)!=s1){
//				return false;
//			}			
//		}
//		return true;
//	}
	
	//method 2
	public static boolean isisomorphic(String a,String b) {
		int one[]=new int[128];
		int two[]=new int[128];
		Arrays.fill(one,-1);
		Arrays.fill(two, -1);
		int n=a.length();
		for(int i=0;i<n;i++) {
			char s1=a.charAt(i);
			char t1=b.charAt(i);
			if(one[s1]==-1) {
				one[s1]=t1; //it will store teh ascii value 
			}
			if(two[t1]==-1) {
				two[t1]=s1;
			}

			if(one[s1]!=t1 || two[t1]!=s1){
				return false;
			}			
		}
		return true;
	}


	public static void main(String[] args) {
		String a = "egg";
		String b = "add";
		boolean ans=isisomorphic(a,b);
		System.out.println(ans);

	}

}


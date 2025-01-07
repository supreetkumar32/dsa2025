package sstrings;
import java.util.HashSet;
public class Duplicate {

	public static void main(String[] args) {
		String s="Supreet";
		char[] a= s.toCharArray();
		HashSet<Character> hs=new HashSet<>();
		for(int i=0;i<s.length();i++) {
			if(hs.contains(a[i])) {
				System.out.println(a[i]);
			}else {
				hs.add(a[i]);
			}
		}
		

	}

}

package StringEasy;

public class RotationOfOther {

	public static void main(String[] args) {
		String s1="Supreet";
		String s2="preet";
		String s3=s1+s2;
	    if(s3.contains(s2)) {
	    	System.out.println("rotational string");
	    }else {
	    	System.out.println("not a rotational string");
	    }

	}

}

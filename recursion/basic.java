package Recursion;

public class basic {

	public static void 	printTill1toN(int n) {
		if(n>5) return;
		System.out.println(n);
		printTill1toN(n+1);//it will print 1 to 4
		
	}
	public static void printFromNto1(int n) {
		if(n<1) return;
		System.out.println(n);
		printFromNto1(n-1);//it will print from n to 1
			
		
	}
	public static void printFrom1ton(int n) {
		if(n<1) return;		
		printFrom1ton(n-1);//it will print from 1 to n
		System.out.println(n);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		printTill1toN(n);
		printFromNto1(n);
		printFrom1ton(n);
		
	}

}

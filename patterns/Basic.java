package patterns;

//For the outer loop ,count the number of lines
//For the inner loop ,focus on the columns and connect them somehow to the rows
// Print * inside the inner loop

public class Basic {
	
	public static void pattern1(int n) {
//		***
//		***
//		***
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern2(int n) {
//		*
//		**
//		***
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern3(int n) {
//		1 
//		1 2 
//		1 2 3 
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	public static void pattern4(int n) {
//		1 
//		2 2 
//		3 3 3 
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	public static void pattern5(int n) {
//		***
//		**
//		*
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void pattern6(int n) {
//		1 2 3 
//		1 2 
//		1 
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		//pattern1(3);
		//pattern2(3);
		//pattern3(3);
		//pattern4(3);
		//pattern5(3);
		pattern6(3);
//		pattern3(3);
//		pattern3(3);

	}

}

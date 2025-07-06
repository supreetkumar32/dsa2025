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
	
	

	public static void main(String[] args) {
		//pattern1(3);
		pattern2(3);

	}

}

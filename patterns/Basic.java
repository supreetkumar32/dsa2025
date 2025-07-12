package patterns;
//reference video: https://www.youtube.com/watch?v=tNm_NNSB3_w&list=PLgUwDviBIf0oF6QL8m22w1hIDC1vJ_BHz&index=4
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
	
	public static void pattern7(int n) {
//		   *  
//		  *** 
//		 *****
//                                           space,star,space   (n-i-1) (2*i+1) (n-i-1)
//0  space	space space star space space space  3,1,3
//1  space	space  star  star star space space  2,3,2
//2  space	star  star   star star star  space  1,5,1
//3  star	star  star   star star star  star   0,7,0
		for(int i=0;i<n;i++) {
			//space
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			//star
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			//space
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
             System.out.println();
		}
	}
	
	public static void pattern8(int n) {
//		*******
//		 ***** 
//		  ***  
//		   *    
//                                        space,star,space   (i) (*n -(2*i +1)) (i)
//0  space	space space star space space space  0,7,0
//1  space	space  star  star star space space  1,5,1
//2  space	star  star   star star star  space  2,3,2
//3  star	star  star   star star star  star   3,1,3
		for(int i=0;i<n;i++) {
			//space
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			//star
			for(int j=0;j<(2*n -(2*i +1));j++) {
				System.out.print("*");
			}
			//space
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
          System.out.println();
		}
	}
	
	public static void pattern9(int n) {
		//combining pattern 7
//		   *  
//		  *** 
//		 *****
//		*******
		//combining pattern 8
//		*******
//		 ***** 
//		  ***  
//		   * 
//		we get:
//		    *   
//		   ***  
//		  ***** 
//		 *******
//		 *******
//		  ***** 
//		   ***  
//		    * 
		
		pattern7(n);
		pattern8(n);

	}

	public static void pattern10(int n) {
//		*
//		**
//		***
//		**
//		*
		pattern2(n);
		pattern5(n-1);
	}
	
	public static void pattern11(int n) {
//		1 
//		0 1 
//		1 0 1 
//		0 1 0 1 
//		1 0 1 0 1 
		int start=1;
		for(int i=0;i<n;i++) {
			if(i % 2 == 0) {
				start=1;
			}else {
				start=0;
			}
			for(int j=0;j<=i;j++) {
				System.out.print(start+ " ");
				start=1-start;
			}
			System.out.println();
		}
	}
	
	public static void pattern12(int n) {
//		1        1
//		12      21
//		123    321
//		1234  4321
//		1234554321
		int space=2*(n-1);
		for(int i=1;i<=n;i++) {
			//numbers
			for(int j=1;j<=i;j++){
				System.out.print(j);
			}
			//space
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			
			//numbers
			for(int j=i;j>=1;j--){
				System.out.print(j);
			}
			System.out.println();
			space=space-2;
		}
	}
	
	public static void pattern13(int n) {
//		1 
//		2 3 
//		4 5 6 
//		7 8 9 10 
//		11 12 13 14 15 
		int num=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(num + " ");
				num++;
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
		//pattern6(3);
		//pattern7(3);
		//pattern9(4);
		//pattern10(3);
		//pattern11(5);
		//pattern12(5);
		pattern13(5);

	}

}

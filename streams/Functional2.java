package streams;

import java.util.List;

public class Functional2 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);	
		
//		numbers.stream().forEach(x->System.out.print(x));
		
//		printing the even numbers
//		numbers.stream().filter(x -> x%2==0).forEach(x -> System.out.println(x));
//		numbers.stream().filter(x -> x.contains("Spring")).forEach(x -> System.out.println(x));
		
		//printing square of numbers
		//numbers.stream().map(x -> x*x).forEach(x -> System.out.print(x+ " "));
		
		//printing the cubes of odd numbers
		numbers.stream().filter(x -> x%2!=0).map(x -> x*x*x).forEach(x -> System.out.print(x+ " "));

	}

}

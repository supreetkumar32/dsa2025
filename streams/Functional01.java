package streams;

import java.util.List;

public class Functional01 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);		
		//printAllNumbersInListStructured(numbers);
		printEvenNumbersInListStructured(numbers);

	}
	
	private static void print(int number) {
		System.out.println(number);
	}
	private static void printAllNumbersInListStructured(List<Integer> numbers) {
//		for (int number : numbers) {
//			System.out.println(number);
//		}
		//method 1
		numbers.stream().forEach(x->System.out.print(x));
		
		//Method 2
		numbers.stream().forEach(Functional01::print);
	}

	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		// How to loop the numbers?
//		for (int number : numbers) {
//			if (number % 2 == 0) {
//				System.out.println(number);
//			}
//		}
		
		numbers.stream().filter(x -> x%2==0).forEach(x -> System.out.println(x));
		//numbers.stream().filter(x -> x.contains("Spring")).forEach(x -> System.out.println(x));

	}

}

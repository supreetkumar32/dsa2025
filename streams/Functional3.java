package streams;

import java.util.Comparator;
import java.util.List;

public class Functional3 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);	
		
		//adding the numbers(reduce)
		int sum=numbers.stream().reduce(0, (a,b)-> a+b);
		//System.out.print(sum);
		
		//returning the largest element in an array
		numbers.stream().reduce(Integer.MIN_VALUE,(x,y) -> x>y ? x:y);
		
		//square every number in a list and find sum of squares
		//int res=numbers.stream().map(x -> x*x).reduce(0, (a,b)-> a+b);
		int res=numbers.stream().map(x -> x*x).reduce(0, Integer::sum);
		System.out.print(res);
		
		//distinct numbers
		numbers.stream().distinct().forEach(System.out::println);
		
		//sorted
		numbers.stream().sorted().forEach(System.out::println);
		
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
		courses.stream().sorted().forEach(System.out::println);
		
		//sorted in reverse order
		courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//sorted using the length of teh string
		courses.stream().sorted(Comparator.comparing(str-> str.length())).forEach(System.out::println);
		
		

	}

}

package streams;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course1 {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course1(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public String toString() {
		return name + ":" + noOfStudents + ":" + reviewScore;
	}

}
public class prac {

	public static void main(String[] args) {
		List<Course1> courses = List.of(new Course1("Spring", "Framework", 98, 20000),
				new Course1("Spring Boot", "Framework", 95, 18000), new Course1("API", "Microservices", 97, 22000),
				new Course1("Microservices", "Microservices", 96, 25000),
				new Course1("FullStack", "FullStack", 91, 14000), new Course1("AWS", "Cloud", 92, 21000),
				new Course1("Azure", "Cloud", 99, 21000), new Course1("Docker", "Cloud", 92, 20000),
				new Course1("Kubernetes", "Cloud", 91, 20000));

//		 List<Course1> sortedCourses = courses.stream()
//		            .sorted((c1, c2) -> (c1.getNoOfStudents()- c2.getNoOfStudents()))
//		            .collect(Collectors.toList());
//		 System.out.println(sortedCourses);
//[FullStack:14000:91, Spring Boot:18000:95, Spring:20000:98, Docker:20000:92, Kubernetes:20000:91, AWS:21000:92, Azure:21000:99, API:22000:97, Microservices:25000:96]

		 
//		 List<Course1> sortedCourses = courses.stream()
//		            .sorted((c1, c2) -> (c2.getNoOfStudents()- c1.getNoOfStudents()))
//		            .collect(Collectors.toList());
//		 System.out.println(sortedCourses);
//[Microservices:25000:96, API:22000:97, AWS:21000:92, Azure:21000:99, Spring:20000:98, Docker:20000:92, Kubernetes:20000:91, Spring Boot:18000:95, FullStack:14000:91]

		 
//		 List<Course1> sortedByName = courses.stream()
//				    .sorted((c1, c2) -> c1.getName().compareTo(c2.getName()))
//				    .collect(Collectors.toList());
//		 System.out.println(sortedByName);
//[API:22000:97, AWS:21000:92, Azure:21000:99, Docker:20000:92, FullStack:14000:91, Kubernetes:20000:91, Microservices:25000:96, Spring:20000:98, Spring Boot:18000:95]

//		 List<Course1> sortedByName = courses.stream()
//				    .sorted((c1, c2) -> c2.getName().compareTo(c1.getName()))
//				    .skip(2)
//				    .limit(5)
//				    .collect(Collectors.toList());
//		 System.out.println(sortedByName);
//		 [Microservices:25000:96, Kubernetes:20000:91, FullStack:14000:91, Docker:20000:92, Azure:21000:99]
		
		System.out.println(
				courses.stream()
				.filter(course -> course.getReviewScore()>95)
				.mapToInt(course -> course.getNoOfStudents())//if we are using primitive we have to use mapToInt instead of map
				.max());//88000


	}

}

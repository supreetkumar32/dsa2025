package streams;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	public Course(String name, String category, int reviewScore, int noOfStudents) {
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
public class Functional5CustomClass {

	public static void main(String[] args) {
		List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000));

		// allMatch, noneMatch, anyMatch
		Predicate<Course> reviewScoreGreaterThan95Predicate 
			= course -> course.getReviewScore() > 95;

		Predicate<Course> reviewScoreGreaterThan90Predicate 
			= course -> course.getReviewScore() > 90;
			
		Predicate<Course> reviewScoreLessThan90Predicate 
			= course -> course.getReviewScore() < 90;

			////////type 1:
		System.out.println(courses.stream().allMatch(reviewScoreGreaterThan95Predicate));
		System.out.println(courses.stream().allMatch(course -> course.getReviewScore()>95));//return true or false
		
		System.out.println(courses.stream().noneMatch(reviewScoreLessThan90Predicate));
		
		System.out.println(courses.stream().anyMatch(reviewScoreLessThan90Predicate));
		
		System.out.println(courses.stream().anyMatch(reviewScoreGreaterThan95Predicate));
		
		//type 2: sorting
		
		 List<Course> sortedbyIncresingStudents = courses.stream()
		            .sorted((c1, c2) -> (c1.getNoOfStudents()- c2.getNoOfStudents()))
		            .collect(Collectors.toList());
		 System.out.println(sortedbyIncresingStudents);
		//[FullStack:14000:91, Spring Boot:18000:95, Spring:20000:98, Docker:20000:92, Kubernetes:20000:91, AWS:21000:92, Azure:21000:99, API:22000:97, Microservices:25000:96]

		 List<Course> sortedbyDecresingStudents = courses.stream()
		            .sorted((c1, c2) -> (c2.getNoOfStudents()- c1.getNoOfStudents()))
		            .collect(Collectors.toList());
		 System.out.println(sortedbyDecresingStudents);
		//[Microservices:25000:96, API:22000:97, AWS:21000:92, Azure:21000:99, Spring:20000:98, Docker:20000:92, Kubernetes:20000:91, Spring Boot:18000:95, FullStack:14000:91]
		
		 List<Course> sortedByName = courses.stream()
		    .sorted((c1, c2) -> c1.getName().compareTo(c2.getName()))
		    .collect(Collectors.toList());
         System.out.println(sortedByName);
       //[API:22000:97, AWS:21000:92, Azure:21000:99, Docker:20000:92, FullStack:14000:91, Kubernetes:20000:91, Microservices:25000:96, Spring:20000:98, Spring Boot:18000:95]
		
         List<Course> sortedByNameDecreasing = courses.stream()
				    .sorted((c1, c2) -> c2.getName().compareTo(c1.getName()))
				    .collect(Collectors.toList());
		 System.out.println(sortedByNameDecreasing);
      //[Spring Boot:18000:95, Spring:20000:98, Microservices:25000:96, Kubernetes:20000:91, FullStack:14000:91, Docker:20000:92, Azure:21000:99, AWS:21000:92, API:22000:97]
		 
        //type 3: skip and limit
		 List<Course> sortedByNamelimit5 = courses.stream()
				    .sorted((c1, c2) -> c2.getName().compareTo(c1.getName()))
				    .limit(5)
				    .collect(Collectors.toList());
		 System.out.println(sortedByNamelimit5);
		 //[Spring Boot:18000:95, Spring:20000:98, Microservices:25000:96, Kubernetes:20000:91, FullStack:14000:91]
		 
		 List<Course> sortedByNameSkip2 = courses.stream()
				    .sorted((c1, c2) -> c2.getName().compareTo(c1.getName()))
				    .skip(2)
				    .collect(Collectors.toList());
		 System.out.println(sortedByNameSkip2);
		 //[Microservices:25000:96, Kubernetes:20000:91, FullStack:14000:91, Docker:20000:92, Azure:21000:99, AWS:21000:92, API:22000:97]
		
		 List<Course> sortedByNameskip2Limit5 = courses.stream()
				    .sorted((c1, c2) -> c2.getName().compareTo(c1.getName()))
				    .skip(2)
				    .limit(5)
				    .collect(Collectors.toList());
		 System.out.println(sortedByNameskip2Limit5);
//		 [Microservices:25000:96, Kubernetes:20000:91, FullStack:14000:91, Docker:20000:92, Azure:21000:99]
		 
		 //type 4:
		System.out.println(
			courses.stream()
			     .takeWhile(course -> course.getReviewScore()>95)
			     .collect(Collectors.toList()));
		//[Spring:20000:98, Spring Boot:18000:95, API:22000:97, Microservices:25000:96]

		System.out.println(
				courses.stream()
				     .dropWhile(course -> course.getReviewScore()>95)
				     .collect(Collectors.toList()));
		//[FullStack:14000:91, AWS:21000:92, Azure:21000:99, Docker:20000:92, Kubernetes:20000:91]

		//findfirst
		System.out.println(
				courses.stream().
				filter(course -> course.getReviewScore()>95)
				.findFirst()
				);
		//Optional[Spring:20000:98]
		
         //findAny(): it will return any one of the many fulfilling the criteria
		System.out.println(
				courses.stream()
				.filter(course -> course.getReviewScore()>95)
				.findAny()
					);//Optional[Spring:20000:98]
         
		//sum,count,average
		System.out.println(
				courses.stream()
				.filter(course -> course.getReviewScore()>95)
				.mapToInt(course -> course.getNoOfStudents())//if we are using primitive we have to use mapToInt instead of map
				.sum());
		//88000

		System.out.println(
				courses.stream()
				.filter(course -> course.getReviewScore()>95)
				.mapToInt(course -> course.getNoOfStudents())//if we are using primitive we have to use mapToInt instead of map
				.average());
		//OptionalDouble[22000.0]

		System.out.println(
				courses.stream()
				.filter(course -> course.getReviewScore()>95)
				.mapToInt(course -> course.getNoOfStudents())//if we are using primitive we have to use mapToInt instead of map
				.count());
		//4

		System.out.println(
				courses.stream()
				.filter(course -> course.getReviewScore()>95)
				.mapToInt(course -> course.getNoOfStudents())//if we are using primitive we have to use mapToInt instead of map
				.max());;//OptionalInt[25000]
		
	}
}

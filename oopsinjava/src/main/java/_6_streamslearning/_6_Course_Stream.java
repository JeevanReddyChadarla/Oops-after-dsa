package streamslearning;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _6_Course_Stream {

	public static void main(String[] args) {
		List<Course> courses = List.of(
				new Course("Java", "Language", 98, 2000),
				new Course("Spring", "Framework", 90, 1300),
				new Course("Springboot", "Framework", 84, 890),
				new Course("MicroServices", "Architecture", 39, 300),
				new Course("Cloud", "platform", 71, 903),
				new Course("Api", "middleware", 99, 2344),
				new Course("Hybernate", "middleware", 98, 2399)
				);
		// allMatch() - checks for each course is matching the condition
		boolean flag1 = courses.stream().allMatch(c->c.getNoOfStudents()>900);
		System.out.println(flag1);
		
		// anyMatch() - check if atleast one matches the condition
		boolean flag2 = courses.stream().anyMatch(c->c.getNoOfStudents()>2000);
		System.out.println(flag2);
		
		// noneMatch() - check if none of the course match the condition
		boolean flag3 = courses.stream().noneMatch(c->c.getNoOfStudents()>90000);
		System.out.println(flag3);
		
		//////////////////////// Sorting ///////////////////////////////////////////////
		
		// sort the courses by review score
		List<Course>sortedBasedOnNumberOfStudents = courses.stream()
																.sorted(Comparator.comparing(c->c.getReviewScore()))
																.collect(Collectors.toList());
		sortedBasedOnNumberOfStudents.stream()
										.forEach(c->System.out.println(c.getName()));
		
		// sort the courses by review score in reverse order
		List<Course>sortInReverseOrder = courses.stream().sorted(Comparator.comparing(c->((Course) c).getReviewScore()).reversed()).collect(Collectors.toList());
		sortInReverseOrder.stream().forEach(c->System.out.println(c.getName()));
	
		////////////////////////If the review value of two courses is same then sort them by number of students ////////////////////
		
		// we have same review score of 98 for java and hibernate course, then sort them by using number of students
		List<Course>compareReviewScoreAndThenNoOfStudents = courses.stream()
				.sorted(Comparator.comparing(Course::getReviewScore) // compares the review score, if two courses have same review scores 
				.thenComparing(Course::getNoOfStudents))    // then compares the number of students
				.collect(Collectors.toList());
		System.out.println(compareReviewScoreAndThenNoOfStudents);
		
		// sort and limtit to top 3
		List<Course>sortedAndLimit = courses.stream()
				.sorted(Comparator.comparing(c->c.getReviewScore()))
				.limit(3)
				.collect(Collectors.toList());
		System.out.println(sortedAndLimit);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// itergate and print the courses until you find the first occurrance of the course reviewscore is less than 92
		// once you found the course whose score is less than 92 break 
		//[[ Java : Language : 2300 : 98], [ Spring : Framework : 1233 : 94], [ Spring boot : Framework : 790 : 99], [ Microservices : technology : 50 : 42], [ Api : interface : 199 : 99], [ Hybernate : middleware : 230 : 30]]
		List<Course>courseInOrderWhoseScoreIsLessThan92 = courses.stream()
																	.takeWhile(c -> c.getReviewScore()>=92)
																	.collect(Collectors.toList());
		System.out.println(courseInOrderWhoseScoreIsLessThan92);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// itergate and print the courses after you find the course reviewscore is less than 92
		// once you found the course whose score is less than 92 start from there to end 
		//[[ Java : Language : 2300 : 98], [ Spring : Framework : 1233 : 94], [ Spring boot : Framework : 790 : 99], [ Microservices : technology : 50 : 42], [ Api : interface : 199 : 99], [ Hybernate : middleware : 230 : 30]]
		List<Course>courseAfterWhoseScoreIsLessThan92 = courses.stream()
																.dropWhile(c->c.getReviewScore()>=92)
																.collect(Collectors.toList());
		System.out.println(courseAfterWhoseScoreIsLessThan92);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// iterate and print the courses by grouping them by category
		// {Language=[[ Java : Language : 2300 : 98]], technology=[[ Microservices : technology : 50 : 42]], Framework=[[ Spring : Framework : 1233 : 94], [ Spring boot : Framework : 790 : 99]], middleware=[[ Api : middleware : 199 : 99], [ Hybernate : middleware : 230 : 30]]}
		
		Map<String, List<Course>>courseGrouping = courses.stream()
															.collect(Collectors.groupingBy(c->c.getCourseType()));
		System.out.println(courseGrouping);
		
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		// itergate and print the courses by grouping them by category and number of types
		//{Language=1, technology=1, Framework=2, middleware=2}
		Map<String, Long> collectGroupingAndNumber = courses.stream()
																.collect(Collectors.groupingBy(c->c.getCourseType(),Collectors.counting()));
		System.out.println(collectGroupingAndNumber);


	}
}

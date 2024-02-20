package streamslearning;

import java.util.Arrays;
import java.util.List;

class Userr{
	String name;
	int age=23;
	Userr(String name){
		this.name = name;
	}
}

public class Stream_3_MapToInt {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jeevan", "Reddy", "Chadarla");
		int sum=0;
		// Sum up the age of all the user obj
		
		// normal approach
		for(int i=0;i<names.size();i++) {
			User u = new User(names.get(i));
			sum += u.age;
		}
		System.out.println(sum);
		
		// streams approach
		int streamSum = names.stream()
							 .map(n -> new User(n))
							 .mapToInt(n -> n.age)
							 .sum();
		System.out.println("Stream sum = "+streamSum);

	}

}

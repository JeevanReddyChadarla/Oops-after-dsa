package streamslearning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class User{
	String name;
	int age=25;
	public User(String name){
		this.name=name;
	}
}

public class Stream_2_MapExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jeevan", "Reddy", "Chadarla");
		
		// Create an obj for each user in the list
		
			//normal approach
		for(int i=0;i<names.size();i++) {
			User u = new User(names.get(i));
			System.out.println(u.name +" age "+u.age);
		}
		
			//Streams approach
		names.stream()
			.map(n -> new User(n))
			.forEach( n -> System.out.println(n.name+" age "+ n.age));
		
		// except for user "reddy" create and store user obj to all the other names
		List<User>filteredmappedList = 
			names.stream()
			.filter(n -> !n.equals("Reddy"))
			.map(n -> new User(n))
			.collect(Collectors.toList());
		
		// collect will collect and will store the values
		
		filteredmappedList.stream()
						  .forEach(n -> System.out.println(n.name));
	}
}

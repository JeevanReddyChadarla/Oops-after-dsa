package streamslearning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Usseer{
	String name;
	int age=25;
	List<Integer> phNo;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Usseer(String name, List<Integer>phNo){
		this.name=name;
		this.phNo=phNo;
	}

	public List<Integer> getPhNo() {
		return phNo;
	}

	public void setPhNo(List<Integer> phNo) {
		this.phNo = phNo;
	}
	
}

class UsersInDataBase{
	public static List<Usseer> getAll(){
		return Stream.of(
				new Usseer("jeevan", Arrays.asList(2333,91835,70133,472,8358)),
				new Usseer("Chadarla", Arrays.asList(122,8595,372))
			).collect(Collectors.toList());
	}
}

public class Stream_4_FlatMap {
	public static void main(String[] args) {
		
		List<Usseer> user = UsersInDataBase.getAll();
		
		// map
		List<String>names = user.stream()
							.map(n -> n.getName())
							.collect(Collectors.toList());
		System.out.println(names);
		
		// flatmap for nested data - phone numbers
		List<Integer> phones = user.stream()
								.flatMap(n -> n.getPhNo().stream())
								.collect(Collectors.toList());
		System.out.println(phones);
		

	}

}

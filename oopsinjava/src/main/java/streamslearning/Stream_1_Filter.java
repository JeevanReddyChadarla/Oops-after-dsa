package streamslearning;

import java.util.Arrays;
import java.util.List;

public class Stream_1_Filter {

	public static void main(String[] args) {
		List<String>list = Arrays.asList("Jeevan","Reddy","Chadarla");
		
		// print the list except "Reddy"
		
		
			// normal 
		for(int i=0;i<list.size();i++) {
			if(list.get(i)!="Reddy") {
				System.out.println(list.get(i));
			}
		}
		
			// using streams
		list.stream()
			.filter(n -> !n.equals("Reddy"))
			.forEach(n -> System.out.println(n));
	}

}

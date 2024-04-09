package streamslearning;

import java.util.List;

// inside if loop, the data that we need to change is kept inside map
public class _3_Stream_Map {

	public static void main(String[] args) {
		List<Integer>list = List.of(3,4,5,6,3,2,4,6,8);
		list.stream().filter(n->n%2==0).map(n->n*n).forEach(System.out::println);
	}

}

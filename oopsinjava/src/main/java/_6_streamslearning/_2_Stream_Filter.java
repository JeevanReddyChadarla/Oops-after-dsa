package streamslearning;

import java.util.List;

// The if (condition statement) is kept in filter
public class _2_Stream_Filter {

	public static void main(String[] args) {
		List<Integer>list = List.of(2,4,8,5,4,3,3,5,7,1,4,9,4,9);
		list.stream().filter(n->n%2==0).forEach(System.out::println);
	}

}

package streamslearning;

import java.util.List;

//forEach - prints the each element in the list

public class _1_Stream_ForEach {
	public static void main(String[] args) {
		List<Integer>list = List.of(3,9,9,8,3,2,1,5,6,8,5,3,6,9);
		list.stream().forEach(System.out::println);
	}
}

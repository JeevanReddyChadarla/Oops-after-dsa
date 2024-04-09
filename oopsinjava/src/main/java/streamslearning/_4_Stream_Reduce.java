package streamslearning;

import java.util.List;

// reduce has three parameters - reduce(initalValue, (accumulator,nextvalue) -> logic stores in accumulator)
// accumulator = accumlator+nextValue - stores back to accumulator
public class _4_Stream_Reduce {

	public static void main(String[] args) {
		// print maximum value in a list
		List<Integer>list = List.of(3,2,8,2,3,9,4,3,9,3,3,2,44,8);
		int maxi = list.stream().reduce(Integer.MIN_VALUE, (x,y)-> Math.max(x,y));
//		internally it works as -
//		x = Integer.MIN_VALUE;
//		x = Math.max(x, y);
		System.out.println(maxi);
		
		
	}

}

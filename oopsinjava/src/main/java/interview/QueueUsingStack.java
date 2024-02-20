package interview;

import java.util.Stack;

public class QueueUsingStack {
	
	public static int queuepop(Stack<Integer>stack) {
		Stack<Integer>stack2 = new Stack<Integer>();
		int x=Integer.MAX_VALUE;
		if(queueEmpty(stack)==-1) {
			queueEmpty(stack);
		}else {
		while(!stack.isEmpty()) {
			x = stack.peek();
			stack2.push(x);
			stack.pop();
		}
		stack2.pop();
		while(!stack2.isEmpty()) {
			stack.push(stack2.pop());
			
		}
		}
		if(x==Integer.MAX_VALUE) {
			System.out.println("Stack is empty can't pop");
		}
		return x;
	}
	
	public static int queueEmpty(Stack<Integer>stack) {
		if(stack.isEmpty()) {
			return -1;
		}
		return 1;
	}
	

	public static void main(String[] args) {
		Stack<Integer>stack = new Stack<>();
		Stack<Integer>stack1 = new Stack<>();
		Stack<Integer>stack2 = new Stack<>();

		stack.push(10);
		stack.push(2);
		stack.push(13);
		stack.push(40);
		
		System.out.println(queuepop(stack));
		System.out.println(queuepop(stack));
		System.out.println(queuepop(stack));
		System.out.println(queuepop(stack));
		System.out.println(queuepop(stack));
		
		System.out.println(queueEmpty(stack));
		
	}

}

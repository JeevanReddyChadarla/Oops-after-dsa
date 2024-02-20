package interview;

import java.util.Stack;

public class three {
	
	public static boolean isValid(String s) {
        Stack<Character>stack=new Stack<>();
        int start=0, end=s.length()-1;
        while(start<=end) {
        	if(s.charAt(start)=='(') {
        		stack.push(')');
        	}else if(s.charAt(start)=='{') {
        		stack.push('}');
        	}else if(s.charAt(start)=='[') {
        		stack.push(']');
        	}
        	else {
        		if(stack.isEmpty()&& start!=end ) {
        			return false;
        		}
        		else if(stack.pop()!=s.charAt(start)) {
        			return false;
        		}
        	}
        	start++;
        }
        return stack.isEmpty();
    }

	public static void main(String[] args) {
		String s="()}{";
		System.out.println(isValid(s));
	}

}

package collection;

import java.util.Stack;

public class Stackk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>val = new Stack<>();
		
		val.push(91);
		val.push(92);
		val.push(93);
		val.push(94);
		System.out.println(val);
		
		
		//val.pop(); // Remove top value 
		System.out.println(val.peek()); // Show the top value
		
	}

}

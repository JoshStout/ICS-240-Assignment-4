
public class ComponentStackDriver {

	public static void main(String[] args) {
		
		System.out.println("Creating objects of the Component class");
		Component c1 = new Component("resistor", 1);
		Component c2 = new Component("capacitor", 2);
		Component c3 = new Component("inductor", 3);
		Component c4 = new Component("resistor", 4);
		Component c5 = new Component("capacitor", 5);
		Component c6 = new Component("inductor", 6);
		Component c7 = new Component("resistor", 7);
		Component c8 = new Component("capacitor", 8);
		Component c9 = new Component("inductor", 9);
		
		
		//testing all ComponentLinkedStack methods
		System.out.println("Creating stack s of Component objects");
		ComponentLinkedStack s = new ComponentLinkedStack();
		s.push(c1);
		s.push(c2);
		s.push(c3);
		s.push(c4);
		s.push(c5);
		s.push(c6);
		s.push(c7);
		s.push(c8);
		s.push(c9);
		
		System.out.println("s.toString():");
		System.out.print(s.toString());
		
		System.out.print("s.size(): ");
		System.out.println(s.size());
		System.out.println();
		
		System.out.println("popping each item off stack");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		
		System.out.print("s.size(): ");
		System.out.println(s.size());
		
		System.out.println("s.isEmpty(): " + s.isEmpty());
		System.out.println();
		
		System.out.println("Adding Component objects back onto the stack");
		s.push(c1);
		s.push(c2);
		s.push(c3);
		s.push(c4);
		s.push(c5);
		s.push(c6);
		s.push(c7);
		
		System.out.println("s.toString():");
		System.out.print(s.toString());
		
		System.out.print("s.size(): ");
		System.out.println(s.size());
		
		System.out.println("s.isEmpty(): " + s.isEmpty());
		System.out.println();
		
		System.out.println("s.peek(): " + s.peek());
		System.out.println("Show there is no change to the stack from using the peek method");
		
		System.out.println("s.toString():");
		System.out.print(s.toString());
		
		System.out.print("s.size(): ");
		System.out.println(s.size());
		System.out.println();
		
		
		//testing all ComponentStackDriver static methods
		System.out.println("Creating new stack stk of Component objects");
		ComponentLinkedStack stk = new ComponentLinkedStack();
		Component c11 = new Component("resistor", 1);
		Component c12 = new Component("capacitor", 2);
		Component c13 = new Component("inductor", 3);
		Component c14 = new Component("resistor", 4);
		stk.push(c11);
		stk.push(c12);
		stk.push(c13);
		stk.push(c14);
		System.out.println("stk.toString():");
		System.out.print(stk.toString());
		System.out.println();
		
		System.out.println("testing 4 elements in the stack");
		System.out.println("stackToInt(stk):");
		System.out.println(ComponentStackDriver.stackToInt(stk));
		System.out.println();
		
		System.out.println("testing empty stack");
		System.out.println("stk.toString():");
		System.out.print(stk.toString());
		System.out.println("stackToInt():");
		System.out.println(ComponentStackDriver.stackToInt(stk));
		System.out.println();
		
		System.out.println("testing 1 element stack");
		stk.push(c14);
		System.out.println("stk.toString():");
		System.out.print(stk.toString());
		System.out.println("stackToInt():");
		System.out.println(ComponentStackDriver.stackToInt(stk));
		System.out.println();
		
		System.out.println("testing 1 element with integer attribut 0");
		Component c15 = new Component("resistor", 0);
		stk.push(c11);
		stk.push(c12);
		stk.push(c15);
		stk.push(c13);
		System.out.println("stk.toString():");
		System.out.print(stk.toString());
		System.out.println("stackToInt():");
		System.out.println(ComponentStackDriver.stackToInt(stk));
		System.out.println();
		
		System.out.println("testing popSome method with stack of 3 and count = 3");
		stk.push(c11);
		stk.push(c5);
		stk.push(c13);
		System.out.println("stk.toString():");
		System.out.print(stk.toString());
		System.out.println("popSome(stk, 3):");
		System.out.println(ComponentStackDriver.popSome(stk,3));
		System.out.println();
		
		System.out.println("testing popSome method with stack of 4 and count = 3");
		stk.push(c1);
		stk.push(c2);
		stk.push(c3);
		stk.push(c4);
		System.out.println("stk.toString():");
		System.out.print(stk.toString());
		System.out.println("popSome(stk, 3):");
		System.out.println(ComponentStackDriver.popSome(stk,3));
		System.out.println();
		
		System.out.println("testing popSome method with stack of 2 and count = 3");
		stk.pop();
		System.out.println("stk.size()" + stk.size());
		stk.push(c1);
		stk.push(c2);
		System.out.println("stk.toString():");
		System.out.print(stk.toString());
		System.out.println("popSome(stk, 3):");
		System.out.println(ComponentStackDriver.popSome(stk,3));
		System.out.println();
		
		System.out.println("testing popSome method with stack of 0 and count = 3");
		stk.pop();
		stk.pop();
		System.out.println("stk.size()" + stk.size());
		System.out.println("stk.toString():");
		System.out.print(stk.toString());
		System.out.println("popSome(stk, 3):");
		System.out.println(ComponentStackDriver.popSome(stk,3));
		System.out.println();
		
		System.out.println("testing popSome method with stack of several Components and count = 0");
		stk.push(c1);
		stk.push(c2);
		stk.push(c3);
		stk.push(c4);
		stk.push(c5);
		System.out.println("stk.size()" + stk.size());
		System.out.println("stk.toString():");
		System.out.print(stk.toString());
		System.out.println("popSome(stk, 0):");
		System.out.println(ComponentStackDriver.popSome(stk,0));
		System.out.println();
		
		System.out.println("testing popSome method with stack of several Components and count is negative");
		stk.push(c1);
		stk.push(c2);
		stk.push(c3);
		stk.push(c4);
		stk.push(c5);
		System.out.println("stk.size()" + stk.size());
		System.out.println("stk.toString():");
		System.out.print(stk.toString());
		System.out.println("popSome(stk, -2):");
		System.out.println(ComponentStackDriver.popSome(stk, -2));
		System.out.println();
		
		System.out.println("testing extractFromStack method"); 
		System.out.println("stk.size()" + stk.size());
		System.out.println("stk.toString():");
		System.out.print(stk.toString());
		System.out.println("target: " + c1);
		extractFromStack(stk, c1);
		System.out.println("extractFromStack(stk, c1);"); 
		System.out.println("stk.size()" + stk.size());
		System.out.println("stk.toString():");
		System.out.print(stk.toString());
		System.out.println();
		
		System.out.println("testing equalStacks method"); 
		System.out.println("stack 1:"); 
		System.out.print(stk.toString());
		ComponentLinkedStack stk2 = new ComponentLinkedStack();
		stk2.push(c2);
		stk2.push(c3);
		stk2.push(c4);
		stk2.push(c5);
		stk2.push(c2);
		stk2.push(c3);
		stk2.push(c4);
		stk2.push(c5);
		System.out.println("stack 2:"); 
		System.out.print(stk2.toString());
		System.out.println("equalStacks(stack1, stack2): " + equalStacks(stk, stk2));
		System.out.println("check stacks remain unchanged");
		System.out.println("stack 1:"); 
		System.out.print(stk.toString());
		System.out.println("stack 2:"); 
		System.out.print(stk2.toString());
		
		System.out.println("change stack 2:");
		stk2.pop();
		stk2.push(c1);
		System.out.println("stack 2:"); 
		System.out.print(stk2.toString());
		System.out.println("equalStacks(stack1, stack2): " + equalStacks(stk, stk2));
		
	}
	
	/**
	 * A method that takes a linked list of Components and returns as output
	 * the integer attribute of each object as a number representation of values
	 * where the most significant digit is at the top of the stack.
	 * @param stk - a linked list of Component objects
	 * @return - a number representation of Component size values
	 * where the most significant digit is at the top of the stack.
	 */
	public static int stackToInt(ComponentStackInterface stk) {
		int size = stk.size();
		if(size == 0) {
			return -1;
		}
		
		double output = 0;
		
		double pos = size-1;
		for(int i = 0; i < size; i++) {
			Component c = stk.pop();
			int num = c.getSize();
			output = output + num * Math.pow(10,  pos);
			pos--;
		}
		return (int)output;
	}
	
	
	/**
	 * takes two input parameters, a stack and a integer,
	 * and pops of the stack the amount equal to the integer.
	 * @param stk - the input stack.
	 * @param count - the amount of elements to be removed from the stack.
	 * @return
	 */
	public static int popSome(ComponentStackInterface stk, int count) {
		int size = stk.size();
		if(size < count) {
			return -1;
		}
		int sum = 0;
		for(int i = 0; i < count; i++) {
			Component c = stk.pop();
			sum += c.getSize();
		}
		return sum;
	}
	
	
	/**
	 * method removes all occurrences of the input target parameter but the 
	 * rest of the stack remains unchanged and in the same order.
	 * @param stk - the input stack.
	 * @param target - the element to be removed from the stack.
	 */
	public static void extractFromStack(ComponentLinkedStack stk, Component target) {
		ComponentLinkedStack tempStk = new ComponentLinkedStack();
		int size = stk.size();
		if(size == 0) {
			return;
		}
		for(int i = 0; i < size; i++) {
			Component c = stk.pop();
			if(!c.equals(target)) {
				tempStk.push(c);
			}
		}
		int tempSize = tempStk.size();
		for(int i = 0; i < tempSize; i++) {
			stk.push(tempStk.pop());
		}
	}
	
	/**
	 * determines if two stacks are equal. 
	 * @param stk1 - the first input stack to compare 
	 * @param stk2 - the second input stack to compare
	 * @return - true or false whether the two input stacks are equal or not.
	 */
	public static boolean equalStacks(ComponentLinkedStack stk1, ComponentLinkedStack stk2) {
		boolean output = true;
		int size1 = stk1.size();
		ComponentLinkedStack tempStk1 = new ComponentLinkedStack();
		ComponentLinkedStack tempStk2 = new ComponentLinkedStack();
		if(stk1.size() != stk2.size()) {
			return false;
		}
		for(int i = 0; i < size1; i++) {
			Component c1 = stk1.pop();
			Component c2 = stk2.pop();
			if(!c1.equals(c2)) {
				output = false;
			}
			tempStk1.push(c1);
			tempStk2.push(c2);
		}
		for(int i = 0; i < size1; i++) {
			stk1.push(tempStk1.pop());
			stk2.push(tempStk2.pop());
		}
		return output;
	}

}

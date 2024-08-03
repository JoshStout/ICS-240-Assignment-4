import java.util.EmptyStackException;
/**
 * Invariant of the ComponentLinkedStack class:
 * 1. The Components in the stack are stored in a linked list, with the top of
 * the stack stored at the head node, down to the bottom of the stack
 * at the final node.
 * 2. The instance variable top is the head reference of the linked list of Components.
 * 
 */

public class ComponentLinkedStack implements ComponentStackInterface {
	
	private ComponentNode top;
	private int manyItems;
	
	/**
	 * Initialize and empty stack.
	 */
	public ComponentLinkedStack() {
		top = null;
		manyItems = 0;
	}
	
	
	/**
	 * Determine whether this stack is empty.
	 * @return true if this stack si empty and false otherwise.
	 */
	@Override
	public boolean isEmpty() {
		return (top == null);
	}
	
	
	/**
	 * @return the top Component of the stack without removing it.
	 * @exception EmptyStackException indicates that this stack is empty.
	 */
	@Override
	public Component peek() {
		if(top == null) {
			//EmptyStackExcption is from java.util and its constructor has no arguments.
			throw new EmptyStackException();
		}
		return top.getData();
	}
	
	
	/**
	 * Get the top Component, removing it from this stack.
	 * @return The return value is the top Component of this stack, and the item is removed.
	 * @exception EmptyStackException indicates taht this stack is empty.
	 */
	@Override
	public Component pop() {
		Component answer;
		
		if(this.top == null) {
			//EmptyStackException is form java.util and its constructor has no argument.
			throw new EmptyStackException();
		}
		answer = this.top.getData();
		this.top = this.top.getLink();
		manyItems--;
		return answer;
	}
	
	
	/**
	 * Push a new item onto this stack.
	 * @param item - the item to be pushed onto this stack.
	 */
	@Override
	public void push(Component item) {
		this.top = new ComponentNode(item, this.top);
		manyItems++;
	}
	
	
	/**
	 * Accessor method to determine the number of items in this stack.
	 * @return the number of items in this stack.
	 */
	@Override
	public int size() {
		return manyItems;
	}
	
	
	/**
	 * convert the stack to a printable string.
	 * @return a string representing the stack.
	 */
	public String toString() {
		String output = "[";
		ComponentNode cursor = top;
		
		while(cursor != null) {
			output += cursor.getData() + "\t";
			cursor = cursor.getLink();
		}
		output += " ] \n";
		return output;
	}
	
}

package stackityStack;

import java.util.Arrays;

public class Stack {
	
	private int lastItem = 0;
	private int[] items = new int[0];
	
	// add items to the stack
	public void push(int newItem) {
		int index = items.length; //get current length to store as index
		System.out.println("The length is " + index);
		
		
		items = new int[items.length + 1]; //increase array length by 1 to store new item
		System.out.println("Items after extengind the length by 1: " + Arrays.toString(items));
		
		
		items[index] = newItem;
		System.out.println("items after storing the new value: " + Arrays.toString(items));
		
		lastItem = newItem;
		System.out.println("The last item: " + lastItem);
		
	}
	
	// pop items off the stack
	public int pop() {
		
		int tempItem = lastItem;
		
		// copy a new array, but remove the last item
		int[] newArray = new int[items.length-1]; 
		
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = items[i];
		}
		
		items = newArray; // update the items array
		lastItem = items[items.length-1]; //update last item
		
		//return our popped item
		return tempItem;
	}
	
	// view last item
	public int peek() {
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

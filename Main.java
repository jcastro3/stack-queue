package stack1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a Stack class and Queue Class containing the following methods:
		 * 
		 * Stack:
		 * 
		 * push(int value) should insert an element in the top of stack and returns the new length 
		 * push(int[] values) should insert array's elements into the stack and returns the new length	
		 * pop() should remove the top element and return it
		 * pop(int elements) should remove number of elements given
		 * 
		 * Queue:
		 * 
		 * enqueue(int value) should insert an element in the top of stack and returns the new length
		 * enqueue(int[] values) should insert array's elements into the stack and returns the new length
		 * dequeue() should remove the top element and return it
		 * dequeue(int elements) should remove number of elements given
		 * 
		 * common methods:
		 * 
		 * dump(string separator) should print on console an string with all values separated by the provided separator, if not separator is defined then it should return separated by commas
		 * toArray() should return an array with all elements
		 * join(string separator) should return a string with all values separated by the provided separator, if not separator is defined then it should return separated by commas
		 * unique() returns all unique values, this means, the values which are not duplicated
		 * 
		 * Unit tests of each method plz!@
		 * 
		 * */
		Stack mystack = new Stack(); 
		Stack mystackA = new Stack(); //array
		Queue myqueue = new Queue();
		Queue myqueueA = new Queue();//array
	
		
		mystack.push(1);
		mystack.push(5);
		mystack.push(6);
		mystack.push(5);
		mystack.push(6);
		mystack.push(5);
		mystack.push(6);
		mystack.push(5);
		mystack.push(2);
		mystack.push(4);
		mystack.push(6);
		mystack.push(7);

		mystack.unique();
	
		
	}

}

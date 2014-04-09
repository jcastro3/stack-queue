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

		   //push(int value) should insert an element in the top of stack and returns the new length
			mystack.push(4);
			mystack.push(5);
			mystack.push(9);
			mystack.push(7);
			mystack.push(9);
			mystack.push(6);
			mystack.push(1);
			
			
			System.out.println("STACK");
			while (!mystack.isEmpty()) {
				System.out.println(mystack.pop());
			} 	System.out.println("Size of Stack is: " + mystack.getSize());
			
			
			


			//stack push and pop with array
			int s_data[] = {552,515,5156,997,21};
			for (int i = 0; i < s_data.length; i++)
			{
				mystackA.push(s_data[i]);	
			}
			
			mystackA.removeItem(515); //remove methods

			System.out.println("STACK");
			while (!mystackA.isEmpty()) {
				System.out.println(mystackA.pop());
			} System.out.println("Size of Stack is: " + mystackA.getSize());
			
			
			
			//enqueue & dequeue//
		  	
			myqueue.enQueue(5);
			myqueue.enQueue(6);
			myqueue.enQueue(9);
			myqueue.removeItem(9);// will remove item number 9 
			System.out.println("QUEUE");
			while (!myqueue.isEmpty())
			{  System.out.println(myqueue.deQue());}
				 


	         //enqueue & dequeue w/ arrays
				   
		    int q_data[] = {2, 4, 6, 7, 45, 64};
			for (int i = 0; i < q_data.length; i++)
			{
				myqueueA.enQueue(q_data[i]);
			}
			
			myqueueA.removeItem(7); //remove methods

			System.out.println("QUEUE");
			while (!myqueueA.isEmpty()) {
				System.out.println(myqueueA.deQue());
			}
			
			 
			
			//dump(string separator) should print on console an string with all values separated by
			//the provided separator, if not separator is defined then it should return separated by commas
			mystack.push(4);
			mystack.push(5);
			mystack.push(9);
			mystack.push(7);
			mystack.push(9);
			mystack.push(6);
			mystack.push(1);
			
			myqueue.enQueue(5);
			myqueue.enQueue(6);
			myqueue.enQueue(9);
			
			String sptor1 = "";
			String sptor2 = "&";
			mystack.dump(sptor1);
			myqueue.dump(sptor2);
			
			//toArray() should return an array with all elements
			myqueue.enQueue(5);
			myqueue.enQueue(6);
			myqueue.enQueue(9);
			
			 int array[] = myqueue.toArray();
			 System.out.print("Array: ");
			for (int x : array) {
				
				System.out.print( x + " ");
			}
			   System.out.println();
			 // unique() returns all unique values, this means, the values which are not duplicated
			mystack.push(1);
			mystack.push(2);
			mystack.push(2);
			mystack.push(1);
			mystack.push(4);
			mystack.push(5);
			mystack.push(4);
			
			mystack.unique();
			
	}

}

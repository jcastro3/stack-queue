package stack1;

import java.lang.reflect.Array;

public class Queue {
	
	Nodes head;
	Nodes last;
	Nodes before;
	int size;
	Queue() 
	{	
		head = null;
		size = 0;
	}
	public int getSize(){
		return size;
	}
	
	public void enQueue(int d) 
	{
		Nodes tmp = last; 
		last = new Nodes(d, null); 
		if (isEmpty()) head = last; 
			else tmp.setNext(last);
		size++;
	}
	
	public void enQueue(Array d) // This is wrong
	{
		Nodes tmp = last; 
		last = new Nodes(d, null); 
		if (isEmpty()) head = last; 
			else tmp.setNext(last);
		size++;
	}
	
	public int deQue()//takes out first item in the queue
	{
		if(isEmpty())throw new RuntimeException("No items currently in Queue");		
		else
		{
			int tmp = head.getData();
			head = head.next;
			size--;
		    return tmp; 
		}		
	}
	
	public void removeItem(int d)
	{ 
		if (head.getData() == d) //if its the head item in the queue
		{	
		 head = head.next;	
		 return;
		}
		
		Nodes current = head;
		Nodes prev = null; 
		
		while(current != null && current.getData() != d)
		{
			prev = current;
		    current = current.next; 
		}
		
		prev.next = current.next;
		size--;
	}
	
	public int[] toArray() //THIS ONLY RETURNS THE LAST DIGIT IN THE ARRAY :c
	{
		if(isEmpty())throw new RuntimeException("No items currently in Queue");		
		Nodes temp = head;
		int i=0;
		int [] array = new int[size];
		while(temp != null)
		{  
			array[i] = temp.getData(); 
			temp = temp.next;
			i++;
		}
		return array;
	
	}
	
	public boolean isEmpty()
	{
		return (head == null);
	}
	

	
	public String dump(String sptor){
		String dump = "";
		if(sptor == ""){
			sptor = ",";
		}
	
		while(!isEmpty()){
			if(head.next == null) sptor = "";
			dump = (dump + head.getData() + sptor);
			head = head.next;
			size--;
		}
		System.out.println(); // ??
		return dump;
	}
}
 

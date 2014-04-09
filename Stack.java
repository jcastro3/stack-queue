package stack1;
import java.lang.reflect.Array;
import java.util.*;
public class Stack {
	 Nodes head;
	 int size;
	Stack(){
		head = null;
		size = 0;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public void push(int d)
	{
		Nodes t = new Nodes(d, null);
		if (isEmpty()) head = t;
		else{
			
			t.setNext(head);
			head = t;			
		}
		size++;
	}
	
	public void push(Array d)
	{
		Nodes t = new Nodes(d, null);
		if (isEmpty())head = t;
		else
		{
			t.setNext(head);
			head = t;	
		}
		size++;
	}
	
	public int[] toArray() 
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
	
	public void removeItem(int d)
	{ 
		if (head.getData() == d)
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
	

	public int  pop()
	{
		if (isEmpty()) {
            throw new NoSuchElementException("The stack is currently empty") ;

		}else{
			
			Nodes crt_top = head; //create a temp reference that points to head
			head = crt_top.getNext();//then point it to the next item on the list
			return crt_top.getData();
		}
		
	}
	
	public void unique()
	{
		 while(!isEmpty()){
			Nodes current = head.next;
			while(current != null && current.getData() == head.getData())
			{
				current = current.next;
				System.out.print(current.getData());
			}
			head.next = current;
			head = current;
			System.out.print(head.getData());

		 }
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
			
			dump = (dump + head.getData() + sptor);
			head = head.next;
			size--;
		}
		System.out.println();
		return dump;
	}
}


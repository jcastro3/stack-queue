package stack1;



public class Queue extends Sec_Access {

	
	public  int passArray(char[] array)
	{
		for (char c : array) {
			enQueue(c);
		}
		return this.size;
	}
	
	public int enQueue(int d) 
	{
		
		Nodes tmp = last; 
		last = new Nodes(d, null); 
		if (isEmpty()) head = last; 
			else tmp.setNext(last);
		size++;
		return this.size;
	}
	
	

	
}
 
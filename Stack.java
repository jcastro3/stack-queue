package stack1;
public class Stack extends Sec_Access {
	
	public int push(int d)
	{
		Nodes t = new Nodes(d, null);
		if (isEmpty()) head = t;
		else{
			
			t.setNext(head);
			head = t;			
		}
		size++;
		return this.size;
	}
	
	public  int passArray(char[] array)
	{
		for (char c : array) {
			push(c);
		}
		return this.size;
	}


}


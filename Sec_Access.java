package stack1;



public class Sec_Access {
	
	Nodes head;
	int size;
	Nodes last;
	Nodes before;
	
	Sec_Access(){
		head = null;
		size = 0;
	}
	public boolean isEmpty()
	{return head == null;}
	
	
	public int getSize()
	{return size;}
	
	
	 //*******************************************//
	//Takes out first item in the Queue or Stack*//
   //*******************************************//
	public int kick()
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
	
	//**************************************************//
   //toArray() should return an array with all elements//
  //**************************************************//
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
	 
	/*dump(string separator) should print on console an string with all
	*values separated by the provided separator, if not separator is
	*defined then it should return separated by commas
	**/
	public void dump(String sptor)
	{
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
		System.out.print(dump);
	}
	
	
	
	 /*join(string separator) should return a string with 
	*all values separated by the provided separator, if not 
	*separator is defined then it should return separated by commas
	***/
	public String join(String sptor)
	{
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
		return dump;
	}
	
	
	 //unique() returns all unique values, this means, the values which are not duplicated
	public String unique() 
	{
				
				if(isEmpty())throw new RuntimeException("No items in the list");	
				Nodes current = head;
				String print ="";
				while(current != null)
				{  
					Nodes runner = current;
					while(runner.next != null)
					{
						if(runner.next.getData() == current.getData())
							runner.next = runner.next.next;	
						else 
							runner = runner.next;
					}
					current = current.next;
				}
				//print out values
				while(!isEmpty()){
					print = (print + head.getData()+ " ");
					head = head.next;
				}
				return print;
		      }
	
	 //stack & queue (int elements) should remove number of elements given
	
	public void removeItem(int d)
	
	{       
		Nodes current = head;
			Nodes prev = null; 
			
			if (head.getData() == d)
			{	
			 head = head.next;	
			 return;
			}
			
			while(current != null && current.getData() != d)
			{
				prev = current;
				current = current.next;
			}
	
			prev.next = current.next;	
			size--;
	}
	
	

}

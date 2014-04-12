package stack1;

import java.lang.reflect.Array;

public class Nodes {
	
	int data;
	Nodes next;
	
	
	Nodes(){
	 data = 0;
	 next = null;		
	}

	Nodes(int d, Nodes n){
		data = d;
		next = n;
	}
	Nodes(Array d, Nodes n)
	{
		
	}
	//sets the link to the next node
	public void setNext(Nodes link){next = link;}
	//sets data to the current node
	public void setData(int d){data = d;}
	public Nodes getNext(){return next;}
	public int getData(){ return data;}
	
	}

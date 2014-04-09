package stack1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class stackTest {
	Stack s;
	@Before 
	public void initialize() {
	     s = new Stack();
	}
	

	@Test
	public void testGetSize() {
		s.push(-2);
		s.push(5);
		assertEquals(2, s.getSize());
	}
	@Test
	public void testToArray() {
		s.push(888);
		s.push(101);
		s.push(111);
		int expected[] = {111,101,888};
		assertArrayEquals(expected, s.toArray());
		
	}


	@Test
	public void testPushInt() {
		
		s.push(5);
		s.push(-23);	
		assertEquals(-23, s.head.getData());
		assertEquals(5, s.head.next.getData());
		
		
	}
	
	@Test
	public void testPop() {
		
		s.push(3);
		s.push(5015);
		s.push(654555);
		assertEquals(654555, s.pop());
		assertEquals(5015, s.pop());
		assertEquals(3, s.pop());
		
	}

	@Test
	public void testPushArray() {
		
		int s_data[] = {997,21};
		
			s.push(s_data[0]);
		    s.push(s_data[1]);
		
		assertEquals(21, s.head.getData());
		assertEquals(997, s.head.next.getData());
		
		
	}

	@Test
	public void testRemoveItem() {
		s.push(81);
		s.push(71);
		s.push(51);
		s.removeItem(71);
		s.removeItem(51);
		assertEquals(81, s.head.getData());
		
		s.push(100);
		s.removeItem(81);
		assertEquals(100, s.head.getData());
	}

	

	@Test
	public void testIsEmpty() {
		
		assertTrue(s.isEmpty());
		s.push(3);
		assertFalse( s.isEmpty());
	}

	@Test
	public void testDump() {
		Stack s = new Stack();
		s.push(1);
		s.push(0);
		String sptor = "%";
		
		String dump = s.dump(sptor);
		assertEquals("0%1%", dump);
		

		
	}
	
	@Test
	public void testUnique()
	{
		
	}


	

}

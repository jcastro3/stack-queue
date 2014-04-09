package stack1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class queueTest {
	Queue q;
	@Before
	public void init(){
		q = new Queue();
	}
	

	@Test
	public void testGetSize() {
		q.enQueue(4);
		q.enQueue(2100);
		assertEquals(2, q.getSize());
	}

	@Test
	public void testEnQueueInt() {
		q.enQueue(50);
		q.enQueue(60);
		q.enQueue(70);
		q.enQueue(80);
		assertEquals(50, q.head.getData());
		assertEquals(60, q.head.next.getData());
	}

	@Test
	public void testEnQueueArray() {
		int q_data[] = {997,21};
		q.enQueue(q_data[0]);
		q.enQueue(q_data[1]);
		assertEquals(997, q.head.getData());
		assertEquals(21, q.head.next.getData());
	}

	@Test
	public void testDeQue() {
		q.enQueue(60);
		q.enQueue(70);
		assertEquals(60, q.deQue());
		assertEquals(70, q.deQue());
		assertNull(q.head);
		
	}

	@Test
	public void testRemoveItem() {
		q.enQueue(8);
		q.enQueue(10);
		q.enQueue(11);
		q.removeItem(11);
		q.removeItem(8);
		assertEquals(10, q.head.getData());
		
	}

	@Test
	public void testToArray() {
		q.enQueue(888);
		q.enQueue(101);
		q.enQueue(111);
		int expected[] = {888,101,111};
		assertArrayEquals(expected,q.toArray());
		
	}

	@Test
	public void testIsEmpty() {
		
		assertTrue(q.isEmpty());
		q.enQueue(3);
		assertFalse( q.isEmpty());
	}

	@Test
	public void testDump() {
		q.enQueue(1);
		q.enQueue(0);
		String sptor = "";
		
		String dump = q.dump(sptor);
		assertEquals("1,0", dump);
		
		q.enQueue(1);
		q.enQueue(0);
		q.enQueue(1);
		q.enQueue(0);
		sptor = "&";
		
		 dump = q.dump(sptor);
		assertEquals("1&0&1&0", dump);
	}
	
	@Test
	public void testUnique()
	{
		
	}

}

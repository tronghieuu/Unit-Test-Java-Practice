package stack;
import org.junit.Test;

import junit.framework.TestCase;
public class TestStack extends TestCase{
	@Test
	public void testNotEmptyStack() {
		 System.out.println("------------testNotEmptyStack------------");
		 IntegerStack stack = new IntegerStack(10);
		  
		 stack.Push("3");
		 stack.Push("2");
		 stack.Push("4");
		 stack.Push("5");
		 stack.Push("1");
		 
		 assertFalse(stack.IsEmpty());
		 
		 try {
			assertEquals(stack.Peek(),"1");
		} catch (StackEmptyException e) {
			// TODO Auto-generated catch block
			assertEquals(e.getMessage(),"StackEmptyException: Can't peek when stack is empty");
		}
	
		 assertTrue(stack.Contains("5"));
		 try {
			assertEquals(stack.Pop(),"1");
		} catch (StackEmptyException e) {
			// TODO Auto-generated catch block
			assertEquals(e.getMessage(),"StackEmptyException: Can't pop when stack is empty");
		}
	}
	@Test
	public void testPushOverMax() {
		 System.out.println("------------testPushOverMax------------");
		 IntegerStack stack = new IntegerStack(5);
		  
		 stack.Push("3");
		 stack.Push("2");
		 stack.Push("4");
		 stack.Push("5");
		 stack.Push("1");
		 stack.Push("4");
		 stack.Push("5");
		 stack.Push("1");	 
	}
	@Test
	public void testPopFunction() {
		 System.out.println("------------testPopFunction------------");
		 IntegerStack stack = new IntegerStack(10);
		  
		 stack.Push("3");
		 stack.Push("2");
		 stack.Push("4");
		 stack.Push("5");
		 stack.Push("1");
		 
		 try {
			assertEquals(stack.Pop()+stack.Pop()+stack.Pop()+stack.Pop()+stack.Pop(),"15423");
		} catch (StackEmptyException e) {
			// TODO Auto-generated catch block
			assertEquals(e.getMessage(),"StackEmptyException: Can't pop when stack is empty");
		}
	}
	@Test
	public void testEmptyStack() {
		 System.out.println("------------testEmptyStack------------");
		 
		 IntegerStack stack = new IntegerStack(10);
		  
		 assertTrue(stack.IsEmpty());
		 
	     try {
			System.out.println(stack.Peek());
		} catch (StackEmptyException e) {
			// TODO Auto-generated catch block
			assertEquals(e.getMessage(),"StackEmptyException: Can't peek when stack is empty");
		}
		 
	
		 assertFalse(stack.Contains("5"));
		  
		 try {
			System.out.println("Pop value = " + stack.Pop());
		} catch (StackEmptyException e) {
			// TODO Auto-generated catch block
			assertEquals(e.getMessage(),"StackEmptyException: Can't pop when stack is empty");
		}	
	}
	@Test
	public void testClearFunction() {
		 System.out.println("------------testClearFunction------------");
		 IntegerStack stack = new IntegerStack(10);
		  
		 stack.Push("3");
		 stack.Push("2");
		 stack.Push("4");
		 stack.Push("5");
		 stack.Push("1");
		  
		 stack.Clear();
		 
		 assertTrue(stack.IsEmpty());
	}
}

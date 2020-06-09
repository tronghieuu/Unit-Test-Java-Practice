package stack;

public class IntegerStack implements IStack 
{

    private int stack [];
    private int top;
    private int size;

    public IntegerStack(int size) 
    {
    this.size = size;
    stack = new int [size];
    top = 0; 
    }

    public void Clear()
    { 
    	stack = new int [size];
    	top = 0;
    }
    
    public boolean Contains(String value)
    {
    	for(int i=0; i<top; i++)
    	{
    		if (stack[i]==Integer.parseInt(value))
    			return true;
    	}
    	return false;
    }
    
    public String Peek() throws StackEmptyException 
    { 
    	if(!IsEmpty()){
             return String.valueOf(stack[top-1]);
        } else{
        	throw new StackEmptyException("Can't peek when stack is empty");
        }
    }

	public void Push(String value) 
	{
	    if (top == stack.length){
	    	System.out.println("Stack is full");
	    } else {
	       stack[top]= Integer.parseInt(value);
	        top++;
	    }
	
	}

	public String Pop() throws StackEmptyException
	{
	    if(!IsEmpty()){
	    	int value = stack[top-1];
	       	top --;
	     	return String.valueOf(value); 
	    } else{
	    	throw new StackEmptyException("Can't pop when stack is empty");
	    }
	}

	public boolean IsEmpty()
	{
	    if (top == 0)
	    {
	        return true;
	    } else {
	    	return false;
	    }
	}


}
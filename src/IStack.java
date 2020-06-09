package stack;
interface IStack
{
	void Clear();
    boolean Contains(String value);
    String Peek() throws StackEmptyException;
    void Push(String value);
    String Pop() throws StackEmptyException;
    boolean IsEmpty();
}


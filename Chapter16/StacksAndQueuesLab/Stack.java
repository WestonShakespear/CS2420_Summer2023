
public class Stack<AnyType>
{
	private LinkedList<AnyType> stack;

	public Stack()
	{
		this.stack = new LinkedList<>();
		this.stack.delimeter = "%n-%n";
	}

	public void pop()
	{
		this.stack.removeFromFirst();
	}
	
	public AnyType top()
	{
		return null;
	}

	public AnyType topAndPop()
	{
		AnyType value = this.top();
		this.pop();

		return value;
	}

	public void push(AnyType _a)
	{
		this.stack.insertFront(_a);
	}
	
	public boolean isEmpty()
	{
		return this.stack.isEmpty();
	}
	
	public void makeEmpty()
	{
		this.stack.makeEmpty();
	}

	@Override
	public String toString()
	{
		return String.format(" top%n******%n%s%n******%nbottom%n%n", this.stack.toString());
	}

	public static void main(String[] args)
	{
		Stack<Integer> st = new Stack<>();

		st.push(4);	System.out.println(st.toString());
		st.push(3);	System.out.println(st.toString());
		st.push(2);	System.out.println(st.toString());

		st.pop();	System.out.println(st.toString());
		st.pop();	System.out.println(st.toString());
		st.pop();	System.out.println(st.toString());
	}
	
	
}

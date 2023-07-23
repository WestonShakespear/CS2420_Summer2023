// Most of the logic was added to LinkedList.java...Node.java was unchanged
public class wshakespear_Stack<AnyType>
{
	private wshakespear_LinkedList<AnyType> stack;

	public wshakespear_Stack()
	{
		this.stack = new wshakespear_LinkedList<>();
		this.stack.delimeter = "%n-%n";
	}

	public void pop()
	{
		this.stack.removeFromFirst();
	}
	
	public AnyType top()
	{
		return this.stack.getFirstItem();
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
		wshakespear_Stack<Integer> st = new wshakespear_Stack<>();

		st.push(4);	System.out.println(st.toString());
		st.push(3);	System.out.println(st.toString());
		st.push(2);	System.out.println(st.toString());

		System.out.printf("Top is %s%n", st.top());


		st.pop();	System.out.println(st.toString());
		st.pop();	System.out.println(st.toString());
		st.pop();	System.out.println(st.toString());
	}
	
	
}

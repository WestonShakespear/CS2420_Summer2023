// Most of the logic was added to LinkedList.java...Node.java was unchanged
public class wshakespear_Queue<AnyType> {

	wshakespear_LinkedList<AnyType> queue;

	public wshakespear_Queue()
	{
		this.queue = new wshakespear_LinkedList<>();
		this.queue.delimeter = "->";
	}

	public void dequeue()
	{
		this.queue.removeFromEnd();
	}
	
	public AnyType getFront()
	{
		return this.queue.getLastItem();
	}
	
	public AnyType getFrontAndDequeue()
	{
		AnyType value = this.getFront();
		this.dequeue();
		return value;
	}
	
	public void enqueue(AnyType _t)
	{
		this.queue.insertFront(_t);
	}
	
	public boolean isEmpty()
	{
		return this.queue.isEmpty();
	}
	
	public void makeEmpty()
	{
		this.queue.makeEmpty();
	}

	@Override
	public String toString()
	{
		return String.format("|front|  %s  |back|%n", this.queue.toString());
	}


	public static void main(String[] args)
	{
		wshakespear_Queue<Integer> st = new wshakespear_Queue<>();

		st.enqueue(4);	System.out.println(st.toString());
		st.enqueue(3);	System.out.println(st.toString());
		st.enqueue(2);	System.out.println(st.toString());

		System.out.printf("Front is %s%n", st.getFront());

		st.dequeue();	System.out.println(st.toString());
		st.dequeue();	System.out.println(st.toString());
		st.dequeue();	System.out.println(st.toString());
	}

}

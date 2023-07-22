
public class GenericMemoryCell<AnyType extends Comparable<? super AnyType>> 
implements Comparable<GenericMemoryCell<AnyType>>
{

	private AnyType storedValue;

	public AnyType read( )         { return storedValue; }
	public void write( AnyType x ) { storedValue = x; }


	@Override
	public int compareTo(GenericMemoryCell<AnyType> o)
	{
		return this.storedValue.compareTo(o.storedValue);
	}
}

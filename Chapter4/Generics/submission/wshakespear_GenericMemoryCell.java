public class wshakespear_GenericMemoryCell<AnyType extends Comparable<? super AnyType>> 
implements Comparable<wshakespear_GenericMemoryCell<AnyType>>
{

	private AnyType storedValue;

	public AnyType read( )         { return storedValue; }
	public void write( AnyType x ) { storedValue = x; }


	@Override
	public int compareTo(wshakespear_GenericMemoryCell<AnyType> o)
	{
		return this.storedValue.compareTo(o.storedValue);
	}
}

//package weiss.nonstandard;

// Basic node stored in a linked list
// Note that this class is not accessible outside
// of package weiss.nonstandard

class wshakespear_ListNode<AnyType>
{
      // Constructors
    public wshakespear_ListNode( AnyType theElement )
    {
        this( theElement, null );
    }

    public wshakespear_ListNode( AnyType theElement, wshakespear_ListNode<AnyType> n )
    {
        element = theElement;
        next    = n;
    }

    public AnyType   element;
    public wshakespear_ListNode<AnyType> next;
}

// BinaryNode class; stores a node in a tree.
//
// CONSTRUCTION: with (a) no parameters, or (b) an Object,
//     or (c) an Object, left child, and right child.
//
// *******************PUBLIC OPERATIONS**********************
// int size( )            --> Return size of subtree at node
// int height( )          --> Return height of subtree at node
// void printPostOrder( ) --> Print a postorder tree traversal
// void printInOrder( )   --> Print an inorder tree traversal
// void printPreOrder( )  --> Print a preorder tree traversal
// BinaryNode duplicate( )--> Return a duplicate tree

/**
 * Binary node class with recursive routines to
 * compute size and height.
 */
final class wshakespear_BinaryNode<AnyType>
{
    public wshakespear_BinaryNode( )
    {
        this( null, null, null );
    }
    
    public wshakespear_BinaryNode( AnyType theElement)
    {
        element = theElement;
        left    = null;
        right   = null;
    }

    public wshakespear_BinaryNode( AnyType theElement, wshakespear_BinaryNode<AnyType> lt, wshakespear_BinaryNode<AnyType> rt )
    {
        element = theElement;
        left    = lt;
        right   = rt;
    }

    /**
     * Return the size of the binary tree rooted at t.
     */
    public static <AnyType> int size( wshakespear_BinaryNode<AnyType> t )
    {
        if( t == null )
            return 0;
        else
            return 1 + size( t.left ) + size( t.right );
    }

    /**
     * Return the height of the binary tree rooted at t.
     */
    public static <AnyType> int height( wshakespear_BinaryNode<AnyType> t )
    {
        if( t == null )
            return -1;
        else
            return 1 + Math.max( height( t.left ), height( t.right ) );
    }

    // Print tree rooted at current node using preorder traversal.
    public void printPreOrder( )
    {
        System.out.println( element );       // Node
        if( left != null )
            left.printPreOrder( );           // Left
        if( right != null )
            right.printPreOrder( );          // Right
    }


    // Print tree rooted at current node using postorder traversal.
    public void printPostOrder( )
    {
        if( left != null )
            left.printPostOrder( );          // Left
        if( right != null )
            right.printPostOrder( );         // Right
        System.out.println( element );       // Node
    }

    // Print tree rooted at current node using inorder traversal.
    public void printInOrder( )
    {
        if( left != null )
            left.printInOrder( );            // Left
        System.out.println( element );       // Node
        if( right != null )
            right.printInOrder( );           // Right
    }


    /**
     * Return a reference to a node that is the root of a
     * duplicate of the binary tree rooted at the current node.
     */
    public wshakespear_BinaryNode<AnyType> duplicate( )
    {
        wshakespear_BinaryNode<AnyType> root = new wshakespear_BinaryNode<AnyType>( element, null, null );

        if( left != null )            // If there's a left subtree
            root.left = left.duplicate( );    // Duplicate; attach
        if( right != null )          // If there's a right subtree
            root.right = right.duplicate( );  // Duplicate; attach
        return root;                      // Return resulting tree
    }
    
    public AnyType getElement( )
    {
        return element;
    }
    
    public wshakespear_BinaryNode<AnyType> getLeft( )
    {
        return left;
    }
    
    public wshakespear_BinaryNode<AnyType> getRight( )
    {
        return right;
    }
    
    public void setElement( AnyType x )
    {
        element = x;
    }
    
    public void setLeft( wshakespear_BinaryNode<AnyType> t )
    {
        left = t;
    }
    
    public void setRight( wshakespear_BinaryNode<AnyType> t )
    {
        right = t;
    }

   
    public String buildString()
    {
        String ret = "";

        if (left != null)
        {
            ret += left.buildString();
        }
        if (element != null)
        {
            ret += element.toString() + ", ";
        }
        if (right != null)
        {
            ret += right.buildString(); 
        }

    	return ret;
    }
    
    @Override
    public String toString()
    {
        String built = this.buildString();
        return built.substring(0, built.length() - 2);
    }

    AnyType             element;
    wshakespear_BinaryNode<AnyType> left;
    wshakespear_BinaryNode<AnyType> right;
}

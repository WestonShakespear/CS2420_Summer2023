public class LinkedList<AnyType> {

    public Node<AnyType> list;

	public LinkedList()
    {
        list = new Node<AnyType>();
	}

    /**
     * Test if the list is logically empty.
     * @return true if empty, false otherwise.
     */
    public boolean isEmpty() {
    	return (this.list.getNextNode() == null);
    }

    /**
     * Make the list logically empty.
     */
    public void makeEmpty()
    {
        this.list.setNextNode(null);
    }


    /**
     * Insert at the front
     * @param x the item to insert.
     */
    public void insertFront(AnyType _x)
    {   
        this.list.setNextNode
        (
            new Node<AnyType>(_x, list.getNextNode())
        );
    }

    /**
     * Return Node corresponding to the first node containing an item.
     * @param x the item to search for.
     * @return a Node; node is not valid if item is not found.
     */
    public Node<AnyType> find(AnyType _x)
    {
    	Node<AnyType> found = null;
        Node<AnyType> current = this.list.getNextNode();

        while (current != null)
        {
            if (current.getItem() == _x)
            {
                found = current;
                break;
            }
            current = current.getNextNode();
        }

        return found;
    }

    /**
     * Remove the first occurrence of an item.
     * @param x the item to remove.
     */
    public void remove(AnyType _x)
    {
        Node<AnyType> previous = this.list;
        Node<AnyType> current = this.list.getNextNode();

        while (current != null)
        {
            if (current.getItem() == _x)
            {
                previous.setNextNode(current.getNextNode());
                break;
            }
            previous = current;
            current = current.getNextNode();
        }
    }

    /**
     * Return a string representation of the list
     */
    @Override
    public String toString()
    {
        String value = "";
		Node<AnyType> current = this.list.getNextNode();

		while (current != null)
        {
            value += String.format("%s ", current.getItem().toString());
            current = current.getNextNode();
        }

        if (value.length() > 0)
        {
            return value.substring(0, value.length() - 1);
        }

        return null;
    }

    /**
     * Return the size of the list
     * @return
     */
    public static <AnyType> int listSize(LinkedList<AnyType> _theList)
    {
    	Node<AnyType> current = _theList.list.getNextNode();
        int length = 0;

		while (current != null)
        {
            length++;
            current = current.getNextNode();
        }

        return length;
    }

    
    
    
    
    
	//Methods for the Chapter 17 Programming assignment
    /**
     * Insert at the end
     * @param x the item to insert.
     */
    public void insertEnd(AnyType _x)
    {

    }

    
    /**
     * Remove the last occurrence of an item.
     * @param x the item to remove.
     */	
	public void removeLast(AnyType _x)
    {
		
	}
	
    /**
     * Remove all occurrences of an item.
     * @param x the item to remove.
     */	
	public void removeAll(AnyType _x)
    {
		
	}
	
    /**
     * Return Node just before the first node containing an item.
     * @param x the item to search for.
     * @return a Node; node is not valid if item is not found, or is the first item in the list.
     * 
     */
	public Node<AnyType> previous(AnyType _x)
    {
		return null;
	}

	/**
     * Return Node corresponding to the first node containing an item.
     * @param x the item to search for.
     * @return a Node; node is not valid if item is not found.
     * 
     * As a by product, the found node is moved to the front of the list
     * according to the move to front heuristic of 17.17
     */
	public Node<AnyType> findAndMoveToFront(AnyType _x)
    {
		return null;
	}


}

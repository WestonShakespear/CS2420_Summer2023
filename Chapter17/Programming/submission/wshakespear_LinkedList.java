public class wshakespear_LinkedList<AnyType> {

    public wshakespear_Node<AnyType> list;

	public wshakespear_LinkedList()
    {
        list = new wshakespear_Node<AnyType>();
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
            new wshakespear_Node<AnyType>(_x, list.getNextNode())
        );
    }

    /**
     * Return Node corresponding to the first node containing an item.
     * @param x the item to search for.
     * @return a Node; node is not valid if item is not found.
     */
    public wshakespear_Node<AnyType> find(AnyType _x)
    {
    	wshakespear_Node<AnyType> found = null;
        wshakespear_Node<AnyType> current = this.list.getNextNode();

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
        wshakespear_Node<AnyType> previous = this.list;
        wshakespear_Node<AnyType> current = this.list.getNextNode();

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
		wshakespear_Node<AnyType> current = this.list.getNextNode();

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
    public static <AnyType> int listSize(wshakespear_LinkedList<AnyType> _theList)
    {
    	wshakespear_Node<AnyType> current = _theList.list.getNextNode();
        int length = 0;

		while (current != null)
        {
            length++;
            current = current.getNextNode();
        }

        return length;
    }

    /**
     * Insert at the end
     * @param x the item to insert.
     */
    public void insertEnd(AnyType _x)
    {
        // Use previous to keep the last node
        wshakespear_Node<AnyType> previous = this.list;
        // This is the start of the chain
        wshakespear_Node<AnyType> current = this.list.getNextNode();
        
        // Iterate though the nodes
        while (current != null)
        {
            previous = current;
            current = current.getNextNode();
        }

        // Attach the new node to the last node's pointer
        wshakespear_Node<AnyType> last = new wshakespear_Node<AnyType>(_x);
        previous.setNextNode(last);
    }

    /**
     * Remove the last occurrence of an item.
     * @param x the item to remove.
     */	
	public void removeLast(AnyType _x)
    {
        wshakespear_Node<AnyType> matchBefore = null;
        wshakespear_Node<AnyType> matchAfter = null;

        // Use previous to keep the last node
        wshakespear_Node<AnyType> previous = this.list;
        // This is the start of the chain
        wshakespear_Node<AnyType> current = this.list.getNextNode();

        // Iterate though the all the nodes
        while (current != null)
        {
            // Check the node for the value
            if (current.getItem() == _x)
            {
                // Retain the previous and next nodes
                matchBefore = previous;
                matchAfter = current;
            }
            previous = current;
            current = current.getNextNode();
        }

        // Remove the node between the last prevous and next nodes
        if (matchBefore != null && matchAfter != null)
        {
            matchBefore.setNextNode(matchAfter.getNextNode());
        }
	}

    /**
     * Remove all occurrences of an item.
     * @param x the item to remove.
     */	
	public void removeAll(AnyType _x)
    {
        // Use previous to keep the last node
		wshakespear_Node<AnyType> previous = this.list;
        // This is the start of the chain
        wshakespear_Node<AnyType> current = this.list.getNextNode();

        // Iterate though the all the nodes
        while (current != null)
        {
            // Remove every node that matches the value
            if (current.getItem() == _x)
            {
                previous.setNextNode(current.getNextNode());
            }
            previous = current;
            current = current.getNextNode();
        }
	}
	
    /**
     * Return Node just before the first node containing an item.
     * @param x the item to search for.
     * @return a Node; node is not valid if item is not found, or is the 
     * first item in the list.
     * 
     */
	public wshakespear_Node<AnyType> previous(AnyType _x)
    {
        // Use previous to keep the last node
		wshakespear_Node<AnyType> previous = null;
        // This is the start of the chain
        wshakespear_Node<AnyType> current = this.list.getNextNode();

        // Iterate though the nodes until one matches the value
        while (current != null)
        {
            if (current.getItem() == _x)
            {
                break;
            }
            previous = current;
            current = current.getNextNode();
        }

        return previous;
	}






	/**
     * Return Node corresponding to the first node containing an item.
     * @param x the item to search for.
     * @return a Node; node is not valid if item is not found.
     * 
     * As a by product, the found node is moved to the front of the list
     * according to the move to front heuristic of 17.17
     */
	public wshakespear_Node<AnyType> findAndMoveToFront(AnyType _x)
    {
        // First use the find method to get the node with the value
        wshakespear_Node<AnyType> found = this.find(_x);
        // If we found a match use the remove method, then the insertFront method
		if (found != null)
        {
            this.remove(_x);
            this.insertFront(_x);
        }
        
        return found;
	}


}

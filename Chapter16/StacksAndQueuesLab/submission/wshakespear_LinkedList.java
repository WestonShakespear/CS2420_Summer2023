
public class wshakespear_LinkedList<AnyType> {

    public Node<AnyType> list;
    public String delimeter = " ";

	public wshakespear_LinkedList()
    {
        list = new Node<AnyType>();
	}

    //------------------NEW METHODS FOR STACKS AND QUEUES LAB----------//
    /**
     * Returns the first node
     */
    public Node<AnyType> getFirstNode()
    {
        return this.list.getNextNode();
    }

    /**
     * Returns the first item
     */
    public AnyType getFirstItem()
    {
        Node<AnyType> firstNode = this.getFirstNode();
        if (firstNode != null)
        {
            return firstNode.getItem();
        }
        return null;
    }


    /**
     * Returns the last node
     */
    public Node<AnyType> getLastNode()
    {
        // Use previous to keep the last node
        Node<AnyType> previous = this.list;
        // This is the start of the chain
        Node<AnyType> current = this.list.getNextNode();

        // Iterate though the all the nodes
        while (current != null)
        {
            previous = current;
            current = current.getNextNode();
        }
        return previous;
    }

    /**
     * Returns the last item
     */
    public AnyType getLastItem()
    {
        Node<AnyType> lastNode = this.getLastNode();
        if (lastNode != null)
        {
            return lastNode.getItem();
        }
        
        return null;
    }

    /**
     * Remove the first node
     */	
    public void removeFromFirst()
    {
        this.list.setNextNode(this.list.getNextNode().getNextNode());
    }

    /**
     * Remove the last node
     */	
    public void removeFromEnd()
    {
        // Use previous to keep the last node
        Node<AnyType> previous = this.list;
        // This is the start of the chain
        Node<AnyType> current = this.list.getNextNode();

        // Iterate though the all the nodes
        while (current.getNextNode() != null)
        {
            previous = current;
            current = current.getNextNode();
        }
        // Remove the last node
        previous.setNextNode(null);
    }

    //------------------END METHODS FOR STACKS AND QUEUES LAB----------//

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
            value += String.format("%s" + this.delimeter, current.getItem().toString());
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
    	Node<AnyType> current = _theList.list.getNextNode();
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
        Node<AnyType> previous = this.list;
        // This is the start of the chain
        Node<AnyType> current = this.list.getNextNode();
        
        // Iterate though the nodes
        while (current != null)
        {
            previous = current;
            current = current.getNextNode();
        }

        // Attach the new node to the last node's pointer
        Node<AnyType> last = new Node<AnyType>(_x);
        previous.setNextNode(last);
    }

    /**
     * Remove the last occurrence of an item.
     * @param x the item to remove.
     */	
	public void removeLast(AnyType _x)
    {
        Node<AnyType> matchBefore = null;
        Node<AnyType> matchAfter = null;

        // Use previous to keep the last node
        Node<AnyType> previous = this.list;
        // This is the start of the chain
        Node<AnyType> current = this.list.getNextNode();

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
		Node<AnyType> previous = this.list;
        // This is the start of the chain
        Node<AnyType> current = this.list.getNextNode();

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
	public Node<AnyType> previous(AnyType _x)
    {
        // Use previous to keep the last node
		Node<AnyType> previous = null;
        // This is the start of the chain
        Node<AnyType> current = this.list.getNextNode();

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
	public Node<AnyType> findAndMoveToFront(AnyType _x)
    {
        // First use the find method to get the node with the value
        Node<AnyType> found = this.find(_x);
        // If we found a match use the remove method, then the insertFront method
		if (found != null)
        {
            this.remove(_x);
            this.insertFront(_x);
        }
        
        return found;
	}


}

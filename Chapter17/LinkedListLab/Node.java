class Node<AnyType>
{
	private AnyType x;
	private Node<AnyType> next;

	/**
	 * Create an empty node
	 */
	public Node()
	{
		this.x = null;
		this.next = null;
	}
	
	/**
	 * Create a node with the value of _x
	 * @param _x
	 */
	public Node(AnyType _x)
	{
		this.x = _x;
		this.next = null;
	}

	/**
	 * Create a node with the value of _x and a pointer of _n
	 * @param _x
	 * @param _n
	 */
	public Node(AnyType _x, Node<AnyType> _n)
	{
		this.x = _x;
		this.next = _n;
	}

	/**
	 * Get the value of this node
	 * @return The node's value
	 */
	public AnyType getItem()
	{
		return this.x;
	}

	/**
	 * Set the value of this node to _x
	 * @param _x
	 */
	public void setItem(AnyType _x)
	{
		this.x = _x;
	}

	/**
	 * Set the pointer of this node to _n
	 * @param _n
	 */
	public void setNextNode(Node<AnyType> _n)
	{
		this.next = _n;
	}

	/**
	 * Get the pointer of this node
	 * @return The node's pointer
	 */
	public Node<AnyType> getNextNode()
	{
		return this.next;
	}

	/**
	 * Create a string from all nodes
	 */
	@Override
	public String toString()
	{
		String value = "";
		Node<AnyType> current = this;

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
}

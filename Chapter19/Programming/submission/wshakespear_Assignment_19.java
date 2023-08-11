
public class wshakespear_Assignment_19 {

	//19.15
	public static <AnyType extends Comparable<? super AnyType>> wshakespear_BinaryNode<AnyType> findMin(wshakespear_BinarySearchTree<AnyType> t) {
		//This just calls the BinaryNode method, You can change this if you want, but I found it easier
		//to program the BinaryNode version listed next
		return t.findMin(t.root); 
	}
	
	//19.15
	public static <AnyType extends Comparable<? super AnyType>> wshakespear_BinaryNode<AnyType> findMax(wshakespear_BinarySearchTree<AnyType> t) {
		//This just calls the BinaryNode method, You can change this if you want, but I found it easier
		//to program the BinaryNode version listed next
		return t.findMax(t.root);
	}

	//19.15
	public static <AnyType extends Comparable<? super AnyType>> wshakespear_BinaryNode<AnyType> find(AnyType x, wshakespear_BinarySearchTree<AnyType> t) {
		//This just calls the BinaryNode method, You can change this if you want, but I found it easier
		//to program the BinaryNode version listed next
		return t.find(x, t.root);
	}
	
	//19.27
	//Ideally the toString methods are stuck in the BinarySearchTree and BinaryNode files
	//to make it easier for me to grade, and you to program, I put them here and changed the methods a little
	public static <AnyType extends Comparable<? super AnyType>> String toString(wshakespear_BinarySearchTree<AnyType> t) {
		//This just calls the BinaryNode method, You can change this if you want, but I found it easier
		//to program the BinaryNode version listed next
		return t.toString();
	}

}

import java.util.Scanner;

public class Assignment_17_UserInput {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to Dr Bs Shopping Application");
		LinkedList<String> a = new LinkedList<String>();
		

		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println();
			System.out.println("Please select from the following:");
			System.out.println("\tType 1 to add an item");
			System.out.println("\tType 2 to remove an item");
			System.out.println("\tType 3 to see if an item is in the list");
			System.out.println("\tType 4 to print the list");
			System.out.println("\tType -1 to exit");
			int x = in.nextInt();
			if(x == 1) {
				System.out.println("Enter 1 to add it to the front, or 2 to add it to the end");
				int y = in.nextInt();
				System.out.println("Please enter the name of the item to add");
				in.nextLine();
				String s = in.nextLine();
				if(y == 1) {
					a.insertFront(s);
				} else {
					a.insertEnd(s);
				}
			}
			else if (x == 2) {
				System.out.println("Please enter the name of the item to remove");
				in.nextLine();
				String s = in.nextLine();
				a.remove(s);
			}
			else if (x == 3) {
				System.out.println("Enter 1 to use a smarter search that moves the item to the front, or 2 for the standard search");
				int y = in.nextInt();
				System.out.println("Please enter the name of the item you wish to find");
				in.nextLine();
				String s = in.nextLine();
				if(y == 1){
					if(a.findAndMoveToFront(s) != null) {
						System.out.println("The item is in your list");
					} else {
						System.out.println("The item is NOT in your list");						
					}
				} else {
					if(a.find(s) != null) {
						System.out.println("The item is in your list");
					} else {
						System.out.println("The item is NOT in your list");						
					}
					
				}
			}
			else if (x == 4) {
				System.out.println("Your list contains the following:");
				System.out.println(a.toString());
			} else {
				keepGoing = false;
			}
		}
		
		System.out.println();
		System.out.println("Thank you for using Dr. B's Shopping Application");
		System.out.println("System exiting");

	}

}

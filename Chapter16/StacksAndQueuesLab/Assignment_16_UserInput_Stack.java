import java.util.Scanner;

public class Assignment_16_UserInput_Stack {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to Dr Bs Stack of Books");
		Stack<String> a = new Stack<String>();
		

		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println();
			System.out.println("Please select from the following:");
			System.out.println("\tType 1 to push/add an book to the top of the stack");
			System.out.println("\tType 2 to remove the top book from the stack");
			System.out.println("\tType 3 to see the top book on the stack");
			System.out.println("\tType 4 to see if the stack is empty");
			System.out.println("\tType -1 to exit");
			int x = in.nextInt();
			if(x == 1) {
				System.out.println("Please enter the name of the book you are putting on the top of the stack");
				in.nextLine();
				String s = in.nextLine();
				a.push(s);
			}
			else if (x == 2) {
				System.out.println("Top book is being removed (if any)");
				a.pop();
			}
			else if (x == 3) {
				System.out.println("The book on the top of the stack is: " + a.top());
			}
			else if (x == 4) {
				if (a.isEmpty()) {
					System.out.println("There are NO books on the stack");
				}
				else {
					System.out.println("There is at least one book on the stack");
				}
			}
			else {
				keepGoing = false;
			}
		}
		
		System.out.println();
		System.out.println("Thank you for using Dr. B's Book Stack Application");
		System.out.println("System exiting");

	}

}

import java.util.Scanner;

public class Assignment_16_UserInput_Queue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to Dr Bs Checkout line at the store");
		Queue<String> a = new Queue<String>();
		

		boolean keepGoing = true;
		while (keepGoing) {
			System.out.println();
			System.out.println("Please select from the following:");
			System.out.println("\tType 1 to get in line/enqueue a person");
			System.out.println("\tType 2 to have the first person in line checkout");
			System.out.println("\tType 3 to see the name of the first person in line");
			System.out.println("\tType 4 to see if the there is anyone in line");
			System.out.println("\tType -1 to exit");
			int x = in.nextInt();
			if(x == 1) {
				System.out.println("Please enter the name of person who will be getting in line");
				in.nextLine();
				String s = in.nextLine();
				a.enqueue(s);
			}
			else if (x == 2) {
				System.out.println("The first person in line has left the store (if any)");
				a.dequeue();
			}
			else if (x == 3) {
				System.out.println("The name of the first person in line is: " + a.getFront());
			}
			else if (x == 4) {
				if (a.isEmpty()) {
					System.out.println("It is a slow day.  No one is in line");
				}
				else {
					System.out.println("Someone is ready to checkout");
				}
			}
			else {
				keepGoing = false;
			}
		}
		
		System.out.println();
		System.out.println("Thank you for using Dr. B's Checkout line Application");
		System.out.println("System exiting");

	}

}

import java.util.Scanner;

public class wshakespear_Assignment_07
{
	
	public static int Ackerman(int m, int n)
	{
		// n + 1 if m = 0
		if (m == 0)
			return n + 1;

		// A(m - 1, 1) if m > 0 and n = 0
		else if (m > 0 && n == 0)
			return Ackerman(m - 1, 1);

		// A(m - 1, A(m, n - 1)) if m > 0 and n > 0
		return Ackerman(m - 1, Ackerman(m, n - 1));
	}
	
	public static int numberOfOnesInBinaryRepresentation(int num)
	{
		return switch (num) {
			// Base case 0
			case 0 -> 0;
			// Base case 1
			case 1 -> 1;
			// Keep going
			default -> numberOfOnesInBinaryRepresentation(num / 2)
			+ numberOfOnesInBinaryRepresentation(num % 2);
		};		
	}

	public static void printReverse(Scanner in)
	{
		// Base case of no input to receive
		if (!in.hasNextLine())	return;
			
		// Pull current input
		String line = in.nextLine();

		// Sort out the rest then print after
		printReverse(in);
		System.out.println(line);
	}

	

	
}

import java.util.Scanner;

public class Assignment_07
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

	public static void allSums(int[] list)
	{
		System.out.println(list.length);

		
		if (list.length == 0)
			return;

		
		allSums(popEnd(list));
	}


	public static int[] popEnd(int[] input)
	{
		int[] output = new int[input.length - 1];
		for (int a = 0; a < input.length - 1; a++)
		{
			output[a] = input[a];
		}
		return output;
	}

	public static void combination(int n, int r)
	{
		int a = 1;

		for (int i = n; i > 1; i--)
		{
			a *= i;
		}

		int b = 1;
		for (int i = n - r; i > 1; i--)
		{
			b *= i;
		}

		int c = 1;
		for (int i = r; i > 1; i--)
		{
			c *= i;
		}

		int end = (a / (b * c));
		System.out.printf("%s    %s    %s%n", a, b, c);
		System.out.println(end);
	}




	public static void main(String[] args)
	{
		int[] listA = {1, 2, 3, 4, 5};

		allSums(listA);


	}
	
}

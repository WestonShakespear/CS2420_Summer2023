import java.util.ArrayList;

public class AllSums {
    public static ArrayList<Integer> allSums(int[] list, int length, ArrayList<Integer> ret)
	{
		if (length == -1)
			return ret;

		

		System.out.printf("number: %d select: %d%n", list.length, length);
		combination(list.length, length);
		ret.add(length);
		System.out.println();
		return allSums(list, --length, ret);
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
		// System.out.printf("%s    %s    %s%n", a, b, c);
		System.out.println(end);
	}


	public static void allCombinations(int n, int k)
	{
		int count = 0;
		for (int i1=1;    i1 <= n-k+1; i1++)
		for (int i2=i1+1; i2 <= n-k+2; i2++)
		for (int i3=i2+1; i3 <= n-k+3; i3++)
		for (int i4=i3+1; i4 <= n-k+4; i4++)
		for (int i5=i4+1; i5 <= n-k+5; i5++)
			System.out.printf("%d: %d %d %d %d %d\n", ++count, i1,i2,i3,i4,i5);
	}




	public static void main(String[] args)
	{
		int[] listA = {1, 2, 3, 4, 5};


		ArrayList<Integer> back = new ArrayList<>();

		back = allSums(listA, listA.length, back);

		System.out.println("returned");
		for (Integer n : back)
		{
			System.out.println(n);
		}
	}
}

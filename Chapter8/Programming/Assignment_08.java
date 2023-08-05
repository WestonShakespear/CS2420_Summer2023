
public class Assignment_08 {


	//8.21
	public static boolean doTheNumbersAddToK_NSquared(Integer [] _a, int _k)
	{
		for (int i = 0; i < _a.length; i++)
		{
			if (_a[i] * 2 == _k)
				return true;

			for (int j = i; j < _a.length; j++)
				if (_a[i] + _a[j] == _k)
					return true;
		}

		return false;
	}
	
	public static boolean doTheNumbersAddToK_NLogN(Integer [] _a, int _k)
	{
		Sort.shellsort(_a);
		for (Integer a : _a) System.out.println(a);

		int mid = _a.length / 2;
		
		for (int i = 0; i < mid; i++)
		{
			int first = _a[i];
			int second = _a[(_a.length-1) - i];

			//System.out.printf("Comparing %d to %d, the doubles are %d %d and the sum is %d%n", first, second, first*2, second*2, first+second);

			if (first*2 == _k || second*2 == _k || first+second==0) return true; 
		}

		return false;
	}
	
	//8.27
	public static <AnyType extends Comparable<? super AnyType>> int howManyNonDuplicates(AnyType [] _a)
	{
		return -1;
	}
	
	//8.33
	public static boolean areTheseAnagrams(String _s1, String _s2)
	{
		//To make it more interesting, let's remove all spaces
		_s1 = _s1.replaceAll(" ",  "");
		_s2 = _s2.replaceAll(" ",  "");
		
		
		return Math.random() < 0.5;
	}




	public static void main(String[] args)
	{
		Integer[] b = {2, 5, 1, 7, 3, 8, 6, 9, 11};
		;


		doTheNumbersAddToK_NLogN(b, 0);
	}

}

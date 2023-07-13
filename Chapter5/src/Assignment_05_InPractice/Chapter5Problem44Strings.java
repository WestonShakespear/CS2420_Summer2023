
public class Chapter5Problem44Strings 
{
	final static int NUM_TRIALS = 19;
	final static int NUM_SUB_TRIALS = 30;

	final static int START_NUM = 2;

	public static void main(String[] args)
	{
		// Use a lambda function and the interface to run makeLongString1
		testFunction((n) -> makeLongString1(n));
		System.out.println();
		System.out.println();
		// Use a lambda function and the interface to run makeLongString2
		testFunction((n) -> makeLongString2(n));
	}

	public static void testFunction(Runner run)
	{
		// Do a test run
		long startTime = System.nanoTime();
		run.runThisFunction((int)Math.pow(2, NUM_TRIALS) / 2);
		long endTime = System.nanoTime();

		int trialNum = 1;
		long[][] times = new long[NUM_TRIALS][NUM_SUB_TRIALS];

		for (int input = START_NUM; input <= Math.pow(2, NUM_TRIALS); input *= 2)
		{
			for (int subTrial = 0; subTrial < NUM_SUB_TRIALS; subTrial++)
			{
				startTime = System.nanoTime();
				run.runThisFunction(input);
				endTime = System.nanoTime();
				times[trialNum - 1][subTrial] = endTime - startTime;
				System.out.printf("%d,%d,%d%n", trialNum, input, endTime - startTime);
			}
			// System.out.printf("Trial: %8d | Input: %8d |%n", trialNum, input);

			trialNum++;
		}
	}

	public static String makeLongString1( int N )
	{
		String result = "";
		for( int i = 0; i < N; i++ )
			result += "x";
		return result;
	}

	public static String makeLongString2( int N )
	{
		StringBuilder result = new StringBuilder( "" );
		for( int i = 0; i < N; i++ )
			result.append( "x" );
		return new String( result );
	}

	public interface Runner
	{
		public void runThisFunction(int n);
	}
}



package timekeeper.extended;


public class AlgorithmAnalysis {

	//An integer array that gradually increases in terms of big oh times
	//sizes.length = 45 currently
	int [] sizes;
	Trial[] trials;
	int numTimesForAverage;

	public AlgorithmAnalysis()
	{
		this(2, 45, 10);
	}

	public AlgorithmAnalysis(int _starting, int _totalLength, int _numTimesForAverage)
	{
		this.numTimesForAverage = _numTimesForAverage;
		this.sizes = new int[_totalLength];
		this.sizes[0] = _starting;

		this.trials = new Trial[sizes.length];
		
		for (int i = 1; i < _totalLength - 1; i += 2)
		{
			this.sizes[i + 1] = this.sizes[i - 1] * 2;
			this.sizes[i] = this.sizes[i - 1] + ((this.sizes[i + 1] - this.sizes[i - 1]) / 2);

		}
	}

	public AlgorithmAnalysis(int[] _set, int _numTimesForAverage)
	{
		this.numTimesForAverage = _numTimesForAverage;
		this.sizes = new int[_set.length];
		this.trials = new Trial[_set.length];

		for (int i = 0; i < _set.length; i++)
		{
			this.sizes[i] = _set[i];
		}
	}

	public String getSizes()
	{
		String ret = "";
		for (int i = 0; i < this.sizes.length; i++)
		{
			ret += String.format("%d, ", this.sizes[i]);
		}
		return ret.substring(0, ret.length() - 2);
	}

	
	public void rinse(Functor f)
	{
		//It seems the first time doesn't work well with timing....
		//So time something to get the system warmed up;
		System.nanoTime();
		f.runThisFuctionThatNeedsAnInt(sizes[sizes.length/2]);
		System.nanoTime();
	}

	public void rinse(FunctorArray f)
	{
		//It seems the first time doesn't work well with timing....
		//So time something to get the system warmed up;
		int[] a = f.generateIntArrayFromInt(sizes[sizes.length/2]);
		System.nanoTime();
		f.runThisFuctionThatNeedsAnIntArray(a);
		System.nanoTime();
	}

	


	public void timeMethodThatNeedsAnInt(Functor f) {

		this.rinse(f);
		long startTime, endTime, totalTime = 0;
		long loopTime = 0;
		long runningTime = 0;

		double loopSeconds = 0;
		double runningSeconds = 0;

		String outputFormat = "| Progress: %-10s | Size: %10d | Average: %10ds | All: %8fs | Running: %8fs |%n";

		//Now do the real work
		for(int z = 0; z < sizes.length; z++) {
			trials[z] = new Trial(z, sizes[z], this.numTimesForAverage);
			loopTime = 0;

			for(int i = 0; i < this.numTimesForAverage; i++) {
				System.gc();

				startTime = System.nanoTime();
				f.runThisFuctionThatNeedsAnInt(sizes[z]);
				endTime   = System.nanoTime();
				totalTime = endTime - startTime;
				loopTime += totalTime;
				runningTime += totalTime;

				trials[z].addIntoSortedArray(totalTime);
			}
			trials[z].compute();
			String progress = String.format("%d/%d", z, sizes.length);

			loopSeconds = (double) loopTime / 1000000000;
			runningSeconds = (double) runningTime / 1000000000;

			System.out.printf(outputFormat, progress, sizes[z], trials[z].mean, loopSeconds, runningSeconds	);
		}
	}

	public void timeMethodThatNeedsAnIntArray(FunctorArray f) {

		this.rinse(f);
		long startTime, endTime, totalTime = 0;
		long loopTime = 0;
		long runningTime = 0;

		double loopSeconds = 0;
		double runningSeconds = 0;

		String outputFormat = "| Progress: %-10s | Size: %10d | Average: %10ds | All: %8fs | Running: %8fs |%n";

		//Now do the real work
		for(int z = 0; z < sizes.length; z++) {
			trials[z] = new Trial(z, sizes[z], this.numTimesForAverage);
			loopTime = 0;

			for(int i = 0; i < this.numTimesForAverage; i++) {
				System.gc();

				

				int[] a = f.generateIntArrayFromInt(sizes[sizes.length/2]);
				startTime = System.nanoTime();
				f.runThisFuctionThatNeedsAnIntArray(a);
				endTime   = System.nanoTime();
				
				totalTime = endTime - startTime;
				loopTime += totalTime;
				runningTime += totalTime;

				trials[z].addIntoSortedArray(totalTime);
			}
			trials[z].compute();
			String progress = String.format("%d/%d", z, sizes.length);

			loopSeconds = (double) loopTime / 1000000000;
			runningSeconds = (double) runningTime / 1000000000;

			System.out.printf(outputFormat, progress, sizes[z], trials[z].mean, loopSeconds, runningSeconds	);
		}
	}

	public String displayOutput(boolean csv, boolean individual)
	{
		String ret = "";
		for(int z = 0; z < sizes.length; z++) {
			if (individual)
			{
				ret += String.format("%s%n", trials[z].allTrials(csv));
			} 
			else 
			{
				ret += String.format("%s%n", trials[z].toString(csv));
			}
		}
		return ret;
	}

	public static void main(String[] args) {

		AlgorithmAnalysis test = new AlgorithmAnalysis(100, 21, 10);
		//AlgorithmAnalysis test = new AlgorithmAnalysis();

		System.out.printf("Running tests on:%n%s%n", test.getSizes());

		test.timeMethodThatNeedsAnInt(new SimpleMethod());

		// System.out.printf("Computed...Results: %n%s%n", test.displayOutput(false, false));
		
		// System.out.printf(
		// 	"Trials CSV: %n%s%n%s%n", 
		// 	"Trial,input size,mean time,median time", 
		// 	test.displayOutput(true, false));

		// 	System.out.printf(
		// 		"Individual CSV: %n%s%n%s%n", 
		// 		"Trial,input size,mean time,median time", 
		// 		test.displayOutput(true, true));

		
	}
	
}




class SimpleMethod implements Functor{

	@Override
	public void runThisFuctionThatNeedsAnInt(int a) {
		//createArrayAndFillWithRandom(a);
		// closestNumbers(a);

		int [][] values = new int[a][a+1];
		for (int i = 0; i < a; i++)
		{
			values[i] = createArrayAndFillWithRandom(i+1);
		}
	}

	// public static void closestNumbers(int size) {
	// 	int [] a = createArrayAndFillWithRandom(size);
	// 	//TODO
	// 	//create some code that will check which two numbers are
	// 	//the closest in value in array "a"
	// 	//What do you expect the runtime to be?
	// }
	
	public static int[] createArrayAndFillWithRandom(int size) {
		int [] a = new int[size];
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*Integer.MAX_VALUE/2);
		}
		return a;
	}

}

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class wshakespear_DanaLewisArray {
	
	private wshakespear_DanaLewisDataPoint[] points;
	private int newIndex = 0;
	
	public wshakespear_DanaLewisArray()
	{
		this.points = new wshakespear_DanaLewisDataPoint[1];
	}

	public wshakespear_DanaLewisArray(wshakespear_DanaLewisDataPoint _point)
	{
		this.points = new wshakespear_DanaLewisDataPoint[1];
		this.points[this.newIndex++] = _point;
	}

	public wshakespear_DanaLewisArray(wshakespear_DanaLewisDataPoint[] _points)
	{
		this.points = new wshakespear_DanaLewisDataPoint[_points.length];
		for (int i = 0; i < _points.length; i++)
		{
			this.points[i] = _points[i];
			this.newIndex++;
		}
	}

	public final static boolean debug = false;

	public static void debug(String output)
	{
		if (debug)
			System.out.print(output);
	}

	
	public void addDataPoint(wshakespear_DanaLewisDataPoint _d)
	{
		debug(String.format(
			"    The current array size is %d and the newIndex is %d%n", 
			this.points.length, newIndex));

		if (!(newIndex < this.points.length))
		{
			debug("    There is not room in the array");
			this.resizeArray();
		}
		debug(String.format("    **Placing point at index: %d**%n", newIndex));
		this.points[newIndex++] = _d;


		debug(String.format("%n"));
	}

	private void resizeArray()
	{
		int newSize = this.points.length * 2;
		debug(String.format("    --Resizing array to %d--%n", newSize));
		wshakespear_DanaLewisDataPoint[] newPoints = new wshakespear_DanaLewisDataPoint[newSize];

		for (int i = 0; i < this.points.length; i++)
		{
			newPoints[i] = this.points[i];
		}
		this.points = newPoints;
	}
	
	public int getCurrentAverageHeartRate()
	{
		if (newIndex == 0)
			return 0;

		int average = 0;
		for (int i = 0; i < newIndex; i++)
		{
			average += this.points[i].getHeartRate();
		}
		
		return (average / newIndex);
	}

	public int getCurrentAverageInsulinLevel()
	{
		if (newIndex == 0)
			return 0;

		int average = 0;
		for (int i = 0; i < newIndex; i++)
		{
			average += this.points[i].getInsulinLevel();
		}
		
		return (average / newIndex);
	}

	@Override
	public String toString()
	{
		return String.format(
			"Average HR: %5d    Average IL: %5d",
			this.getCurrentAverageHeartRate(),
			this.getCurrentAverageInsulinLevel());
	}


	
	public static void main(String [] args) {

		System.out.println("First simple tests");
		wshakespear_DanaLewisArray empty = new wshakespear_DanaLewisArray();
		System.out.println(empty.toString());

		wshakespear_DanaLewisDataPoint dp = new wshakespear_DanaLewisDataPoint("01:03", 91, 109);
		wshakespear_DanaLewisArray single = new wshakespear_DanaLewisArray(dp);
		System.out.println(single.toString());


		wshakespear_DanaLewisDataPoint[] d = {
			new wshakespear_DanaLewisDataPoint("01:03", 91, 109),
			new wshakespear_DanaLewisDataPoint("01:08", 100, 10),
			new wshakespear_DanaLewisDataPoint("01:09", 97, 101)};

		wshakespear_DanaLewisArray multi = new wshakespear_DanaLewisArray(d);
		System.out.println(multi.toString());


		System.out.println("Now to test the small file");


		wshakespear_DanaLewisArray smallFile  = new wshakespear_DanaLewisArray();
		String[] dataPoints = getDataPoints("0010Points.txt");

		if (dataPoints != null)
		{
			for (int i = 1; i < dataPoints.length; i++)
			{
				String[] data = dataPoints[i].split(" , ");
				
				if (data.length != 3)
					continue;


				smallFile.addDataPoint( 
					new wshakespear_DanaLewisDataPoint(
						data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2])));


				
			}
		}

		System.out.println(smallFile.toString());


		System.out.println("Now to test the large file");


		wshakespear_DanaLewisArray largeFile  = new wshakespear_DanaLewisArray();
		dataPoints = getDataPoints("unknownPoints.txt");

		if (dataPoints != null)
		{
			for (int i = 1; i < dataPoints.length; i++)
			{
				String[] data = dataPoints[i].split(" , ");
				
				if (data.length != 3)
					continue;


				largeFile.addDataPoint( 
					new wshakespear_DanaLewisDataPoint(
						data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2])));


				
			}
		}

		System.out.println(largeFile.toString());



		//TODO:  Add code in here that reads from the Unknown_Points.txt file.
		//You can test your code on the smaller files if you wish (0001Points.txt)
		//Your code should create a DanaLewisArray, and then lots of DanaLewisDataPoints which should be added using the addDataPoint method
		//Finally, call and print the getCurrentAverageInsulinLevel and getCurrentAverageHeartRate for the file 
		
	}

	public static String[] getDataPoints(String filename)
	{
		try
		{
			FileInputStream fileInput = new FileInputStream(filename);
			BufferedInputStream inputStream = new BufferedInputStream(fileInput);

			String ls = System.lineSeparator();

			String[] file = new String(inputStream.readAllBytes()).split(ls);

			inputStream.close();
			return file;
		}
		catch (IOException e)
		{
			System.err.println(e.getMessage());
		}

		return null;
	}

}

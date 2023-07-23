
public class DanaLewisArray {
	
	private DanaLewisDataPoint[] points;
	private int newIndex = 0;
	
	public DanaLewisArray()
	{
		this.points = new DanaLewisDataPoint[newIndex];
	}

	public DanaLewisArray(DanaLewisDataPoint _point)
	{
		this.points = new DanaLewisDataPoint[1];
		this.points[this.newIndex++] = _point;
	}

	public DanaLewisArray(DanaLewisDataPoint[] _points)
	{
		this.points = new DanaLewisDataPoint[_points.length];
		for (int i = 0; i < _points.length; i++)
		{
			this.points[i] = _points[i];
			this.newIndex++;
		}
	}

	
	public void addDataPoint(DanaLewisDataPoint d) {
		//TODO: Get this working
	}
	
	public int getCurrentAverageHeartRate() {
		//TODO: Get this working correctly
		return -1;
	}

	public int getCurrentAverageInsulinLevel() {
		//TODO: Get this working correctly
		return -1;
	}
	
	public static void main(String [] args) {


		DanaLewisArray empty = new DanaLewisArray();




		

		DanaLewisDataPoint dp = new DanaLewisDataPoint("01:03", 91, 109);
		DanaLewisArray single = new DanaLewisArray(dp);


		DanaLewisDataPoint[] d = {
			new DanaLewisDataPoint("01:03", 91, 109),
			new DanaLewisDataPoint("01:08", 100, 10),
			new DanaLewisDataPoint("01:09", 97, 101)};

		DanaLewisArray multi = new DanaLewisArray(d);


		//TODO:  Add code in here that reads from the Unknown_Points.txt file.
		//You can test your code on the smaller files if you wish (0001Points.txt)
		//Your code should create a DanaLewisArray, and then lots of DanaLewisDataPoints which should be added using the addDataPoint method
		//Finally, call and print the getCurrentAverageInsulinLevel and getCurrentAverageHeartRate for the file 
		
	}

}

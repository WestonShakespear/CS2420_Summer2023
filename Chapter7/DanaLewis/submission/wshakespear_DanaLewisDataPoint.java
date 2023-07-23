
public class wshakespear_DanaLewisDataPoint {

	private String time;
	private int heartRate;
	private int insulinLevel;

	public wshakespear_DanaLewisDataPoint(String _time, int _heartRate, int _insulinLevel)
	{
		this.time = _time;
		this.heartRate = _heartRate;
		this.insulinLevel = _insulinLevel;
	}

	public String getTime() { return this.time; }

	public void setTime(String _time) { this.time = _time; }

	public int getHeartRate() { return this.heartRate; }

	public void setHeartRate(int _heartRate) { this.heartRate = _heartRate; }

	public int getInsulinLevel() { return this.insulinLevel; }

	public void setInsulinLevel(int _insulinLevel) { this.insulinLevel = _insulinLevel; }

	@Override
	public String toString()
	{
		//"Time 20:25, HR 103, IL 116"
		return String.format(
			"Time %s, HR %d, IL %d",
			this.time,
			this.heartRate,
			this.insulinLevel);
	}


	public static void main(String[] args)
	{
		wshakespear_DanaLewisDataPoint dp = new wshakespear_DanaLewisDataPoint("01:03", 91, 109);
		System.out.println(dp.toString());

		dp.setTime("02:56");
		dp.setHeartRate(99);
		dp.setInsulinLevel(5);

		System.out.println(dp.toString());

		System.out.printf(
			"Or| time is: %s | hr is: %d | il is: %d%n",
			dp.getTime(),
			dp.getHeartRate(),
			dp.getInsulinLevel());
	}

}

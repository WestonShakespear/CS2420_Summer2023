
public class Assignment {

	public static boolean doesTheArrayMeetCriteria_5_30(int [] a) {
		//TODO Add code here that determines whether an integer i exists such that A[i] = i in an array of increasing integers
		//TODO What is the runtime of your algorithm?

		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == i)
			{
				return true;
			}
		}


		return false;
	}

	public static boolean isAPrime(int num) {
		
		for (int i = 2; i <= Math.sqrt(num); i++)
		{
			if (num % i == 0)
			{
				return false;
			}
		}
	
		return true;
	}

	public static boolean majorityElement(int [] a) {
		//TODO Finish this method appropriately 
		
		
		
		
		return Math.random() < 0.5;
	}	

}

import java.util.*;

public class wshakespear_Assignment {

	public static boolean doesTheArrayMeetCriteria_5_30(int [] a) {
		// Loop through the array and check each element one time

		for (int i = 0; i < a.length; i++)
		{
			// If they are equal then the array meets the criteria
			if (a[i] == i)
			{
				return true;
			}
		}

		return false;
	}

	public static boolean isAPrime(int num) {
		
		// Search up to the sqrt of the number starting at 2
		for (int i = 2; i <= Math.sqrt(num); i++)
		{
			// If the remainder is 0 then exit
			if (num % i == 0)
			{
				return false;
			}
		}
	
		return true;
	}

	public static boolean majorityElement(int [] _a) {
		
		// Create a map to hold the count for each number
		Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();
		
		// Loop through the whole array once
		for (int i = 0; i < _a.length; i++)
		{
			// Get the Number and initilize the count
			Integer value = _a[i];
			Integer amount = 0;

			// Update the amount if we've already found this number
			if (frequency.containsKey(value))
			{
				amount = frequency.get(value);
			}
			// Add one to the count
			amount += 1;

			// Exit if the count is larger than _a.length / 2
			if (amount > _a.length / 2)
			{
				return true;
			}
			// Update the amount
			frequency.put(value, amount);
		}
		
		return false;
	}	

}

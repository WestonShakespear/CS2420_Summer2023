import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SeaTurtle {

	TurtleInfo me = new TurtleInfo();

	public SeaTurtle(String _name)
	{
		me.name = _name;
	}

	public SeaTurtle(String _name, int[] eggs)
	{
		me.name = _name;
		if (eggs.length == 3)
		{
			me.eggs = eggs;
		}
	}
	
	public String getName()
	{
		return this.me.name;
	}
	
	public void setNumEggs(int _whichYear, int _numEggs)
	{
		int index = this.me.getIndex(_whichYear);
		
		if (index != -1)
		{
			this.me.eggs[index] = _numEggs;
		}
	}

	public int getNumEggs(int _whichYear)
	{
		int index = this.me.getIndex(_whichYear);

		if (index != -1)
		{
			return this.me.eggs[index];
		}
		return index;
	}

	public int getTotalNumberOfEggs()
	{
		int totalEggs = 0;
		for (int eggsInYear : me.eggs)
		{
			totalEggs += eggsInYear;
		}

		return totalEggs;
	}
	
	public static void main(String [] _args)
	{
		String filename = "WildlifeDataFull.txt";
		SeaTurtle[] turtles = new SeaTurtle[500];

		FileInputStream input = null;
		BufferedInputStream stream = null;

		String[] lines = new String[500];

		// Try to read the file
		try
		{
			input = new FileInputStream(filename);
			stream = new BufferedInputStream(input);

			lines = new String( stream.readAllBytes() )
											.split(System.lineSeparator());
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Filename Error!");
			e.printStackTrace();
		}
		catch (IOException e)
		{
			System.out.println("Unknown Input/Output Error!");
			e.printStackTrace();
		}

		// Try to close the file
		try
		{
			if (input != null) input.close();
			if (stream != null) stream.close();
		}
		catch (IOException e)
		{
			System.out.println("Error closing resources!");
			e.printStackTrace();
		}

		// Make sure we've read some meaningful amount of data
		if (lines == null || lines.length < 2)
		{
			System.out.println("Too little information was supplied");
			return;
		}

		// Iterate over lines to create turtle counts
		for (int i = 1; i < lines.length; i++)
		{
			String lineWithoutSpaces = lines[i].replace(" ", "");
			String[] data = lineWithoutSpaces.split(",");

			String name = data[0];
			int eggs[] = new int[3];

			for (int e = 0; e < 3; e++)
			{
				eggs[e] = Integer.parseInt(data[e+1]);
				if (eggs[e] == -1)
				{
					eggs[e] = 0;
				}
				// System.out.printf("Try to parse '%s' into '%d'%n", data[e+1], eggs[e]);
			}

			turtles[i - 1] = new SeaTurtle(name, eggs);
			// System.out.printf("My name is %s: A: %d B: %d C: %d%n", name, eggs[0], eggs[1], eggs[2]);
		}
	
		printTotalEggs(turtles);
	}

	public static void printTotalEggs(SeaTurtle [] _a)
	{
		if(_a == null) {
			System.out.println("The total number of eggs in the file is: -1");
			return;
		}
		int total = 0;
		for(int i = 0; i < _a.length; i++) {
			if(_a[i] != null) {
				total += _a[i].getTotalNumberOfEggs();
			}
		}
		System.out.println("The total number of eggs in the file is: " + total);
	}

}


class TurtleInfo
{
	public String name = "";
	public int[] eggs = { 0, 0, 0 };

	// Parse the year to find an index for the egg array
	public int getIndex(int _whichYear)
	{
		// Use the last digit as the array index
		int lastDigit = _whichYear % 10;
		if (lastDigit >= 0 && lastDigit <= 3)
		{
			return lastDigit;
		}
		return -1;
	}
}

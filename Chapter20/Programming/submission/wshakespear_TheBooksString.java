import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class wshakespear_TheBooksString {

	//My recreation of Figure 20.2
	public static int hash(String key, int tableSize) {
		int hashVal = 0;
		
		for(int i = 0; i < key.length(); i++) {
			hashVal = 37 * hashVal + key.charAt(i);
		}

		hashVal %= tableSize;
		if(hashVal < 0) {
			hashVal += tableSize;
		}
		
		return hashVal;
	}
	
	
	public static void main(String[] args)
    {

        String dictionary = "onlineDictionary.txt";
        String outputName = "output.csv";

		String[] words = readFile(dictionary);
        int tableSize = words.length * 2;

        System.out.printf("Read %s | Contains %d lines | Table will be %d rows%n", dictionary, words.length, tableSize);

        int[] table = new int[tableSize];
        for (int i = 0; i < tableSize; i++) table[i] = 0;

        for (String word : words)
        {
            int wordHash = hash(word, tableSize);
            table[wordHash]++;
        }

        System.out.printf("Writing to file %s%n", outputName);

        writeFile(outputName, table);
	}


    public static void writeFile(String outputFilename, int[] table)
    {
        FileOutputStream output = null;
        BufferedOutputStream stream = null;
        
        try
        {
            output = new FileOutputStream(outputFilename);
            stream = new BufferedOutputStream(output);

            String outputData = "";

            int i = 0;
            for (int v : table)
            {
                // output |number, value\n
                outputData += (i) + ", " + (v * i++)  + "\n";
            }

            stream.write(outputData.getBytes());
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
			if (output != null) output.close();
			if (stream != null) stream.close();
		}
		catch (IOException e)
		{
			System.out.println("Error closing resources!");
			e.printStackTrace();
		}
    }



    public static String[] readFile(String filename)
    {
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

        return lines;
    }

}

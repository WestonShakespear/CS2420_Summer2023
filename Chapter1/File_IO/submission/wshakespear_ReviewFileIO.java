import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class ReviewFileIO {

	//I have listed this method first, because it needs to be working properly before my autograder can check the other methods
	//For auto-grading - each word should be on it's own line, and have a windows newline \r\n after it
	public static void writeWordsToNewFile(ArrayList<String> words, String outputFilename) {

		try 
		{
			FileOutputStream fileOutStream = new FileOutputStream(outputFilename);
			BufferedOutputStream bufferedOutStream = new BufferedOutputStream(fileOutStream);

			for (String s : words)
			{
				String output = String.format("%s\r\n", s);
				bufferedOutStream.write(output.getBytes());
			}
			bufferedOutStream.close();
			fileOutStream.close();
		}
		catch (IOException e)
		{
			System.err.println(e.getMessage());
		}
	}

	//This method should return null if the wordNumber is too large, or too small
	//This method should assume an array number style.  I.e. the first word is number 0
	public static String whatIsTheWord(String inputFilename, int wordNumber) {
		try
		{
			FileInputStream fileInput = new FileInputStream(inputFilename);
			BufferedInputStream inputStream = new BufferedInputStream(fileInput);

			String[] file = new String(inputStream.readAllBytes()).split(" ");

			inputStream.close();

			if (wordNumber >= 0 && wordNumber < file.length)
			{
				return file[wordNumber];
			}
			
		}
		catch (IOException e)
		{
			System.err.println(e);
		}
		return null;
	}

	//This method should look through the file and find words that are of appropriate size
	public static ArrayList<String> findWordsOfThisSize(String inputFilename, int wordSize) {
		ArrayList<String> words = new ArrayList<String>();
		
		ArrayList<String> file = JustReadFile(inputFilename);

		for (String word : file)
		{
			if (word.length() == wordSize)
				words.add(word);
		}

		return words;
	}

	public static ArrayList<String> JustReadFile(String inputFilename)
	{
		String[] file;
		ArrayList<String> ret = new ArrayList<>();

		try
		{
			FileInputStream fileInput = new FileInputStream(inputFilename);
			BufferedInputStream inputStream = new BufferedInputStream(fileInput);

			byte[] bytes = inputStream.readAllBytes();

			file = new String(bytes).split(" ");

			for (String splitSpace : file)
			{
				String[] splitNewline = splitSpace.split("\r\n");
				for (String split : splitNewline)
				{
					ret.add(split);
					System.out.println(split);
				}
			}

			inputStream.close();
		}
		catch (IOException e)
		{
			System.err.println(e);
			return null;
		}

		return ret;
	}

	//This method should look in the file represented by inputFilename, and return all the words matching the prefix and postfix
	public static ArrayList<String> findWords(String inputFilename, String prefix, String postfix){

		ArrayList<String> words = new ArrayList<String>();
		Scanner inputScanner = null;;

		try
		{
			File inputFile = new File(inputFilename);
			inputScanner = new Scanner(inputFile);

			while (inputScanner.hasNext())
			{
				String value = inputScanner.next();
				if (value.startsWith(prefix) && value.endsWith(postfix))
				{
					words.add(value);
				}
			}

		}
		catch (FileNotFoundException e)
		{
			System.err.println(e.getMessage());
		}
		finally
		{
			if (inputScanner != null)
			{
				inputScanner.close();
			}
		}

		return words;
	}

	
	
}

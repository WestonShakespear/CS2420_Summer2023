import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Struct;
import java.util.ArrayList;
import java.util.Random;

public class wshakespear_Assignment_02_34 {
    

    public static ArrayList<wshakespear_Entry> oldest(String filename, boolean single)
    {
        ArrayList<wshakespear_Entry> oldest = new ArrayList<>();

        int oldestAge = 0;

        ArrayList<wshakespear_Entry> entries = readFile(filename);

        // Loop through the entries to find the oldest
        for (wshakespear_Entry entry : entries)
        {
            // We found an older one
            if (entry.age > oldestAge)
            {
                oldest.clear();
                oldest.add(entry);
                oldestAge = entry.age;
            }
            // We found one just as old
            else if (entry.age == oldestAge)
            {
                oldest.add(entry);
            }
        }

        // Allows the method to work for part a and b
        if (oldest.size() != 1 && single)
        {
            Random rand = new Random();
            oldest.clear();
            oldest.add(entries.get(rand.nextInt(entries.size())));
            return oldest;
        }
        else
        {
            return oldest;
        }
    }

    public static ArrayList<wshakespear_Entry> readFile(String filename)
    {
        // This will be the list of entries in the file
        ArrayList<wshakespear_Entry> ret = new ArrayList<>();

        FileInputStream inputStream = null;
        BufferedInputStream input = null;

        try
        {
            inputStream = new FileInputStream(filename);
            input = new BufferedInputStream(inputStream);

            String data = new String(input.readAllBytes());

            String[] lines = data.split("\r\n");

            for (String line : lines)
            {
                // Split each line of the file and add as an entry
                String[] contents = line.split(" ");
                String name = String.format("%s %s", contents[0], contents[1]);
                int age = Integer.parseInt(contents[2]);

                ret.add(new wshakespear_Entry(name, age));

                //System.out.format("%s %d%n", name, age);
            }

            input.close();

        }
        catch (IOException e)
        {
            System.err.println(e.getMessage());
        }

        return ret;
    }



    public static void outputNames(ArrayList<wshakespear_Entry> oldest)
    {
        // Print some stars and then loop through
        // the oldest list and print
        System.out.println(starLine());
        for (wshakespear_Entry entry : oldest)
        {
            System.out.format("%4s-%20s :%d%n", "", entry.name, entry.age);
        }
        System.out.format("%s%n%n", starLine());
    }

    public static String starLine()
    {
        // draw a line of stars
        String stars = String.format("%20s", "");
        stars = stars.replace(" ", "*");
        return stars;
    }

    public static void main(String[] args)
    {
        String smallFile = "Assignment_02_34_small.txt";
        String largeFile = "Assignment_02_34_large.txt";

        System.out.println("Testing 2.34a for small file");
        outputNames(oldest(smallFile, true));
        System.out.println("Testing 2.34b for small file");
        outputNames(oldest(smallFile, false));

        System.out.println("Testing 2.34a for large file");
        outputNames(oldest(smallFile, true));
        System.out.println("Testing 2.34b for large file");
        outputNames(oldest(smallFile, false));
    }
}

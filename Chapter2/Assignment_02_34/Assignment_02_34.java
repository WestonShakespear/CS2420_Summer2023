import java.util.ArrayList;

public class Assignment_02_34 {
    

    public static ArrayList<String> oldestAny(String filename)
    {
        ArrayList<String> oldest = new ArrayList<>();

        oldest.add("first");
        oldest.add("second");

        return oldest;
    }

    public static ArrayList<String> oldest(String filename)
    {
        ArrayList<String> oldest = new ArrayList<>();

        oldest.add("first");
        oldest.add("second");

        return oldest;
    }


    public static void outputNames(ArrayList<String> oldest)
    {
        System.out.println(starLine());
        for (String name : oldest)
        {
            System.out.format("%4s-%s%n", "", name);
        }
        System.out.format("%s%n%n", starLine());
    }

    public static String starLine()
    {
        String stars = String.format("%20s", "");
        stars = stars.replace(" ", "*");
        return stars;
    }

    public static void main(String[] args)
    {
        String smallFile = "Assignment_02_34_small.txt";
        String largeFile = "Assignment_02_34_large.txt";

        System.out.println("Testing 2.34a for small file");
        outputNames(oldestAny(smallFile));
        System.out.println("Testing 2.34b for small file");
        outputNames(oldest(smallFile));

        // System.out.println("Testing 2.34a for large file");
        // outputNames(oldestAny(largeFile));
        // System.out.println("Testing 2.34b for large file");
        // outputNames(oldest(largeFile));
    }
}

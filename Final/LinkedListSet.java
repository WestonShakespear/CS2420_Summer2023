import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class LinkedListSet<AnyType extends Comparable<? super AnyType>> extends LinkedList<AnyType>
{
    public LinkedListSet()
    {

    }

    public LinkedListSet( AnyType[] list )
    {
        for ( AnyType entry : list)
        {
            this.insert(entry);
        }
    }

    public void insert( AnyType x, LinkedListIterator<AnyType> p )
    {
        this.insert(x);
    }

    public void insert( AnyType x )
    {
        LinkedListIterator<AnyType> prev = this.zeroth();
        LinkedListIterator<AnyType> current = this.first();

        while (current.isValid())
        {
            int comp = x.compareTo(current.retrieve());

            // This is a duplicate
            if (comp == 0) return;
            
            // We found the sorted position
            if (comp < 0) break;
            
            prev.advance();
            current.advance();
        }

        super.insert(x, prev);
    }


    public static <AnyType extends Comparable<? super AnyType>>
    LinkedListSet<AnyType> union( LinkedListSet<AnyType> a, LinkedListSet<AnyType> b)
    {
        LinkedListSet<AnyType> result = new LinkedListSet<>();

        LinkedListIterator<AnyType> iterator = a.first();
        while (iterator.isValid())
        {
            result.insert(iterator.retrieve());
            iterator.advance();
        }

        iterator = b.first();
        while (iterator.isValid())
        {
            result.insert(iterator.retrieve());
            iterator.advance();
        }

        return result;
    }


    public static <AnyType extends Comparable<? super AnyType>>
    LinkedListSet<AnyType> intersection( LinkedListSet<AnyType> a, LinkedListSet<AnyType> b)
    {
        LinkedListSet<AnyType> result = new LinkedListSet<>();

        LinkedListIterator<AnyType> iterator = a.first();
        while (iterator.isValid())
        {
            if (b.find(iterator.retrieve()).isValid())
            {
                result.insert(iterator.retrieve());
            }
            iterator.advance();
        }

        return result;
    }


    public static <AnyType extends Comparable<? super AnyType>>
    LinkedListSet<AnyType> difference( LinkedListSet<AnyType> a, LinkedListSet<AnyType> b)
    {
        LinkedListSet<AnyType> result = new LinkedListSet<>();

        LinkedListIterator<AnyType> iterator = a.first();
        while (iterator.isValid())
        {
            if (!b.find(iterator.retrieve()).isValid())
            {
                result.insert(iterator.retrieve());
            }
            iterator.advance();
        }

        return result;
    }

    public static <AnyType extends Comparable<? super AnyType>>
    int size( LinkedListSet<AnyType> a )
    {
        LinkedListIterator<AnyType> iterator = a.first();
        int size = 0;

        while (iterator.isValid())
        {
            size++;
            iterator.advance();
        }

        return size;
    }








    public static void basicTestOne()
    {
        LinkedListSet<Integer> setTestOne = new LinkedListSet<>();
    }

    public static void basicTestTwo()
    {
        String[] val = {"a", "b", "c", "d", "x", "y", "z", "w", "w", "w"};
        LinkedListSet<String> setTestTwo = new LinkedListSet<>( val );

        LinkedList.printList(setTestTwo);
        System.out.printf("The size of testSetTwo is %d%n", size(setTestTwo));
    }

    public static void testStaticFunctions()
    {
        String[] a = {"a", "b", "c"};
        String[] b = {"c", "d", "e"};

        System.out.println();
        System.out.println("Union");
        LinkedListSet<String> unionTestOne = new LinkedListSet<>(a);
        LinkedListSet<String> unionTestTwo = new LinkedListSet<>(b);

        System.out.print("Set A:     ");
        LinkedList.printList(unionTestOne);

        System.out.print("Set B:     ");
        LinkedList.printList(unionTestTwo);
        System.out.println();

        LinkedListSet<String> result = LinkedListSet.union(unionTestOne, unionTestTwo);
        
        System.out.print("Result: ");
        LinkedList.printList(result);

        System.out.println("---------------------------------");

        System.out.println();
        System.out.println("Intersection");
        LinkedListSet<String> intersectionTestOne = new LinkedListSet<>(a);
        LinkedListSet<String> intersectionTestTwo = new LinkedListSet<>(b);

        System.out.print("Set A:     ");
        LinkedList.printList(intersectionTestOne);

        System.out.print("Set B:     ");
        LinkedList.printList(intersectionTestTwo);
        System.out.println();

        result = LinkedListSet.intersection(intersectionTestOne, intersectionTestTwo);
        
        System.out.print("Result: ");
        LinkedList.printList(result);

        System.out.println("---------------------------------");

        System.out.println();
        System.out.println("Difference");
        LinkedListSet<String> differenceTestTwo = new LinkedListSet<>(b);
        LinkedListSet<String> differenceTestOne = new LinkedListSet<>(a);

        System.out.print("Set A:     ");
        LinkedList.printList(differenceTestOne);

        System.out.print("Set B:     ");
        LinkedList.printList(differenceTestTwo);
        System.out.println();

        result = LinkedListSet.difference(differenceTestOne, differenceTestTwo);
        
        System.out.print("Result: ");
        LinkedList.printList(result);

        System.out.println("---------------------------------");
    }


    public static void main(String[] args)
    {
        // basicTestTwo();
        // testStaticFunctions();

        LinkedListSet<String> A = new LinkedListSet<>();
        LinkedListSet<String> B = new LinkedListSet<>();
        LinkedListSet<String> C = new LinkedListSet<>();

        String[] words = readFile("Partial_Book.txt");

        for (String word : words)
        {
            int length = word.length();

            if (length <= 5)
            {
                A.insert(word);
            }
            if (length == 5)
            {
                B.insert(word);
            }
            if (length >= 5)
            {
                C.insert(word);
            }
        }

        System.out.printf(
            "The size of set A is %d%n" +
            "The size of set B is %d%n" +
            "The size of set C is %d%n%n%n",
            size(A), size(B), size(C));


        System.out.printf("Testing Union:%n%n");
        System.out.println("    |A U B|");
        testUnion(A, B);

        System.out.println("    |A U C|");
        testUnion(A, C);

        System.out.println("    |B U C|");
        testUnion(B, C);


        System.out.printf("Testing Intersection:%n%n");
        System.out.println("    |A n B|");
        testIntersection(A, B);

        System.out.println("    |A n C|");
        testIntersection(A, C);

        System.out.println("    |B n C|");
        testIntersection(B, C);


        System.out.printf("Testing Union:%n%n");
        System.out.println("    |A \\ B|");
        testDifference(A, B);

        System.out.println("    |B \\ A|");
        testDifference(B, A);


        System.out.println("    |A \\ C|");
        testDifference(A, C);

        System.out.println("    |C \\ A|");
        testDifference(C, A);


        System.out.println("    |B \\ C|");
        testUnion(B, C);

        System.out.println("    |C \\ B|");
        testDifference(C, B);

    }

    public static void testUnion(LinkedListSet<String> a, LinkedListSet<String> b)
    {
        LinkedListSet<String> result = union(a, b);
        
        listSize(a, b, result);
    }

    public static void testIntersection(LinkedListSet<String> a, LinkedListSet<String> b)
    {
        LinkedListSet<String> result = intersection(a, b);
        
        listSize(a, b, result);
    }

    public static void testDifference(LinkedListSet<String> a, LinkedListSet<String> b)
    {
        LinkedListSet<String> result = difference(a, b);
        
        listSize(a, b, result);
    }

    public static void listSize( 
        LinkedListSet<String> a,
        LinkedListSet<String> b,
        LinkedListSet<String> result)
    {
        System.out.printf(
            "        First Set Size:  %4d%n" +
            "        Second Set Size: %4d%n" +
            "        ---------------------%n" +
            "        Result Set Size: %4d%n%n",
            size(a), size(b), size(result));
    }








    public static String[] readFile(String filename)
    {
		FileInputStream input = null;
		BufferedInputStream stream = null;

		String[] lines = new String[500];
        String[] words = new String[1];

		// Try to read the file
		try
		{
			input = new FileInputStream(filename);
			stream = new BufferedInputStream(input);

			lines = new String( stream.readAllBytes() )
											.split(System.lineSeparator());

            ArrayList<String> wordsA = new ArrayList<>();

            for (String line : lines)
            {
                for (String word : line.split(" "))
                {
                    wordsA.add(word);
                }
            }

            words = new String[wordsA.size()];
            for (int i = 0; i < words.length; i++)
            {
                words[i] = wordsA.get(i).replaceAll("[\\W_]", "");
            }
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

        return words;
    }
}

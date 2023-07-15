import java.util.ArrayList;

public class Lecture {

    final static int MOD = (int) 20;

    public static void main(String[] args)
    {
        // System.out.println("Generate a random array");
        // int[] array1 = generateRandomArray(12);

        // for (int a = 0; a < array1.length; a++)        
        // {
        //     System.out.printf("|%-4d:%12d|", a, array1[a]);

        //     if ((a + 1) % 4 == 0)
        //     {
        //         System.out.println();
        //     }
        // }
        // System.out.println();

        // System.out.println("Method findMinimumItem with runtime of O(N)");
        // System.out.printf("The minimum is: %s%n", findMinimumItem(array1));


        // System.out.println("Finding the closest pairs");

        int numberPairs = 6;
        int[] x = generateRandomArray(numberPairs);
        int[] y = generateRandomArray(numberPairs);


        System.out.println("Randomly generated pairs of numbers:");
        for (int a = 0; a < numberPairs; a++)        
        {
            System.out.printf("|%-4d:  (%4d,%4d)  |", a, x[a], y[a]);

            if ((a + 1) % 4 == 0)
            {
                System.out.println();
            }
        }
        System.out.printf("%n%n");


        // int[] closest = findClosestPoints(x, y);
        // String format = "The closest pair is: |%-4d:  (%4d,%4d)  | and |%-4d:  (%4d,%4d)  |%n%n";
        // System.out.printf(
        //     format,
        //     closest[0],
        //     x[closest[0]],
        //     y[closest[0]],
        //     closest[1],
        //     x[closest[1]],
        //     y[closest[1]]
        // );

        System.out.println("Checking for colinear points");

        ArrayList<Integer> colinear = findColinearPoints(x, y);


    }

    public static ArrayList<Integer> findColinearPoints(int[] _x, int[] _y)
    {
        ArrayList<Integer> list = new ArrayList<>();

        int pairs = 0;
        // This should be N(N-1)(N-2)*(1/6)

        for (int termA = 0; termA < _x.length; termA++)
        {
            for (int termB = termA + 1; termB < _x.length; termB++)
            {
                for (int termC = termB + 1; termC < _x.length; termC++)
                {
                    System.out.printf("|%-4d:  (%4d,%4d,%4d)  |   colinear(%d)%n", pairs, termA, termB, termC, 0);

                    pairs++;
                }
            }
        }

        System.out.println(pairs);

        return list;
    }

    public static int[] findClosestPoints(int[] _x, int[] _y)
    {
        int[] pair = new int[2];

        int pairs = 0;
        // This should be N(N-1)(1/2)
        int minimum = Integer.MAX_VALUE;

        System.out.println("Finding length between pairs:");
        for (int outer = 0; outer < _x.length; outer++)
        {
            for (int inner = outer + 1; inner < _x.length; inner++)
            {
                
                int x1 = _x[outer];
                int y1 = _y[outer];
                int x2 = _x[inner];
                int y2 = _y[inner];

                int distance = ((x2 - x1) * (x2 - x1));
                distance +=    ((y2 - y1) * (y2 - y1));

                if (distance < minimum)
                {
                    minimum = distance;
                    pair[0] = outer;
                    pair[1] = inner;
                }

                System.out.printf("|%-4d:  (%4d,%4d)  |    distance root(%d)%n", pairs, outer, inner, distance);

                pairs++;
            }
        }
        System.out.printf("%n%n");

        return pair;
    }




    public static int findMinimumItem(int[] _array)
    {
        int minimum = _array[0];

        for (int index = 0; index < _array.length; index++)
        {
            if (_array[index] < minimum)
            {
                minimum = _array[index];
            }
        }

        return minimum;
    }

    public static int[] generateRandomArray(int _length)
    {
        int[] array = new int[_length];

        for (int index = 0; index < _length; index++)
        {
            array[index] = (int)(Math.random()*MOD);
        }
        return array;
    }
    
}

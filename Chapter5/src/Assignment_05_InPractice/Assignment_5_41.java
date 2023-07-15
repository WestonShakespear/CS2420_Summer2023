public class Assignment_5_41 {
    

    final static int MIN = 1;
    final static int MAX = 75;
    final static String WOAH_LONG_FORMAT = "|Found on loop %-4d:%n" +
                                           "( %-2d<  %-2d<=  %-2d<=  %-2d<=  %-2d<=  %-2d<=  %-2d<=  %-2d)%n" +
                                           "( %-2d^5 + %-2d^5 + %-2d^5 + %-2d^5 +  %-2d^5 = %-2d^5)%n";

    public static void main(String[] args)
    {
        findSolution();
    }

    public static long[] calculateNumbers()
    {
        long[] powers = new long[MAX - MIN + 2];
        for (int number = MIN; number <= MAX; number++)
        {
            powers[number] = (long) Math.pow(number, 5);
        }
        return powers;
    }


    public static void findSolution()
    {
        // Get powers and setup intial term values;
        long[] powers = calculateNumbers();
        int termA = 0;
        int termB = 0;
        int termC = 0;
        int termD = 0;
        int termE = 0;
        int termF = 0;
        int pairs = 0;
        // This will be triggered upon finding the solution
        boolean evaluatesTrue = false;

        // Loop for each term
        for (termA = MIN; termA < MAX; termA++)
        {
            for (termB = termA; termB < MAX; termB++)
            {
                for (termC = termB; termC < MAX; termC++)
                {
                    for (termD = termC; termD < MAX; termD++)
                    {
                        for (termE = termD; termE < MAX; termE++)
                        {
                            for (termF = termE; termF < MAX; termF++)
                            {   
                                // Test the terms
                                if (powers[termA] + powers[termB] + powers[termC] + powers[termD] + powers[termE] == powers[termF])
                                {
                                    evaluatesTrue = true;
                                }
                                pairs++;
                            }
                            if (evaluatesTrue) break;
                        }
                        if (evaluatesTrue) break;
                    }
                    if (evaluatesTrue) break;
                }
                if (evaluatesTrue) break;
            }
            if (evaluatesTrue) break;            
        }

        System.out.printf(WOAH_LONG_FORMAT, pairs,
            MIN - 1, termA, termB, termC, termD, termE, termF, MAX,
            termA, termB, termC, termD, termE, termF        
        );
    }


}

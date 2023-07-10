import timekeeper.extended.*;

public class MyTester {
    
    public static void main(String[] args)
    {

        runTestB();

            
    }


    public static void runTestA()
    {
        AlgorithmAnalysis test = new AlgorithmAnalysis(10, 41, 20);
        System.out.printf("TestA: Running tests on:%n%s%n", test.getSizes());

        test.timeMethodThatNeedsAnIntArray(new TestA());

        System.out.printf(
			"Trials CSV: %n%s%n%s%n", 
			"Trial,input size,mean time,median time", 
			test.displayOutput(true, true));
    }

    public static void runTestB()
    {
        int[] testBnumbers = { 17, 19, 23, 29, 557, 557, 571, 733, 751, 787, 839, 859, 947,
            21701, 22567, 23029, 23753, 25183, 25819, 29059, 29717, 29959, 30941,
            644747, 689771, 709211, 739397, 761597, 835421, 836821, 849217, 980197,
            1031911, 17439619, 19039649, 22757599, 25169929, 26157629, 27128587, 27746501,
            28065949, 30449383, 31941199, 581858957, 626997347, 632987779, 637998443,
            681242959, 764474197, 912945239, 937648541, 1005534659, 1066464323 };
    
    
            AlgorithmAnalysis test = new AlgorithmAnalysis(testBnumbers, 100);
            System.out.printf("TestB: Running tests on:%n%s%n", test.getSizes());
    
            test.timeMethodThatNeedsAnInt(new TestB());

            System.out.printf(
			"Trials CSV: %n%s%n%s%n", 
			"Trial,input size,mean time,median time", 
			test.displayOutput(true, false));
    }

    public static void runTestC()
    {
        AlgorithmAnalysis test = new AlgorithmAnalysis(2, 50, 100);
        System.out.printf("TestC: Running tests on:%n%s%n", test.getSizes());

        test.timeMethodThatNeedsAnInt(new TestC());
    }
}





class TestA implements FunctorArray
{
    @Override
    public void runThisFuctionThatNeedsAnIntArray(int[] a)
    {
        Assignment.doesTheArrayMeetCriteria_5_30(a);
    }

    @Override
    public int[] generateIntArrayFromInt(int a)
    {
        return BigOhTester.generateSortedArray(a);
    }
}

class TestB implements Functor
{
    @Override
    public void runThisFuctionThatNeedsAnInt(int a)
    {
        Assignment.isAPrime(a);
    }
}


class TestC implements Functor
{
    @Override
    public void runThisFuctionThatNeedsAnInt(int a)
    {
        int[] testArray = BigOhTester.generateMajorityElement(a);
        Assignment.majorityElement(testArray);
    }
}

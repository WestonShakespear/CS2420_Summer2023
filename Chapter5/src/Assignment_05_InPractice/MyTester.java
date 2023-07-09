import timekeeper.extended.*;

public class MyTester {
    
    public static void main(String[] args)
    {

        runTestA();

            
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
        int[] testBnumbers = {17, 19, 23, 29,
            557, 809, 751, 787, 947, 839, 571, 859, 557, 733,
            25819, 21701, 29959, 25183, 23753, 29059, 30941, 23029, 22567, 29717,
            644747, 835421, 836821, 709211, 689771, 1031911, 980197, 849217, 739397, 761597,
            26157629, 19039649, 25169929, 30449383, 28065949, 31941199, 17439619, 27746501, 27128587, 22757599,
            1066464323, 632987779, 637998443, 764474197, 1005534659, 681242959, 937648541, 581858957, 626997347, 912945239};
    
    
            AlgorithmAnalysis test = new AlgorithmAnalysis(testBnumbers, 1);
            System.out.printf("TestB: Running tests on:%n%s%n", test.getSizes());
    
            test.timeMethodThatNeedsAnInt(new TestB());
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

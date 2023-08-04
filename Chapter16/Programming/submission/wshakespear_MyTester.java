public class wshakespear_MyTester {
    
    public static void main(String[] args)
    {
        int[] set = {100, (100+1000)/2, 1000, (1000 + 10000)/2, 10000, (10000 + 100000)/2, 100000, (100000 + 1000000)/2, 1000000};
        
        
        
        wshakespear_AlgorithmAnalysis test = new wshakespear_AlgorithmAnalysis(set,  20);
        System.out.printf("TestA: Running tests on:%n%s%n", test.getSizes());

        test.timeMethodThatNeedsAnInt(new TestA());

        System.out.printf(
			"Trials CSV: %n%s%n%s%n", 
			"Trial,input size,mean time,median time", 
			test.displayOutput(true, true));



        test = new wshakespear_AlgorithmAnalysis(set,  20);
        System.out.printf("TestB: Running tests on:%n%s%n", test.getSizes());

        test.timeMethodThatNeedsAnInt(new TestB());

        System.out.printf(
			"Trials CSV: %n%s%n%s%n", 
			"Trial,input size,mean time,median time", 
			test.displayOutput(true, true));


        test = new wshakespear_AlgorithmAnalysis(set,  20);
        System.out.printf("TestC: Running tests on:%n%s%n", test.getSizes());

        test.timeMethodThatNeedsAnInt(new TestC());

        System.out.printf(
			"Trials CSV: %n%s%n%s%n", 
			"Trial,input size,mean time,median time", 
			test.displayOutput(true, true));


        test = new wshakespear_AlgorithmAnalysis(set,  20);
        System.out.printf("TestD: Running tests on:%n%s%n", test.getSizes());

        test.timeMethodThatNeedsAnInt(new TestD());

        System.out.printf(
			"Trials CSV: %n%s%n%s%n", 
			"Trial,input size,mean time,median time", 
			test.displayOutput(true, true));
            
    }

    
}





class TestA implements wshakespear_Functor
{
    @Override
    public void runThisFuctionThatNeedsAnInt(int a)
    {
        wshakespear_Assignment.testRandomDataAddArrayStack(a, new wshakespear_ArrayStack<>());
    }
}

class TestB implements wshakespear_Functor
{
    @Override
    public void runThisFuctionThatNeedsAnInt(int a)
    {
        wshakespear_Assignment.testRandomDataAddArrayQueue(a, new wshakespear_ArrayQueue<>());
    }
}

class TestC implements wshakespear_Functor
{
    @Override
    public void runThisFuctionThatNeedsAnInt(int a)
    {
        wshakespear_Assignment.testRandomDataAddListStack(a, new wshakespear_ListStack<>());
    }
}

class TestD implements wshakespear_Functor
{
    @Override
    public void runThisFuctionThatNeedsAnInt(int a)
    {
        wshakespear_Assignment.testRandomDataAddListQueue(a, new wshakespear_ListQueue<>());
    }
}
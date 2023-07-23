class Lecture
{

   

    public static int sum(int n)
    {
        if (n == 1)
            return 1;
        else
            return n + sum(n - 1);
    }


    public static void digitByDigit(int n)
    {
        if (n == 0)
        {
            return ;
        }
            else
        {
            int b = n;
            digitByDigit((n - (n %10)) / 10);
            System.out.printf("%d..", b % 10);
        }
    }

    public static int fib(int n)
    {
        if (n == 0 || n == 1)
        {
            return 1;
        }
            

        //System.out.printf("Given %d find fib(%d) and fib(%d)%n", n, n-2, n-1);
        loopCounter+=2;
        return fib(n - 2) + fib(n - 1);
    }





    public static void main(String[] args)
    {
        int num = 1;
        int val = sum(num);
        System.out.printf("The sum of %d is %d%n", num, val);

        num = 3 ;
        val = sum(num);
        System.out.printf("The sum of %d is %d%n", num, val);

        num = 31415 ;
        digitByDigit(num);
        System.out.println();

        num = 3 ;
        val = fib(num);
        System.out.printf("The fibonacci value of %d is %d: made in %d branches%n", num, val, loopCounter);

        num = 5 ;
        loopCounter = 0;
        val = fib(num);
        System.out.printf("The fibonacci value of %d is %d: made in %d branches%n", num, val, loopCounter);
    }

    private static int loopCounter = 0;


}
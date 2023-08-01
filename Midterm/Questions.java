public class Questions
{
    public static void main(String[] args)
    {
        System.out.println("test");

        int x = 0; 
        foo(x);
        System.out.println(x);


        x = 5;
        int y = 7;
        System.out.println(x + ' ' + y + " " + x);

        findMax(new Integer[100]);


        int a = 1;
        int b = ++a + a++;
        System.out.println(b);
        System.out.println(a);
        a += b;
        System.out.println("" + ++a);
    }

    public static void foo(int x)
    {
        x = 5;
    }


    public static <AnyType extends Comparable> AnyType findMax(AnyType[] a)
    {
        return a[0];
    }

}
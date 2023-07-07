public class Tables
{ 
    public static void main(String[] args)
    {
        AssignValue addition = (a, b) -> a + b;
        AssignValue multiplication = (a, b) -> a * b;

        System.out.println("Addition Table");
        CreateTable(addition);

        System.out.println("Multiplication Table");
        CreateTable(multiplication);
    }

    private static void CreateTable(AssignValue operator)
    {
        MakeRow();
        MakeDigits();
        MakeRow();
        
        
        for (int y = 0; y < 10; y++)
        {
            System.out.format("%-4d|", y);
            for (int x = 0; x < 10; x++)
            {
                System.out.format("%5d", operator.op(x, y));
            }
            System.out.println();
            MakeRow();
        }
    }


    
    private static void MakeDigits()
    {
        System.out.print("    |");
        for (int i = 0; i < 10; i++)
        {
            System.out.format("%-4d|", i);
        }
        System.out.println();
    }


    private static void MakeRow()
    {
        for (int i = 0; i < 11; i++)
        {
            System.out.format("-----", i);
        }
        System.out.println();
    }

    public interface AssignValue {
        public int op(int a, int b);
    }
}

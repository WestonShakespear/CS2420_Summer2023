class BasicMemoryCell<Type extends Comparable<? super Type>> implements Comparable<BasicMemoryCell<Type>>
{

    private Type stored;

    public Type read()
    {
        return this.stored;
    }

    public void write(Type write)
    {
        this.stored = write;
    }

    @Override
    public int compareTo(BasicMemoryCell<Type> in)
    {
        return this.stored.compareTo(in.stored);
    }







    public static void main(String[] args)
    {
        BasicMemoryCell<Integer> first = new BasicMemoryCell<>();
        first.write(5);

        System.out.printf("First is %s and is of the type: %s%n", first.read(), first.stored.getClass());


        BasicMemoryCell<String> sec = new BasicMemoryCell<>();
        sec.write("Hello World");

        System.out.printf("Second is %s and is of the type: %s%n", sec.read(), sec.stored.getClass());

        BasicMemoryCell<Integer> third = new BasicMemoryCell<>();
        third.write(3);

        int val = first.compareTo(third);

        String diff = "the same";

        if (val < 0)
        {
            diff = "larger";
        }
        else if (val > 0)
        {
            diff = "smaller";
        }

        System.out.printf("The first number is %s the second%n", diff);
        
    }


}
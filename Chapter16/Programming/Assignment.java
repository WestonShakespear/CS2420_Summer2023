import java.util.concurrent.ThreadLocalRandom;

public class Assignment 
{

    
    public static void testRandomDataAddArrayStack( int size, ArrayStack<Integer> stack)
    {
        for (int i = 0; i < size; i++)
            stack.push(ThreadLocalRandom.current().nextInt(100));

        for (int i = 0; i < size; i++) stack.pop();
    }


    public static void testRandomDataAddArrayQueue( int size, ArrayQueue<Integer> queue)
    {
        for (int i = 0; i < size; i++)
            queue.enqueue(ThreadLocalRandom.current().nextInt(100));

        for (int i = 0; i < size; i++) queue.dequeue();


    }


    public static void testRandomDataAddListStack( int size, ListStack<Integer> stack )
    {
        for (int i = 0; i < size; i++)
            stack.push(ThreadLocalRandom.current().nextInt(100));

        for (int i = 0; i < size; i++) stack.pop();

    }


    public static void testRandomDataAddListQueue( int size, ListQueue<Integer> queue )
    {
        for (int i = 0; i < size; i++)
            queue.enqueue(ThreadLocalRandom.current().nextInt(100));

        for (int i = 0; i < size; i++) queue.dequeue();

    }



    public static void main(String[] args)
    {
        System.out.println("Testing arraystack");
        testRandomDataAddArrayStack(5, new ArrayStack<>());

        System.out.println("Testing arrayqueue");
        testRandomDataAddArrayQueue(5, new ArrayQueue<>());

        System.out.println("Testing liststack");
        testRandomDataAddListStack(5, new ListStack<>());

        System.out.println("Testing listqueue");
        testRandomDataAddListQueue(5, new ListQueue<>());

        
    }
}

import java.util.concurrent.ThreadLocalRandom;

public class wshakespear_Assignment 
{

    
    public static void testRandomDataAddArrayStack( int size, wshakespear_ArrayStack<Integer> stack)
    {
        for (int i = 0; i < size; i++)
            stack.push(ThreadLocalRandom.current().nextInt(100));

        for (int i = 0; i < size; i++) stack.pop();
    }


    public static void testRandomDataAddArrayQueue( int size, wshakespear_ArrayQueue<Integer> queue)
    {
        for (int i = 0; i < size; i++)
            queue.enqueue(ThreadLocalRandom.current().nextInt(100));

        for (int i = 0; i < size; i++) queue.dequeue();


    }


    public static void testRandomDataAddListStack( int size, wshakespear_ListStack<Integer> stack )
    {
        for (int i = 0; i < size; i++)
            stack.push(ThreadLocalRandom.current().nextInt(100));

        for (int i = 0; i < size; i++) stack.pop();

    }


    public static void testRandomDataAddListQueue( int size, wshakespear_ListQueue<Integer> queue )
    {
        for (int i = 0; i < size; i++)
            queue.enqueue(ThreadLocalRandom.current().nextInt(100));

        for (int i = 0; i < size; i++) queue.dequeue();

    }



    public static void main(String[] args)
    {
        System.out.println("Testing arraystack");
        testRandomDataAddArrayStack(5, new wshakespear_ArrayStack<>());

        System.out.println("Testing arrayqueue");
        testRandomDataAddArrayQueue(5, new wshakespear_ArrayQueue<>());

        System.out.println("Testing liststack");
        testRandomDataAddListStack(5, new wshakespear_ListStack<>());

        System.out.println("Testing listqueue");
        testRandomDataAddListQueue(5, new wshakespear_ListQueue<>());

        
    }
}

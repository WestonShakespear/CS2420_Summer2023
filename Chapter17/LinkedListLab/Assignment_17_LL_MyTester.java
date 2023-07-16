public class Assignment_17_LL_MyTester {
    

    public static void main(String [] args)
    {
        // Node<String> n = new Node<String>();
        // n.setItem("Computers");

        // Node<String> next = new Node<String>();
        // next.setItem("are");
        // n.setNextNode(next);





        // System.out.printf("'%s'%n", n.toString());

        LinkedList<String> a = new LinkedList<String>();

        System.out.println(a.isEmpty());
        System.out.printf("'%s'%n", a.toString());

        a.insertFront("3");
        a.insertFront("2");

        System.out.printf("The size is: %d%n", LinkedList.listSize(a));
        a.insertFront("1");
        System.out.printf("The size is: %d%n", LinkedList.listSize(a));



        System.out.println(a.isEmpty());
        System.out.printf("'%s'%n'", a.toString());

        Node<String> found = a.find("2");
        System.out.printf(
            "Trying to find '2': contains '%s'%n",
            found
        );

        Node<String> found2 = a.find("22");
        if (found2 == null)
        {
            System.out.println("it didn't find the object: good");;
        }

        System.out.println("try to remove '2'");

        a.remove("2");
        System.out.printf("'%s'%n'", a.toString());


    }
}

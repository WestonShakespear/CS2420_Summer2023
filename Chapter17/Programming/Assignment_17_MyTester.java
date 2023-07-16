public class Assignment_17_MyTester {
    

    public static void main(String [] args)
    {
        LinkedList<String> a = new LinkedList<String>();
        a.insertFront("3");
        a.insertFront("2");
        a.insertEnd("4");
        a.insertFront("1");
        a.insertEnd("5");
        a.insertFront("3");
        a.insertFront("2");
        a.insertEnd("4");
        a.insertFront("1");
        a.insertEnd("5");
        System.out.printf("    '%s'%n", a.toString());


        System.out.println("Remove all '1'");
        a.removeAll("1");
        System.out.printf("    '%s'%n", a.toString());

        System.out.println("Remove last '2'");
        a.removeLast("2");
        System.out.printf("    '%s'%n", a.toString());


        LinkedList<String> b = new LinkedList<String>();
        b.insertEnd("weston");
        b.insertEnd("ryan");
        b.insertEnd("shakespear");
        b.insertEnd("programs");

        System.out.printf("    '%s'%n", b.toString());

        Node<String> firstPrevious = b.previous("shakespear");

        System.out.printf("    '%s'%n", firstPrevious.toString());


        b.findAndMoveToFront("programs");
        System.out.printf("    '%s'%n", b.toString());
        




        // System.out.println(a.isEmpty());
        // System.out.printf("'%s'%n", a.toString());

        // a.insertFront("3");
        // a.insertFront("2");

        // System.out.printf("The size is: %d%n", LinkedList.listSize(a));
        // a.insertFront("1");
        // System.out.printf("The size is: %d%n", LinkedList.listSize(a));



        // System.out.println(a.isEmpty());
        // System.out.printf("'%s'%n'", a.toString());

        // Node<String> found = a.find("2");
        // System.out.printf(
        //     "Trying to find '2': contains '%s'%n",
        //     found
        // );

        // Node<String> found2 = a.find("22");
        // if (found2 == null)
        // {
        //     System.out.println("it didn't find the object: good");;
        // }

        // System.out.println("try to remove '2'");

        // a.remove("2");
        // System.out.printf("'%s'%n'", a.toString());


    }
}

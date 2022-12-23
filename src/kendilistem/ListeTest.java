package kendilistem;

public class ListeTest {
    public static void main(String[] args) {
        MyList<Integer> l= new MyList<>(Integer.class,2);
        MyList<String> ll= new MyList<>(String.class);
        l.add(5);
        l.add(22);
        l.add(23);
        System.out.println("Array="+l.toString());
        System.out.println("Array Size="+l.size());
        System.out.println("Array Capacity="+l.getCapacity());
        System.out.println("==================================");
        l.add(22);
        l.add(23);
        System.out.println("Array="+l.toString());
        System.out.println("Array Size="+l.size());
        System.out.println("Array Capacity="+l.getCapacity());
        System.out.println("==================================");
        System.out.println("Array="+ll.getClass().getSimpleName()+ " ="+ll.toString());
        System.out.println("Array Size="+ll.size());
        System.out.println("Array Capacity="+ll.getCapacity());
    }
}

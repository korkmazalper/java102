package kendilistem;

public class ListeTest {
    public static void main(String[] args) {
        MyList<Integer> l= new MyList<>(2);
        MyList<String> ll= new MyList<>();
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
        for (int i = 0; i <5 ; i++) {
            ll.add("patika");
            ll.add("dev");
        }

        System.out.println("==================================");
        System.out.println("Array="+ll.getClass().getSimpleName()+ " ="+ll.toString());
        System.out.println("Array Size="+ll.size());
        System.out.println("Array Capacity="+ll.getCapacity());
        ll.add("patika");
        ll.add("dev");

        System.out.println("==================================");
        System.out.println("Array="+ll.getClass().getSimpleName()+ " ="+ll.toString());
        System.out.println("Array Size="+ll.size());
        System.out.println("Array Capacity="+ll.getCapacity());
    }
}

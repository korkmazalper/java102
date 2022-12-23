package kendilistem;

public class ListeTest {
    public static void main(String[] args) {
        MyList<Integer> l= new MyList<>(2);
        MyList<String> ll= new MyList<>();
        l.add(5);
        l.add(21);
        l.add(22);
        System.out.println("Array="+l.toString());
        System.out.println("Array Size="+l.size());
        System.out.println("Array Capacity="+l.getCapacity());
        System.out.println("==================================");
        l.add(23);
        l.add(24);
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
        System.out.println("===================================");
        l.remove(2);
        System.out.println(l.toString());
        System.out.println("==============================");
        l.set(2,100);
        System.out.println(l.toString());
        l.set(2,24);
        System.out.println("5 nerede="+l.indexOf(5));
        System.out.println("12 nerede="+l.indexOf(12));
        System.out.println("=====================");
        System.out.println(l.toString());
        System.out.println("First index="+l.indexOf(24));
        System.out.println("Last index ="+l.lastIndexOf(24));
        System.out.println("===========================");


        MyList<Double> d= new MyList<>();
        System.out.println("l listesi="+l.toString());
        System.out.println("d listesi="+d.toString());
        System.out.println("l listesi bosmu="+l.isEmpty());
        System.out.println("d listesi bosmu="+d.isEmpty());


        System.out.println("===================================");
        System.out.println("Sublist="+l.subList(1,3));
    }
}

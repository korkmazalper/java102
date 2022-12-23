package kendilistem;

public class ListeTest {
    public static void main(String[] args) {
        MyList<Integer> l= new MyList<>(Integer.class);
        System.out.println(l.toString());
        System.out.println(l.size());
        l.add(5);
        l.add(5);
        l.add(5);
        l.add(5);
        l.add(5);
        l.add(5);
        l.add(5);
        l.add(5);
        l.add(5);
        l.add(10);
        l.add(10);
        System.out.println(l.toString());
        System.out.println(l.size());
    }
}

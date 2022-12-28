package collections;

import java.util.Collection;
import java.util.LinkedHashSet;

public class LinkedSetSample {
    public static void main(String[] args) {
        LinkedHashSet<String> h= new LinkedHashSet<>();
        h.add("");
        h.add(null);
        h.add("10");
        h.add("10");
        h.add("20");
        h.add("30");
        h.add("40");
        System.out.println(h.toString());
        System.out.println(h.size());
        System.out.println(h.isEmpty());
        System.out.println(h.remove("5"));
        System.out.println(h.hashCode());
        System.out.println(h.contains("a"));
        Collection<String> a= new LinkedHashSet<>();
        a.add("x");
        a.add("b");
        System.out.println(h.addAll(a));
        System.out.println(h);
        h.clear();
        System.out.println(h);
        System.out.println(h.parallelStream());
    }
}

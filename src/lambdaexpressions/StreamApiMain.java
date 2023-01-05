package lambdaexpressions;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiMain {
    public static void main(String[] args) {
        List<Integer> liste= new ArrayList<>();
        liste.add(22);
        liste.add(29);
        liste.add(1);
        liste.add(99);
        liste.add(67);
        liste.add(87);
        liste.add(45);
        liste.add(43);
        liste.add(56);
        liste.forEach(x-> System.out.println(x));
        System.out.println("===========================");
        liste.stream().filter(x->x>50).forEach(x-> System.out.print(x+ " ") );
        System.out.println("\n"+liste.stream().count());

        liste.stream().map(x->x*x).forEach(x->System.out.println(x));
        System.out.println("=======================================");
        liste.stream().map(x->3*x).forEach(x->System.out.println(x));
        System.out.println("==============================");
        liste.stream().limit(4).forEach(x-> System.out.println(x));
        HashSet<Integer> h= new HashSet<>();
        h.add(2);
        h.add(34);
        System.out.println("==================================");
        System.out.println(h.stream()
                .mapToDouble(x->x)
                .summaryStatistics()
                .getMin());

    }
}

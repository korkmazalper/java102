package priorityqueue;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueSample {
    public static void main(String[] args) {
        PriorityQueue<String> pq= new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        }.reversed());

        pq.add("selam");
        pq.add("selma");
        pq.add("cake");
        pq.add("kosher");
        System.out.println(pq);
        Iterator<String> iter= pq.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}

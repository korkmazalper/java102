package threadSamples;

import java.util.ArrayList;
import java.util.List;

public class OrderMaticMain {
    public static void main(String[] args) throws InterruptedException {
        OrderMatic oMatic=new OrderMatic();
        List<Thread> simutaneousThreads= new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            Thread t= new Thread(oMatic);
            simutaneousThreads.add(t);
            t.start();
        }
        for (Thread t: simutaneousThreads  ) {
            t.join();
        }
        System.out.println(oMatic.getOrderNo());
    }

}

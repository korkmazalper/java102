package threadSamples;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolingMain {
    public static void main(String[] args) throws InterruptedException {
        OrderMatic orderMatic= new OrderMatic();
        ExecutorService pool= Executors.newFixedThreadPool(10);
        for (int i = 0; i <100 ; i++) {
            pool.execute(orderMatic);
        }

        System.out.println(orderMatic.getOrderNo());
        System.out.println("Pool will be closed.");

        pool.shutdown();
    }
}

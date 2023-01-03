package threadSamples;

public class OrderMatic implements Runnable {
    private int orderNo;
    private final Object LOCK = new Object();
    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        increaseOrderNo();
    }

    private synchronized void increaseOrderNo() {
        this.orderNo++;
        System.out.println(Thread.currentThread().getName() +  " - Order No -->"+ this.orderNo);
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }
}

package threadSamples;

import static java.lang.Thread.sleep;

public class Counter2 implements Runnable{
    String name;
    int sleepTime;


    @Override
    public void run() {
        System.out.println("Beginning of Counter ! --> " + this.name);
        for (int i = 0; i <100 ; i++) {
            System.out.println(this.name + " counts :" + i);
            try {
                sleep(500L*this.sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    public Counter2(String name, int sleepTime) {
        this.name = name;
        this.sleepTime= sleepTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

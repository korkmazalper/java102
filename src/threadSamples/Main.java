package threadSamples;

public class Main
{
    public static void main(String[] args) {
        Counter c1=new Counter();
        Counter c2=new Counter();
        //c1.start();
        //c2.start();
        Counter2 c3=new Counter2("sayac 3",1);
        Counter2 c4=new Counter2("sayac 4",2);
        Counter2 c5=new Counter2("sayac 5",3);
        //c3.run();
        //c4.run();
        Thread t1= new Thread(c3);
        Thread t2= new Thread(c4);
        Thread t3= new Thread(c5);
        t1.start();
        t2.start();
        t3.start();
    }
}

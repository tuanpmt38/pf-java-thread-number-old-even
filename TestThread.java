import thread.EvenThread;
import thread.OldThread;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {

        OldThread ot = new OldThread("Thread 1");
        EvenThread et = new EvenThread("Thread 2");
        ot.start();
        ot.join();
        et.start();
        System.out.println("Main Thread Finished");
    }
}

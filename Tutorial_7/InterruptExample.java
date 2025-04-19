class SleepingThread extends Thread {
    public void run() {
        try {
            System.out.println("Thread sleeping...");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted!");
        }
    }
}

public class InterruptExample {
    public static void main(String[] args) {
        SleepingThread t1 = new SleepingThread();
        t1.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t1.interrupt();
    }
}
class PrintNumbers implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}

public class MultiThreadNumbers {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrintNumbers(), "Thread 1");
        Thread t2 = new Thread(new PrintNumbers(), "Thread 2");

        t1.start();
        t2.start();
    }
}
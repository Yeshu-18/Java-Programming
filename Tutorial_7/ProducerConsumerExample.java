import java.util.LinkedList;
import java.util.Queue;

class ProducerConsumer {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int LIMIT = 5;

    public synchronized void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            while (queue.size() == LIMIT) {
                wait();
            }
            queue.add(value);
            System.out.println("Produced: " + value);
            value++;
            notify();
            Thread.sleep(1000);
        }
    }

    public synchronized void consume() throws InterruptedException {
        while (true) {
            while (queue.isEmpty()) {
                wait();
            }
            int value = queue.poll();
            System.out.println("Consumed: " + value);
            notify();
            Thread.sleep(1000);
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        Thread producerThread = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
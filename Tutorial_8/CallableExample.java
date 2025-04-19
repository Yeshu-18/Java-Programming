import java.util.concurrent.*;

class SumTask implements Callable<Integer> {
    private int a, b;

    public SumTask(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Integer call() {
        return a + b;
    }
}

public class CallableExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new SumTask(5, 10));

        try {
            System.out.println("Sum: " + future.get()); // Retrieves the result
        } catch (Exception e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}
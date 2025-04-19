import java.util.concurrent.*;

class SumNaturalNumbers implements Callable<Integer> {
    private int n;

    public SumNaturalNumbers(int n) {
        this.n = n;
    }

    public Integer call() {
        return n * (n + 1) / 2; // Formula for sum of first N natural numbers
    }
}

public class SumNExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(new SumNaturalNumbers(100));

        try {
            System.out.println("Sum of first 100 natural numbers: " + future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

        executor.shutdown();
    }
}
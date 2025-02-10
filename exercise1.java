public class exercise1 {
    public void add (int a, int b) {
        int sum = a + b;
        System.out.println("Sum: " + sum);
        
    }
    
    public static void main(String[] args) {
        exercise1 obj = new exercise1();
        obj.add(5, 6);
    }
}

public class AddWithReturn {
    public int add (int a, int b) {
        return(a + b);
    }

    public static void main(String[] args) {
        AddWithReturn obj = new AddWithReturn();
        System.out.print("Sum = " + obj.add(5, 6));
    }
}

public class overload {
    public static void main(String[] args) {
        int i = 88;
        demo obj = new demo();
        obj.test();
        obj.test(i);
        obj.test(123.45);
    }
}

class demo {
    void test() {
        System.out.println("No parameters");
    }
    
    void test(int a) {
        System.out.println("a: " + a);
    }
    
    void test(double a) {
        System.out.println("double a: " + a);
    }
}

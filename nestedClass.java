public class nestedClass {
    int outer_x = 100;
    void test() {
        inner innerObj = new inner();
        innerObj.display();
    }

    class inner {
        void display() {
            System.out.println("Display: outer_x = " + outer_x);
        }
    }

    public static void main(String[] args) {
        nestedClass outerObj = new nestedClass();
        outerObj.test();
    }

}



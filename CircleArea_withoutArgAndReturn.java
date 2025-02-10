public class CircleArea_withoutArgAndReturn {
    public void area() {
        double radius = 5;
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    public static void main(String[] args) {
        CircleArea_withoutArgAndReturn obj = new CircleArea_withoutArgAndReturn();
        obj.area();
    }
}
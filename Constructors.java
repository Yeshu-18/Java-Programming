public class Constructors {
    int id;
    String name;
    
    Constructors(int i, String n) {
        id = i;
        name = n;
    }
    
    public static void main(String[] args) {
        Constructors obj = new Constructors(5, "Yeshwin");
        System.out.println(obj.id + " " + obj.name);
    }
}

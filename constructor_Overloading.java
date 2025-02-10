class constructor_Overloading {
    int id;
    String name;
    constructor_Overloading () {
        System.out.println("Default constructor");
    }

    constructor_Overloading (int i, String n) {
        id = i;
        name = n;
    }

    public static void main(String[] args) {
        constructor_Overloading obj1 = new constructor_Overloading();
        constructor_Overloading obj2 = new constructor_Overloading(1, "John");
        System.out.println(obj2.id + " " + obj2.name);
    }
}

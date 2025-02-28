class University {
    
    static class Library {
        String name;
        Library(String name) {
            this.name = name;
        }
        void display() {
            System.out.println("Library name: " + name);
        }
    }

    class Department{
        String name;
        Department(String name) {
            this.name = name;
        }
        void display() {
            System.out.println("Department name: " + name);
        }
    }

    //Main program
    public static void main(String[] args) {
        University.Library lib = new University.Library("Central Library");
        lib.display();
        University univ = new University();
        University.Department dept = univ.new Department("Computer Science");
        dept.display();
    }
}
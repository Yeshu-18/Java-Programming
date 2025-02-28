import java.io.*;
import java.util.Scanner;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + "," + age;
    }

    public static Student fromString(String data) {
        String[] parts = data.split(",");
        return new Student(parts[0], Integer.parseInt(parts[1]));
    }
}

class StudentFileHandler {
    private static final String FILE_NAME = "students.txt";

    // Save Student Data to File
    public static void saveStudent(Student student) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(student.toString());
            writer.newLine();
            System.out.println("Student data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving student data: " + e.getMessage());
        }
    }

    // Read Student Data from File
    public static void readStudents() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Student student = Student.fromString(line);
                System.out.println("Student Name: " + student.getName() + ", Age: " + student.getAge());
            }
        } catch (IOException e) {
            System.out.println("Error reading student data: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input and save student data
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();

        Student student = new Student(name, age);
        saveStudent(student);

        // Read and display saved student data
        System.out.println("\nSaved Student Details:");
        readStudents();
    }
}

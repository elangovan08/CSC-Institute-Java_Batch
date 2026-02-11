import java.io.*;
import java.util.*;

// Student class representing a student's data
class Student implements Serializable {
    private int id;
    private String name;
    private int age;
    private double grade;

    public Student(int id, String name, int age, double grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getGrade() { return grade; }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + id +
                ", Name='" + name + '\'' +
                ", Age=" + age +
                ", Grade=" + grade +
                '}';
    }
}

// Main management system
public class StudentManagementSystem {
    private static final String FILE_NAME = "students.dat";
    private List<Student> students = new ArrayList<>();

    // Add a student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("✅ Student added successfully!");
    }

    // Display all students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("❗ No students found.");
            return;
        }
        System.out.println("\n📋 Student List:");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    // Save student data to file
    public void saveToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
            System.out.println("💾 Data saved successfully to " + FILE_NAME);
        } catch (IOException e) {
            System.out.println("❌ Error saving data: " + e.getMessage());
        }
    }

    // Load student data from file
    @SuppressWarnings("unchecked")
    public void loadFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            students = (List<Student>) ois.readObject();
            System.out.println("📂 Data loaded successfully from " + FILE_NAME);
        } catch (FileNotFoundException e) {
            System.out.println("⚠️ No saved data found yet.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("❌ Error loading data: " + e.getMessage());
        }
    }

    // Menu-driven interface
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();
        sms.loadFromFile();

        while (true) {
            System.out.println("\n===== 🎓 Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Save Data");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter Grade: ");
                    double grade = sc.nextDouble();
                    sms.addStudent(new Student(id, name, age, grade));
                }
                case 2 -> sms.displayStudents();
                case 3 -> sms.saveToFile();
                case 4 -> {
                    sms.saveToFile();
                    System.out.println("👋 Exiting... Have a great day!");
                    return;
                }
                default -> System.out.println("❗ Invalid choice. Try again.");
            }
        }
    }
}

package Project;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager_display {

    static class Student {
        String id;
        String name;
        int age;

        public Student(String id, String name, int age) {
            this.id = id;
            this.name = name;
            this.age = age;
        }

        public void display() {
            System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age);
        }
    }

    static ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);


    // 2. Hiển thị
    public static void displayAll() {
        if (list.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }
        for (Student s : list) {
            s.display();
        }
    }

}
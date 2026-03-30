package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager_DeleteStudent {

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

    
    public static void deleteStudent() {
        System.out.print("Nhap ID can xoa: ");
        String id = sc.nextLine();

        for (Student s : list) {
            if (s.id.equals(id)) {
                list.remove(s);
                System.out.println(">> Da xoa!");
                return;
            }
        }
        System.out.println("Khong tim thay!");
    }

}
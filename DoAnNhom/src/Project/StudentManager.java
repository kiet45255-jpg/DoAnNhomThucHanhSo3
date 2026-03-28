package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

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

    public static void addStudent() {
    	System.out.print("Nhap ID: ");
        String id = sc.nextLine();
        System.out.print("Nhap ten: ");
        String name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        int age = Integer.parseInt(sc.nextLine());

        list.add(new Student(id, name, age));
        System.out.println(">> Them thanh cong!");
    }

    

}

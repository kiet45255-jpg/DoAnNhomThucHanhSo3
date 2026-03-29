package project;

import java.util.ArrayList;
import java.util.Scanner;

public class test {

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

    // 1. Thêm sinh viên
    public static void addStudent() {
        System.out.print("Nhap ID: ");
        String id = sc.nextLine();
        System.out.print("Nhap ten: ");
        String name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        try {
            int age = Integer.parseInt(sc.nextLine());
            list.add(new Student(id, name, age));
            System.out.println(">> Them thanh cong!");
        } catch (NumberFormatException e) {
            System.out.println("Loi: Tuoi phai la con so!");
        }
    }

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

    // 3. Tìm kiếm
    public static void findStudent() {
        System.out.print("Nhap ID can tim: ");
        String id = sc.nextLine();

        for (Student s : list) {
            if (s.id.equals(id)) {
                s.display();
                return;
            }
        }
        System.out.println("Khong tim thay!");
    }

    // 4. Xóa
    public static void deleteStudent() {
        System.out.print("Nhap ID can xoa: ");
        String id = sc.nextLine();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).id.equals(id)) {
                list.remove(i);
                System.out.println(">> Da xoa!");
                return;
            }
        }
        System.out.println("Khong tim thay!");
    }

    // 5. Menu
    public static void menu() {
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Tim sinh vien");
            System.out.println("4. Xoa sinh vien");
            System.out.println("5. Thoat");
            System.out.print("Chon: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1: addStudent(); break;
                    case 2: displayAll(); break;
                    case 3: findStudent(); break;
                    case 4: deleteStudent(); break;
                    case 5:
                        System.out.println("Tam biet!");
                        return;
                    default:
                        System.out.println("Lua chon khong hop le!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Loi: Vui long nhap so tu 1 den 5!");
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}

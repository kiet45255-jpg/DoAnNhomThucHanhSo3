package Project;

import java.util.Scanner;

public class MenuStudent {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int choice;

        do {
            System.out.println("\n===== MENU STUDENT =====");
            System.out.println("1. Add student");
            System.out.println("2. Display all students");
            System.out.println("3. Find student");
            System.out.println("4. Delete student");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAll();
                    break;
                case 3:
                    findStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }

        } while (choice != 0);
    }

   

    public static void addStudent() {
        System.out.println("Add student function...");
    }

    public static void displayAll() {
        System.out.println("Display all students...");
    }

    public static void findStudent() {
        System.out.println("Find student...");
    }

    public static void deleteStudent() {
        System.out.println("Delete student...");
    }
}
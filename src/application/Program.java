package application;

import entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Student> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int studentId = sc.nextInt();
            set.add(new Student(studentId));
        }

        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int studentId = sc.nextInt();
            set.add(new Student(studentId));
        }

        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int studentId = sc.nextInt();
            set.add(new Student(studentId));
        }

        System.out.println("Total students: " + set.size());

        sc.close();

    }
}

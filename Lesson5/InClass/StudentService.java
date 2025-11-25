package Java_Private.Lesson5.InClass;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public static ArrayList<Student> studentList = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public void add(Student a) {
        studentList.add(a);
        System.out.println("added success object " + a.toString());
    }

    public static void display() {
        for (Student v : studentList) {
            System.out.println(v.toString());
        }
    }

    public static void fix(Student b) {
        System.out.println("New name : ");
        String newName = sc.nextLine();
        b.setName(newName);
        System.out.println("New age : ");
        int newAge = sc.nextInt();
        b.setAge(newAge);
        System.out.println("New class : ");
        String newClass = sc.nextLine();
        b.setClasses(newClass);
    }

    public static void delete(Student c) {
        for (Student s : studentList) {
            studentList.remove(c);
            System.out.println("deleted success object " + c.toString());
        }
    }

    public static void findName(String name) {
        for (Student s : studentList) {
            if (s.getName().equalsIgnoreCase(name.toLowerCase())) {
                System.out.println("finded success object ");
                System.out.println(s.toString());
            } else {
                System.out.println("not invalid person ");
            }
        }
    }

    public static void findClass(String classes) {
        for (Student s : studentList) {
            if (s.getClasses().equalsIgnoreCase(classes.toLowerCase())) {
                System.out.println("find success object");
                return;
            } else {
                System.out.println("not invalid");
                return;
            }
        }
    }
}

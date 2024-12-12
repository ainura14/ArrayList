package HomeWork.Task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Student student = new Student();
        ArrayList<Student> newStudents = new ArrayList<>(
                List.of(new Student("Ainura", 20, "Java"),
                        new Student("Guljamal", 23, "Java"),
                        new Student("Yrys", 23, "Javascript"),
                        new Student("Aidana", 21, "Java"),
                        new Student("Adyl", 18, "Java"),
                        new Student("Kanat", 19, "JavaScript"),
                        new Student("Jamal", 22, "JavaScript"),
                        new Student("Perizat", 23, "Java"),
                        new Student("Kadyr", 29, "Java"),
                        new Student("Adan", 17, "Java")
                        )
        );
        studentManager.setStudents(newStudents);
        studentManager.studentsWithGroups();
        System.out.println(studentManager.studentsWithAges());
        System.out.println(studentManager.studentWith_A_Latter());
        System.out.println("------------------- Java Group ----------------");
        System.out.println(studentManager.getWithGroupJava());
        System.out.println("------------------- Java Script ----------------");
        System.out.println(studentManager.getWithGroupJavaScript());
    }
}

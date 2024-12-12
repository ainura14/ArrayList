package HomeWork.Task1;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Student> withGroupJava = new ArrayList<>();
    private ArrayList<Student> withGroupJavaScript = new ArrayList<>();

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> studentsWithAges(){
        System.out.println("---------- Student with 19-23 age ---------");
        boolean isTrue = false;
        ArrayList<Student> newListWithAge = new ArrayList<>();
        for (Student student : students) {
            isTrue = true;
            if(student.getAge() > 19 && student.getAge() < 23){
                newListWithAge.add(student);
            }
        }
        if(!isTrue){
            return null;
        }
        return newListWithAge;
    }

    public ArrayList<Student> studentWith_A_Latter(){
        System.out.println("---------- Student with name A latter ---------");
        boolean isTrue = false;
        ArrayList<Student> studentsName = new ArrayList<>();
        for (Student student : students) {
            if(student.getName().startsWith("A")){
                isTrue = true;
                studentsName.add(student);
            }
        }
        if(!isTrue){
            return null;
        }
        return studentsName;
    }
    public void studentsWithGroups(){
        for (Student student : students) {
            if(student.getGroup().equalsIgnoreCase("Java")){
                withGroupJava.add(student);
                System.out.println(withGroupJava);
            } else if (student.getGroup().equalsIgnoreCase("JavaScript")) {
                withGroupJavaScript.add(student);
            }
        }
    }
    public ArrayList<Student> getWithGroupJava() {
        return withGroupJava;
    }

    public ArrayList<Student> getWithGroupJavaScript() {
        return withGroupJavaScript;
    }

    public ArrayList<Student> getAllStudents() {
        return students;
    }
}

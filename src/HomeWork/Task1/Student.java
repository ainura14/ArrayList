package HomeWork.Task1;

import java.util.ArrayList;

public class Student {
    private long id;
    private static int incremented = 0;
    private String name;
    private int age;
    private String group;

    public Student() {
        this.id = incremented + 1;
    }

    public Student(String name, int age, String group) {
        this.id = ++incremented;
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student" +
                "\nid: " + id +
                "\nname='" + name +
                "\nage=" + age +
                "\ngroup='" + group;
    }
}

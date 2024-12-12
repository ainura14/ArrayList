package HomeWork.Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        try{
            employees.add(new Employee("Ainura", 20, "java developer"));
            employees.add(new Employee("Aidana", -21, "Tester"));
            employees.add(new Employee("Yrys", 18, "Engineer"));
        }catch (InvalidAgeException e){
            System.out.println("Error: " + e.getMessage());
        }

        try{
            for (Employee employee : employees) {
                if(employee != null){
                    System.out.println(employee);
                }else{
                    System.out.println("The employee must not be empty.");
                }
            }


            System.out.println(employees.get(10));
        }catch (IndexOutOfBoundsException e){
            System.out.println("The index out of list.");
        }catch (NullPointerException e){
            System.out.println("We can't work with null object.");
        }finally {
            System.out.println("Finish!");
        }
    }
}

package PracticeDay.Task1.dao;

import PracticeDay.Task1.model.Employee;

import java.util.ArrayList;

public interface EmployeeDao {
    // add
    String addEmployee(Long id, Employee employee);
    // get all
    ArrayList<Employee> getAllEmployees(Long id);

    // get by ID
    Employee getEmployeeByID(Long id, String name);

    // update
    String updateTheEmployee(String name, Long id, Employee employee);

    // delete
    String deleteTheEmployee(String name, Long id);
}

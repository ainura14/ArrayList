package PracticeDay.Task1.dao.Impl;

import PracticeDay.Task1.dao.EmployeeDao;
import PracticeDay.Task1.dataBase.DataBase;
import PracticeDay.Task1.model.Employee;
import PracticeDay.Task1.model.Medicine;
import PracticeDay.Task1.model.Pharmacy;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    private final DataBase dataBase = new DataBase();

    @Override
    public String addEmployee(Long id, Employee employee) {
        try {
            for (Pharmacy pharmacy : dataBase.pharmaciesList) {
                if(pharmacy.getId().equals(id)) {
                    if (pharmacy != null) {
                        ArrayList<Employee> employees = new ArrayList<>();
                        employees.add(employee);
                        pharmacy.setEmployees(employees);
                        return "Successfully added";
                    }
                }
            }
        }catch (NullPointerException e){
            return "The pharmacy or medicine must not be empty.";
        }catch (IllegalArgumentException e){
            return "Error: " + e.getMessage();
        }catch (Exception e){
            return "We can't add this employee!" + e.getMessage();
        }
        return "No pharmacy found to add the employee.";
    }

    @Override
    public ArrayList<Employee> getAllEmployees(Long id) {
        for (Pharmacy pharmacy : dataBase.pharmaciesList) {
            if(pharmacy != null){
                if(pharmacy.getId().equals(id)){
                    ArrayList<Employee> employees = new ArrayList<>();
                    for (Employee employee : pharmacy.getEmployees()) {
                        employees.add(employee);
                        return employees;
                    }
                }
            }

        }
        return null;
    }

    @Override
    public Employee getEmployeeByID(Long id, String name) {
        try {
            for (Pharmacy pharmacy : dataBase.pharmaciesList) {
                if(pharmacy != null) {
                    if (pharmacy.getName().equalsIgnoreCase(name)) {
                        List<Employee> employees = pharmacy.getEmployees();
                        for (Employee employee : employees) {
                            if(employee != null) {
                                if (employee.getId() == id) {
                                    return employee;
                                }
                            }
                        }
                    }
                }
            }
        }catch (NullPointerException e){
            throw new IllegalArgumentException("We find that pharmacy or employee is empty.");
        }
        return null;
    }

    @Override
    public String updateTheEmployee(String name, Long id, Employee employee) {
        for (Pharmacy pharmacy : dataBase.pharmaciesList) {
            if(pharmacy.getName().equalsIgnoreCase(name)){
                List<Employee>employees = pharmacy.getEmployees();
                for (Employee employee1 : employees) {
                    if(employee1.getId() == id){
                        employee1.setFullName(employee.getFullName());
                        employee1.setEmail(employee.getEmail());
                        employee1.setExperience(employee.getExperience());
                        employee1.setGender(employee.getGender());
                        employee1.setPosition(employee.getPosition());
                        employee1.setPhoneNumber(employee.getPhoneNumber());
                        return "Successfully updated";
                    }
                }
            }
        }
        return "We can't updated.";
    }

    @Override
    public String deleteTheEmployee(String name, Long id) {
        for (Pharmacy pharmacy : dataBase.pharmaciesList) {
            if(pharmacy.getName().equalsIgnoreCase(name)){
                List<Employee> employees = pharmacy.getEmployees();
                for (Employee employee : employees) {
                    if(employee.getId() == id){
                        employees.remove(employee);
                        pharmacy.setEmployees(employees);
                        return "Successfully deleted";
                    }
                }
            }
        }
        return "We can't deleted this employee";
    }
}

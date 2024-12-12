package PracticeDay.Task1.service.Impl;

import PracticeDay.Task1.dao.Impl.EmployeeDaoImpl;
import PracticeDay.Task1.model.Employee;
import PracticeDay.Task1.service.EmployeeService;

import java.util.ArrayList;

public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeDaoImpl employeeDao;

    public EmployeeServiceImpl(EmployeeDaoImpl employeeDao){
        this.employeeDao = employeeDao;
    }

    @Override
    public String addEmployee(Long id, Employee employee) {
        return employeeDao.addEmployee(id, employee);
    }

    @Override
    public ArrayList<Employee> getAllEmployees(Long id) {
        return employeeDao.getAllEmployees(id);
    }

    @Override
    public Employee getEmployeeByID(Long id, String name) {
        return employeeDao.getEmployeeByID(id, name);
    }

    @Override
    public String updateTheEmployee(String name, Long id, Employee employee) {
        return employeeDao.updateTheEmployee(name, id, employee);
    }

    @Override
    public String deleteTheEmployee(String name, Long id) {
        return employeeDao.deleteTheEmployee(name, id);
    }
}

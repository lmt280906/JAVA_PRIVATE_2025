package Java_Private.Lesson6.service.impl;

import Java_Private.Lesson6.model.Employee;

import java.util.ArrayList;
import java.util.List;

public interface IEmployeeService {
    public List<Employee> getAllEmployees();
    public  Employee getEmployeeById(String id);
    public  Employee getEmployeeByName(String name);

}

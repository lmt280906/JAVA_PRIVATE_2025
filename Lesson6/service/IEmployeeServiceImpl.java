package Java_Private.Lesson6.service;

import Java_Private.Lesson6.model.Employee;
import Java_Private.Lesson6.service.impl.IEmployeeService;
import java.util.ArrayList;
import java.util.List;

public class IEmployeeServiceImpl implements IEmployeeService {
    public static ArrayList<Employee> getAllEmployees= new ArrayList<>();

    @Override
    public List<Employee> getAllEmployees() {
        return List.of();
    }

    @Override
    public  Employee getEmployeeById(String id){
        for(Employee e:getAllEmployees){
            if(e.getId().equalsIgnoreCase(id)){
                System.out.println("Da tim thay employee co id nhu tren ");
                System.out.println(e);
            }
        }return null;
    }
    @Override
    public  Employee getEmployeeByName(String name){
        for(Employee e:getAllEmployees){
            if(e.getName().equalsIgnoreCase(name)){
                System.out.println("Da tim thay employee co ten nhu tren ");
                System.out.println(e);
            }
        }return null;
    }
}

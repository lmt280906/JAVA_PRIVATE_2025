package Java_Private.Lesson6.model;

import Java_Private.Lesson6.Device;

public class Employee {
    private String id;
    private String name;
    private int age;
    private double basicSalary;
    private Device devive;
    private static int employeeCount;
    private final double BASE_SALARY_RATE=500000;

    public Employee() {
    }

    public Employee(String id, String name, int age, double basicSalary, Device devive) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
        this.devive = devive;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBASE_SALARY_RATE() {
        return BASE_SALARY_RATE;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public Device getDevive() {
        return devive;
    }

    public void setDevive(Device devive) {
        this.devive = devive;
    }

    public static int getEmployeeCount() {
        return employeeCount;
    }

    public static void setEmployeeCount(int employeeCount) {
        Employee.employeeCount = employeeCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double calculateSalary(){
        return this.basicSalary*this.BASE_SALARY_RATE;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", basicSalary=" + basicSalary +
                ", devive=" + devive +
                ", BASE_SALARY_RATE=" + BASE_SALARY_RATE +
                '}';
    }
}

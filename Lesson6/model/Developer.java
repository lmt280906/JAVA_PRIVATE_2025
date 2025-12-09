package Java_Private.Lesson6.model;

import Java_Private.Lesson6.Device;
import Java_Private.Lesson6.service.impl.IDebuggable;

public class Developer extends Employee implements IDebuggable {
    private int overTimeHours;

    public Developer() {
        super();
    }

    public Developer(String id, String name, int age, double basicSalary, Device devive, int overTimeHours) {
        super(id, name, age, basicSalary, devive);
    }

    public double calculateSalary(){
        return this.getBasicSalary()+this.getBASE_SALARY_RATE()*this.overTimeHours;
    }
    public void work(){
        System.out.println("Developer is working");
    }
    public void fixBug(){
        System.out.println("Developer is fixxing bug");
    }

    @Override
    public String toString() {
        return "[Developer]"+super.toString()+ "overTimeHours :"+this.overTimeHours;

    }
}

package Java_Private.Lesson6.model;

import Java_Private.Lesson6.service.impl.IDebuggable;

public class Developer extends Employee implements IDebuggable {
    private int overTimeHours;
    public double calculateSalary(){
        return this.getBasicSalary()+this.getBASE_SALARY_RATE()*this.overTimeHours;
    }
    public void work(){
        System.out.println("Developer is working");
    }
    public void fixBug(){
        System.out.println("Developer is fixxing bug");
    }
}

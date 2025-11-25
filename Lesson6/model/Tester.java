package Java_Private.Lesson6.model;

import Java_Private.Lesson6.service.impl.IWorkable;

public class Tester extends Employee implements IWorkable {
    private int bugsDetectedCount;
    public double calculateSalary(){
        return this.getBasicSalary()+this.getBASE_SALARY_RATE()*this.bugsDetectedCount;
    }
    public void work(){
        System.out.println("Tester is working ");
    }
}

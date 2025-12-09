package Java_Private.Lesson6.model;

import Java_Private.Lesson6.Device;
import Java_Private.Lesson6.service.impl.IWorkable;

public class Tester extends Employee implements IWorkable {
    private int bugsDetectedCount;

    public Tester() {
        super();
    }

    public Tester(String id, String name, int age, double basicSalary, Device devive, int bugsDetectedCount) {
        super(id, name, age, basicSalary, devive);
        this.bugsDetectedCount = bugsDetectedCount;
    }

    public double calculateSalary(){
        return this.getBasicSalary()+this.getBASE_SALARY_RATE()*this.bugsDetectedCount;
    }
    public void work(){
        System.out.println("Tester is working ");
    }

    @Override
    public String toString() {
        return "[Tester] " +super.toString()+" bugsDetectedCount : "+this.bugsDetectedCount;

    }
}

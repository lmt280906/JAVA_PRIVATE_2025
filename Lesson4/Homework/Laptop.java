package Java_Private.Lesson4.Homework;

public class Laptop extends Product{
    private String ram;
    private String cpu;

    public Laptop(){
    }
    public Laptop(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public Laptop( String name, String description, double price, String cpu, String ram) {
        super(0, name, description, price);
        this.cpu = cpu;
        this.ram = ram;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println(" |Ram : "+ram+" |CPU :" +cpu);
    }
}

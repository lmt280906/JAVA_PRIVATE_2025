package Java_Private.Lesson5.train.model;

public class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Mèo đang kêu");
    }
    @Override
    public void eat(){
        System.out.println("Mèo đang ăn");
    }
    @Override
    public void move(){
        System.out.println("Mèo đang di chuyển");
    }
}

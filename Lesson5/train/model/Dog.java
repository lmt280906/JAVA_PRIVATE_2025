package Java_Private.Lesson5.train.model;

import Java_Private.Lesson5.train.service.Swimmable;

public class Dog extends Animal implements Swimmable {
    @Override
    public void makeSound(){
        System.out.println("Chó đang kêu");
    }
    @Override
    public void eat(){
        System.out.println("Chó đang ăn");
    }
    @Override
    public void move(){
        System.out.println("Chó đang di chuyển");
    }
    @Override
    public boolean swim(){
        return true;
    }
}

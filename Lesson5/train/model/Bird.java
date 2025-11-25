package Java_Private.Lesson5.train.model;

import Java_Private.Lesson5.train.service.Flyable;
import Java_Private.Lesson5.train.service.Swimmable;

public class Bird extends Animal implements Swimmable, Flyable {
    @Override
    public void makeSound(){
        System.out.println("Chim đang kêu");
    }
    @Override
    public void eat(){
        System.out.println("Chim đang ăn");
    }
    @Override
    public void move(){
        System.out.println("Chim đang bay");
    }
    public boolean swim(){
        return false;
    }public boolean fly(){
        return true;
    }
}

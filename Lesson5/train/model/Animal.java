package Java_Private.Lesson5.train.model;

import Java_Private.Lesson5.train.service.Flyable;
import Java_Private.Lesson5.train.service.Swimmable;
public class Animal  {
    protected String name;
    protected String age;

    public Animal() {
    }

    public Animal(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public void makeSound(){
        System.out.println("Động vật đang kêu");
    }
    public void  eat(){
        System.out.println("Động vật đang ăn");
    }
    public void move(){
        System.out.println("Động vật đang di chuyển");
    }


    @Override
    public String toString() {
        return "Animal{" +
                "age='" + age + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

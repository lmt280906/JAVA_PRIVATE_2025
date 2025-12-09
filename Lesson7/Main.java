package Java_Private.Lesson7;

public class Main {
    public static void main(String[] args) {

        Car c1 = new Car("Xe A", 300);
        Car c2 = new Car("Xe B", 400);
        Car c3 = new Car("Xe C", 500);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);

        t1.start();
        t2.start();
        t3.start();
    }
}

package Java_Private.Lesson7;
import java.util.Random;
public class Car implements Runnable {
    private String name;
    private int speed;

    Random rand = new Random();

    public Car(String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void run() {
        try{
            for(int km = 1; km <= 30; km++){
                int chance = rand.nextInt(100);
                if(chance < 10){
                    throw new BrokenCarException("Xe " + name + " bị nổ lốp!");
                }

                int sleepTime = 100 + rand.nextInt(speed - 100 + 1);
                Thread.sleep(sleepTime);

                System.out.println(name + " đã chạy được " + km + " km.");
            }

            System.out.println(">>>>> " + name + " đã hoàn thành 30km!");
        }catch(BrokenCarException e){
            System.out.println(e.getMessage());
            System.out.println(name + " bỏ cuộc!");
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package Java_Private.Lesson4.Homework;

public class SmartPhone extends Product{
    private boolean has5G;

    public SmartPhone() {
    }

    public SmartPhone(boolean has5G) {
        this.has5G = has5G;
    }

    public SmartPhone( String name, String description, double price, boolean has5G) {
        super(0, name, description, price);
        this.has5G = has5G;
    }
    public boolean isHas5G() {
        return has5G;
    }

    public void setHas5G(boolean has5G) {
        this.has5G = has5G;
    }

    public void getInfo(){
        super.getInfo();
        System.out.print(" | Có 5G không: " + (has5G ? "Có" : "Không"));
        System.out.println();
    }
}

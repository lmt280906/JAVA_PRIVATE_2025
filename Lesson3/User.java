package Java_Private.Lesson3;

public class User {
    private String id;
    private String name;
    private double balance;

    public User( String id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(double balance, String id, String name) {
        this.balance = balance;
        this.id = id;
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void deposit(double amount){
        if(amount >0){
            this.balance+=amount;
        }
    }
    public boolean withDraw(double amount){
        if( amount >0 && amount<=balance){
            this.balance -= amount;
            return true;
        }
         return false;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Tên: " + name + " | Số dư: " + balance;
    }
}

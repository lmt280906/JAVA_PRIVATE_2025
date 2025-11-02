package Java_Private.Lesson3;

public class Main {
    public static void transferMoney(User from, User to, double amount) {
        if (from.withDraw(amount)) {
            to.deposit(amount);
            System.out.println(" Đã chuyển " + amount + " từ " + from.getName() + " sang " + to.getName());
        } else {
            System.out.println("Tài khoản của "+from.getName()+" hiện còn "+from.getBalance());
            System.out.println("Không đủ "+amount+ " trong tài khoản của  "+from.getName()+" để chuyển cho "+to.getName());
        }
    }
    public static void main(String[] args) {
        User[] user =new User[3];
        user[0]=new User(7000000,"1","Tuyên");
        user[1]=new User(3000000,"2","Đức");
        user[2]=new User(4000000,"3","Chung");
        System.out.println("Trước khi chuyển:");
        for (User u : user) System.out.println(u);

        transferMoney(user[0], user[1], 5000000);
        transferMoney(user[2], user[1],3000000);
        transferMoney(user[0],user[2],100000);

        System.out.println("\nSau khi chuyển:");
        for (User u : user) System.out.println(u);
    }

}

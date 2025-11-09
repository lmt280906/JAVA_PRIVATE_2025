package Java_Private.Lesson4.Homework;

import java.util.Scanner;

public class Main {
    private static ProductController controller = new ProductController();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("--- Thêm sản phẩm ---");
        controller.addProduct("laptop", "Laptop Lenovo", "Học tập", 15000000); // ID 1
        controller.addProduct("smartphone", "iPhone20", "Giải trí", 80000000); // ID 2

        System.out.println("--- Thêm sản phẩm  ---");
        Laptop gamingLaptop = new Laptop("Laptop Gaming", "Chơi game", 30000000, "Core i9", "32GB");
        controller.addProduct(gamingLaptop); // ID 3

        SmartPhone flagshipPhone = new SmartPhone("Flagship S25", "Cao cấp", 25000000, true);
        controller.addProduct(flagshipPhone); // ID 4


        System.out.println("--- TẤT CẢ SẢN PHẨM TRONG KHO  ---");
        controller.getAllProducts();

        System.out.println("---XÓA SẢN PHẨM (ID=2)---");
        controller.removeProduct(2);

        System.out.println("--- DANH SÁCH SAU KHI XÓA ---");
        controller.getAllProducts();
    }
}

package Java_Private.Buoi1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a : ");
        int a = sc.nextInt();
        System.out.println("Nhap b : ");
        int b = sc.nextInt();
        System.out.println("Tong : " + (a + b) + " Hieu : " + (a - b) + " Tich : " + (a * b) + " Thuong : " + (a / b) + " Du : " + (a % b));

    }

}

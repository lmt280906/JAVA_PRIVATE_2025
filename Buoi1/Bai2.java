package Java_Private.Buoi1;

import java.util.Scanner;

public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap giay: ");
        int tgian = sc.nextInt();

        int gio = tgian / 3600;
        int phut = (tgian % 3600) / 60;
        int giay = (tgian % 60);
        System.out.println("  Gio: " + gio + "  Phut: " + phut + "   Giay: " + giay);

    }
}


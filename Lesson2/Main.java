package Java_Private.Lesson2;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a[] = {2, 15, 6, 4, 13, 11, 16, 7, 3, 5, 17};
        Scanner sc = new Scanner(System.in);
        System.out.println("--MENU--");
        System.out.println("1. Tính tổng các phẩn tử trong mảng");
        System.out.println("2. In ra phần tử lớn nhất, nhỏ nhất trong mảng");
        System.out.println("3. Sắp xếp lại mảng theo chiều tăng dần");
        System.out.println("4. In ra số nguyên tố lớn nhất trong mảng (nếu không có in ra Không có)");
        System.out.print("Hãy nhập lựa chọn : ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Tổng mảng  :" + Utils.tong(a));
                break;
            case 2:
                System.out.println("Max là : " + Utils.max(a));
                System.out.println("Min là : " + Utils.min(a));
                break;
            case 3:
                Utils.tang_dan(a);
                System.out.println("Mảng sắp xếp tăng dần là :");
                for(int x : a){
                    System.out.print(x+" ");
                }
                break;
            case 4:
                int maxSNT = -1;
                for (int x : a) {
                    if (Utils.SNT(x)) {
                        if (x > maxSNT) {
                            maxSNT = x;
                        }
                    }
                }
                if (maxSNT != -1) {
                    System.out.println("Số nguyên tố lớn nhất là : " + maxSNT);
                } else
                    System.out.println("Không có");
                break;
        }
    }
}

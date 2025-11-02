package Java_Private.Lesson3.Homework.service;

import Java_Private.Lesson3.Homework.model.User;

import java.util.Scanner;

public class AuthService {
    Scanner sc = new Scanner(System.in);
    private static final int Max = 100;
    public static User[] users = new User[Max];
    public static int count = 0;

    public static boolean login(String username, String password) {
        for (int i = 0; i < count; i++) {
            if (users[i].getUsername().equals(username) && users[i].getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static void register(String username, String password, String email, String phoneNumber) {
        if (count < Max) {
            users[count++] = new User(username, password, email, phoneNumber);
            System.out.println("Đăng ký thành công!");

        } else
            System.out.println("Đăng ký thất bại: Danh sách người dùng đã đầy!");
    }

    public static void changePassword(String userId, String newPassword, String confirmNewPassword) {
        if (!newPassword.equals(confirmNewPassword)) {
            System.out.println("Mật khẩu xác nhận không khớp!");
            return;
        }
    for (int i = 0; i < count; i++) {
        if (users[i].getId().equals(userId)) {
            users[i].setPassword(newPassword);
            System.out.println("Đổi mật khẩu thành công!");
            return;
        }
    }
        System.out.println("Không tìm thấy người dùng để đổi mật khẩu!");
}

    public static void menuAuth(){
        System.out.println("--- Menu Auth ---");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.print("Choose : ");
    }
}
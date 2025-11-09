package Java_Private.Lesson3.Homework.service;

import Java_Private.Lesson3.Homework.model.User;

import static Java_Private.Lesson3.Homework.service.AuthService.users;

public class UserService {
    public static void menuUser() {
        System.out.println("--- Menu User ---");
        System.out.println("1. Get user by id");
        System.out.println("2. Get all user");
        System.out.println("3. Change password");
        System.out.println("4. Đăng xuất");
        System.out.print("Chọn chức năng: ");
    }

    public static void getUserById(String userId) {
        for (User a : users) {
            if (a.getId().equals(userId)) {
                System.out.println(a);
                return;
            }
            System.out.println("Không tìm thấy người dùng!");
        }
    }

    public static void getAllUser() {
        if (AuthService.users == null || AuthService.count == 0) {
            System.out.println("Không có người dùng nào trong hệ thống.");
            return;
        }
        for (int i = 0; i < AuthService.count; i++) {
            System.out.println(users[i]);
        }
    }
}

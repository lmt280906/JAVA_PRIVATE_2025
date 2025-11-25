package Java_Private.Lesson6.Run;

import java.util.ArrayList;
import java.util.Scanner;

import Java_Private.Lesson6.Device;
import Java_Private.Lesson6.model.Employee;
import Java_Private.Lesson6.service.IEmployeeServiceImpl;
import Java_Private.Lesson6.service.impl.IEmployeeService;

import static Java_Private.Lesson6.service.IEmployeeServiceImpl.getAllEmployees;

public class Main {
    public static void menu(){
        System.out.println("---MENU---");
        System.out.println("1.In ra danh sach tat ca cac nhan vien ");
        System.out.println("2.In ra thong tin nhan vien theo ID");
        System.out.println("3.Loc ra danh sach nhan vien theo ten ");
        System.out.println("4.Thoat");

    }
    public static void hienThi(){
        for(Employee e:getAllEmployees){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        getAllEmployees.add(new Employee("123","Hung",23,5000,new Device("111","May tinh")));
        getAllEmployees.add(new Employee("124","Duc",24,5000,new Device("112","Ban phim")));
        getAllEmployees.add(new Employee("125","Hung",25,5000,new Device("113","Chuot")));
        IEmployeeServiceImpl employeeService = new IEmployeeServiceImpl() ;

        int choice;
        do{
            menu();
            System.out.println("Nhap lua chon cua ban ");
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1 :
                    hienThi();
                    break;
                 case 2:
                     System.out.println("Tim nhan vien co id ban muon : ");
                     String id=sc.nextLine();
                     employeeService.getEmployeeById(id);
                     break;
                case 3:
                    System.out.println("Tim nhan vien co ten ban muon");
                    String ten =sc.nextLine();
                    employeeService.getEmployeeByName(ten);
                case 4:
                    System.out.println("Chuonng trinh thoat");
                    break;
                default:
                    System.out.println("Vui long nhap lai yeu cau cua ban");
                    break;
        }
    }while(choice !=4);
    }
}

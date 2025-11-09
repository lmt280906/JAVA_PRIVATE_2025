package Java_Private.Lesson4;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        SaleStaff s1 = new SaleStaff();
        s1.setId(123);
        s1.setName("Tuyên");
        s1.setCountry("Việt Nam");
        s1.setSalary(3000);
        manager.getSaleStaffs().add(s1);

        Technician t1 = new Technician();
        t1.setId(124);
        t1.setName("Kylian");
        t1.setCountry("France");
        t1.setSalary(2500);
        manager.getTechnicians().add(t1);

        System.out.println("Tìm SaleStaff có id là 123");
        SaleStaff foundSale = manager.getSaleStaffById(123);
        if (foundSale != null)
            System.out.println("Tìm thấy: " + foundSale.getName());
        else
            System.out.println("Không tìm thấy ");

        System.out.println("Tìm Technician có id là 124");
        Technician foundTech = manager.getTechnicianById(122);
        if (foundTech != null)
            System.out.println("Tìm thấy " + foundTech.getName());
        else
            System.out.println("Không tìm thấy ");


    }
}

package Java_Private.Lesson4;

import java.util.ArrayList;

public class Manager {
    private ArrayList<SaleStaff> saleStaffs = new ArrayList();
    private ArrayList<Technician> technicians = new ArrayList();

    public SaleStaff getSaleStaffById(int saleStaffId) {
        for (SaleStaff s : saleStaffs) {//for each
            if (s.getId() == saleStaffId) {
                return s;
            }
        }
        return null;
    }

    public Technician getTechnicianById(int technician) {
        for (int i = 0; i < technicians.size(); i++) {//for thường
            if (technicians.get(i).getId() == technician) {
                return technicians.get(i);
            }
        }
        return null;
    }

    public ArrayList<SaleStaff> getSaleStaffs() {
        return saleStaffs;
    }

    public void setSaleStaffs(ArrayList<SaleStaff> saleStaffs) {
        this.saleStaffs = saleStaffs;
    }

    public ArrayList<Technician> getTechnicians() {
        return technicians;
    }

    public void setTechnicians(ArrayList<Technician> technicians) {
        this.technicians = technicians;
    }
}

package Java_Private.Lesson4;

public class SaleStaff extends Employee {
    private int numbersOfSale;

    public SaleStaff() {
    }

    public SaleStaff(int numbersOfSale) {
        this.numbersOfSale = numbersOfSale;
    }

    public int getNumbersOfSale() {
        return numbersOfSale;
    }

    public void setNumbersOfSale(int numbersOfSale) {
        this.numbersOfSale = numbersOfSale;
    }
}

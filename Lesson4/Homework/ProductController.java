package Java_Private.Lesson4.Homework;

import java.util.ArrayList;

public class ProductController {
    public ArrayList<Product> productsList = new ArrayList<>();
    private int countId = 1;

    public void addProduct(Product product) {
        product.setId(countId++);
        productsList.add(product);
    }

    public void addProduct(String type, String name, String description, double price) {
        Product product = null;
        if (type.equalsIgnoreCase("laptop")) {
            product = new Laptop(name, description, price, "N/A", "N/A");
        } else if (type.equalsIgnoreCase("smartphone")) {
            product = new SmartPhone(name, description, price, false);
        } else {
            System.out.println("Loại sản phẩm bạn nhập không hợp lệ ! ");
            return;
        }
        if (product != null) {
            addProduct(product);
        }
    }

    public void removeProduct(int id) {
        boolean found = false;
        for (int i = productsList.size() - 1; i >= 0; i--) {
            Product p = productsList.get(i);
            if (p.getId() == id) {
                productsList.remove(i);
                System.out.println("Đã xóa sản phẩm có mã ID là " + id);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy sản phẩm có mã là " + id + " để xóa.");
        }
    }

    public Product getById(int id) {
        for (Product p : productsList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public void getAllProducts() {
        System.out.println("Danh sách sản phẩm : ");
        if (productsList.isEmpty()) {
            System.out.println("Danh sách rỗng");
            return;
        }
        for (Product p : productsList) {
            p.getInfo();
            System.out.println();
        }
    }
}

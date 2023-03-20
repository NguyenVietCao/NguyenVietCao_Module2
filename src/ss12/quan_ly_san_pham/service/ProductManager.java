package ss12.quan_ly_san_pham.service;

import ss12.quan_ly_san_pham.model.Product;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ProductManager implements IFunction {
    static ArrayList<Product> products = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.println("NHập id");
        String id = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()) {
                System.out.println("id sinh viên có rồi");
                return;
            } else {
                count++;
            }
        }
        if (count == products.size()) {
        }
        System.out.println("NHập tên sản phẩm ");
        String productName = scanner.nextLine();
        System.out.println("NHập chất lượng sản phẩm: ");
        String quality = scanner.nextLine();
        System.out.println("NHập giá sản phẩm: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("NHập số lượng sản phẩm ");
        double quantity = Double.parseDouble(scanner.nextLine());
        Product newProduct = new Product();
    }

    @Override
    public void edit() {
        System.out.println("NHập id");
        String id = scanner.nextLine();

    }

    @Override
    public void delete() {
        System.out.println("Nhập id sản phẩm cần xóa");
        String id = scanner.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                System.out.println("Bạn có muốn xoá sản phẩm có id=" + id + " này ko  " +
                        "\n 1. Có" +
                        "\n 2. Không");
                int choice = parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        products.remove(products.get(i));
                        System.out.println("Bạn xoá thành công");
                        break;
                    case 2:
                        System.out.println("Bạn đã không xoá");
                }
                return;
            }
        }
        System.out.println("không tìm thấy id sản phẩm này");
    }

    @Override
    public void display() {
        System.out.println("Danh sach sản phẩm:");
        for (Product p : products) {
            System.out.println(p);
        }
    }

    @Override
    public void search() {

    }

    @Override
        public void arrange () {

        }
    }

package ss17.quan_ly_san_pham.service;


import ss17.quan_ly_san_pham.model.Product;
import ss17.quan_ly_san_pham.repository.Repository;

import java.util.ArrayList;
import java.util.Scanner;


public class ManagerProduct implements IFunction{
    Scanner scanner = new Scanner(System.in);
    ArrayList<Product>products = new ArrayList<>();
    Repository repository = new Repository();
    @Override
    public void add() {
        System.out.println("NHập id Sản Phẩm");
        String idProduct = String.valueOf(Integer.parseInt(scanner.nextLine()));
        int count = 0;
        for (int i = 0; i < products.size(); i++) {
            if (idProduct == products.get(i).getIdProduct()) {
                System.out.println("id Sản Phẩm có rồi");
                return;
            } else {
                count++;
            }
        }
        if (count == products.size()) {
        }
        System.out.println("NHập tên sản phẩm ");
        String nameProduct = scanner.nextLine();
        System.out.printf("NHập giá sản phẩm: \n");
        float priceProduct = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập nhà sản xuất ");
        String manufacturer = scanner.nextLine();
        Product newProduct = new Product(idProduct,nameProduct,priceProduct,manufacturer);
        products.add(newProduct);
        repository.add(newProduct);
    }

    @Override
    public void display() {
        products = (ArrayList<Product>) repository.getList();
        System.out.printf("Danh sách sản Phẩm:");
        for (Product p:products) {
            System.out.println(p);
        }
    }

    @Override
    public void search() {
        System.out.printf("Tìm Sản Phẩm: \n" +
                "1. Tìm sản phẩm theo id: \n"+
                "2. Tìm sản phẩm theo tên: \n" +
                "3. Thoát" );
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                System.out.printf("Nhập id");
            case 2:
                System.out.printf("Nhập tên");

        }

    }
}

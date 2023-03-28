package ss17.quan_ly_san_pham.controller;

import ss17.quan_ly_san_pham.service.ManagerProduct;

import java.util.Scanner;

public class ProductController {
    static Scanner scanner = new Scanner(System.in);
    static ManagerProduct managerProduct = new ManagerProduct();


    // Phương thức show menu
    public static void displayMenu() {
        boolean check = true;
        do {
            System.out.println("chọn chức năng theo số để tiếp : \n" +
                    "1. Thêm mới: \n" +
                    "2. Danh sách sản phẩm: \n" +
                    "3. Tìm Kiếm sản Phẩm: \n" +
                    "4. Thoát: \n" +
                    "Chọn chức năng:");
            int n = Integer.parseInt(scanner.nextLine());
            switch (n) {
                case 1:
                    managerProduct.add();
                    break;
                case 2:
                    managerProduct.display();
                    break;
                case 3:
                    managerProduct.search();
                    break;
                case 4:
                    System.out.println("Bạn đã thoát");
                    check = false;
                    break;
                default:
                    System.out.printf("Bạn nhập sai xin mời nhập lại");

            }

        } while (check);
    }

}

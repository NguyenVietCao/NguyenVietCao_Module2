package ss12.quan_ly_san_pham.controller;

import ss12.quan_ly_san_pham.model.Product;
import ss12.quan_ly_san_pham.service.ProductManager;

import java.util.Scanner;

public class DisplayProduct{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        boolean check  = true;
        do {
            System.out.println("Chọn chức năng theo số (để tiếp tục):\n" +
                    "1. Thêm mới \n" +
                    "2. Xóa \n" +
                    "3. Sửa\n" +
                    "4. Hiển thị\n" +
                    "5. Tìm kiếm\n" +
                    "6. Sắp xếp\n" +
                    "7. Thoát\n" +
                    "Chọn chức năng:");
            int n = Integer.parseInt(scanner.nextLine());
            switch (n) {
                case 1:
                    productManager.add();
                    break;
                case 2:
                    productManager.delete();
                    break;
                case 3:
                    productManager.edit();
                    break;
                case 4:
                    productManager.display();
                    break;
                case 5:
                    productManager.search();
                    break;
                case 6:
                    productManager.arrange();
                    break;
                case 7:
                    System.out.println("Bạn đã thoát ");
                    check = false;
                    break;
                default:
                    System.out.println("Bạn đã nhập sai xin mời nhập lại");
            }
        } while (check);
    }
}

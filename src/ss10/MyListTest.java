package ss10;

import java.util.Scanner;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        // Thêm phần tử vào mảng
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(4);
        listInteger.add(5);

        // Thêm phần tử vào vị trí index;
        listInteger.add(2, 1);
        for (int i = 0; i < listInteger.getSize(); i++) {
            System.out.println(listInteger.get(i));
        }
        System.out.printf("-----");
        // Xoá phần tử tại vị trí index
        listInteger.remove(2);
        for (int i = 0; i < listInteger.getSize(); i++) {
            System.out.println(listInteger.get(i));
        }
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập giá trị cần tìm trong mảng");
        int numb = scanner.nextInt();
        System.out.printf("Index của giá trị cần tìm trong mảng là " + listInteger.IndexOf(numb));

    }
}

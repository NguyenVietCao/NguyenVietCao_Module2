package ss3;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Nhập độ dài mảng");
        n = Integer.parseInt(scanner.nextLine());

        int[] array = new int[n];
        System.out.println("Nhập phẩn tử của mảng");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        //Nhập x là số cần chèn
        int x ;
        System.out.println("Nhập số cần chèn");
        x = Integer.parseInt(scanner.nextLine());
        if (x<= -1 && x>= array.length -1){

        }

    }



}

package ss3;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        // Khai Báo Mảng
        int[] array = {1,3,7,7,7,11};
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Nhập Số Cần Xoá X");
        x = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]){
                System.out.println("Vị trí phần tử cần xoá là: "+ i);
                for (int j = i; j < array.length-1; j++) {
                    array[j] = array[j+1];

                }
                i--;
                array[array.length - 1] = 0;
            }

        }
        System.out.println(Arrays.toString(array));
    }
}

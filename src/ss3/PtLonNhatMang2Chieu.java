package ss3;

import java.util.Arrays;
import java.util.Scanner;

public class PtLonNhatMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Mang 1
        int n;
        System.out.println("Nhập số lượng phần tử array1");
        n = Integer.parseInt(scanner.nextLine());

        int[]array1 = new int[n];
        System.out.println("Nhập phần tử array1");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array1));
        //Mang 2
        int m ;
        System.out.println("Nhập số lượng phần tử array2");
        m = Integer.parseInt(scanner.nextLine());

        int[]array2 = new int[m];
        System.out.println("Nhập Phần tử aray2");
        for (int j = 0; j < array2.length; j++) {
            array2[j] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array2));
        // Mảng hai chiều
        int[][] array3 = {array1,array2};
        System.out.println("Mảng hai chiều là:");
        System.out.println(Arrays.deepToString(array3));
        // Tìm giá trị lớn nhất
        int max = array3[0][0];
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                if (max < array3[i][j]){
                    max = array3[i][j];
                }
            }
        }
        System.out.printf(String.valueOf(max));
    }
}

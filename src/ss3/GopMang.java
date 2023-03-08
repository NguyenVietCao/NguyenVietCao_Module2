package ss3;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Mảng đầu tiên
        int n;
        System.out.println("Nhập số phần tử mảng 1");
        n = Integer.parseInt(scanner.nextLine());

        int[] array1 = new int[n];
        System.out.println("Nhập phần tử array1  ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array1));

        // Mảng thứ 2
        int m;
        System.out.println("Nhập số phần tử mảng 2");
        m = Integer.parseInt(scanner.nextLine());

        int[] array2 = new int[m];
        System.out.println("Nhập phần tử array2  ");
        for (int j = 0; j < array2.length; j++) {
            array2[j] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array2));
        //Mảng gộp
        int g = m + n;//Độ dài mảng gộp
        int[] array3 = new int[g];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            array3[n + j] = array2[j];
        }
        System.out.println("Mảng gộp là:");
        System.out.printf(Arrays.toString(array3));

    }
}

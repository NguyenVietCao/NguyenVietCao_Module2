package ss3;

import java.util.Arrays;
import java.util.Scanner;

public class NhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n ;
        System.out.println("Nhập số lượng phần tử trong mảng ");
        n =Integer.parseInt(scanner.nextLine());

        int[]array = new int[n];
        System.out.println("Nhập phần tử array");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        //Số nhỏ nhất
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.printf("Phần tử nhỏ nhất là: ");
        System.out.printf(String.valueOf(min));
    }
}

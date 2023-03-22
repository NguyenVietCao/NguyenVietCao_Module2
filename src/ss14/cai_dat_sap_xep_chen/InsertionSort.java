package ss14.cai_dat_sap_xep_chen;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử của mảng

        int n;
        System.out.println("Nhập sổ phần tử của mảng");
        n = Integer.parseInt(scanner.nextLine());

        // Nhập mảng

        int[] array = new int[n];
        System.out.println("Nhập phần tử của mảng ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        // Hiển thị phần tử trong mảng

        System.out.println("Mảng cần sắp xếp: " + Arrays.toString(array));
        insertionSort(array);

    }

    // Sắp xếp chèn

    public static void insertionSort(int[] array) {
        int x;
        int pos;
        for (int i = 0; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (0 < pos && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
        }
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));

    }
}

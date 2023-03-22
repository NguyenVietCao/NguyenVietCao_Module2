package ss13.chuoi_tang_dan_co_do_dai_lon_nhat;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AscendingSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Nhập  chuỗi: ");
        str = scanner.nextLine();
        char[] chars = str.toCharArray();
        int max = 0;
        for (int i = 0; i < chars.length; i++) {
            if (max < chars[i]){
                max = chars[i];
                System.out.print(chars[i]);
            }
        }
        }


    }


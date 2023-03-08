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
        int m;
        do {
            System.out.println("Nhập độ dài mảng mới lớn hơn mảng cũ");
             m = scanner.nextInt();

        } while (n >= m);
        int add ;
        System.out.println("Nhập phần tử cần thêm");
        add = scanner.nextInt();
        int addressAdd;
        System.out.println("Nhập vị trí cần thêm");
        addressAdd = scanner.nextInt();
        if (addressAdd <= -1 && addressAdd > m - 1){
            System.out.print("Không chèn được phần tử vào mảng");
        }
        int [] arrayNew = new int[m];
        for (int i = 0; i < array.length; i++) {
            arrayNew[i] = array[i];
            if (addressAdd == i){
                arrayNew[i] = add;
                for (int j = i; j < array.length; j++) {
                    arrayNew[j+1] = array[j];
                }
                break;
            }
        }
        System.out.print(Arrays.toString(arrayNew));


    }


}

package ss2;

import java.util.Scanner;

public class SoNguyenToNhoHon100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Nhập số lượng số nguyên tố đầu tiên");
        number = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int countSnt = 0;

        for (int i = 2; i < 100; i++) { // 2,3,4,5,6,7,8,....,1000

            if (countSnt < number) { // Nếu số lượng SNT in ra < so với số lượng yêu cầu
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count += 1;
                    }
                }
                if (count == 2) {
                    System.out.print(i + "\n");
                    countSnt += 1; //1
                }
                count = 0;
            } else {
                break;
            }
        }

    }
}

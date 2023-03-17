package ss11.baiTap_daoNgouc;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Revert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn muốn nhập bao nhiêu phần : ");
         int length = Integer.parseInt(scanner.nextLine());
        Stack<Integer> stack = new Stack<>();
        int[]array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Nhập phần tử thứ: " + (i+1));
            int mNumber = Integer.parseInt(scanner.nextLine());
            array[i] = mNumber;
            stack.push(mNumber);
        }
        System.out.printf(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.printf("Mảng đảo ngược " + "\n" + Arrays.toString(array));
    }
}

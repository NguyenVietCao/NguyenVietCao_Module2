package ss11.baiTap_nhiPhan;

import java.util.Scanner;
import java.util.Stack;

public class DecimalBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter decimal number:");
        int number = scanner.nextInt();
        while (number != 0 ){
            int d = number % 2;
            stack.push(d);
            number = number/2;
        }
        System.out.printf("\n Binary representation is:");
        while (!(stack.isEmpty())){
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}

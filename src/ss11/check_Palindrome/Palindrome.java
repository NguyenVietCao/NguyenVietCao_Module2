package ss11.check_Palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Character>queue = new LinkedList<>();
        boolean flag;
        do {
            System.out.printf("Enter String Number to check it is Palindrome or not:");
            String inputString = in.nextLine();
            if (inputString.length() > 1) {
                for (int i = inputString.length() - 1; i >= 0; i--) {
                    queue.add(inputString.charAt(i));
                }
                String reverseString = "";
                while (!queue.isEmpty()) {
                    reverseString = reverseString + queue.remove();
                }
                if (inputString.equals(reverseString)) {
                    System.out.printf("It's Palindrome");
                    flag = true;
                } else {
                    System.out.printf("It's not Palindrome ");
                    flag = true;
                }
            } else {
                System.out.printf("Please try again");
                flag = false;
            }
        } while (!flag);
    }
}

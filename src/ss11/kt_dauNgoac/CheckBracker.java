package ss11.kt_dauNgoac;

import java.util.Scanner;
import java.util.Stack;

public class CheckBracker {
    public static boolean checkBracket(String str){
        Stack<Character> stack = new Stack<>();
        char[] charArray = str.toCharArray();
        for (char ch: charArray) {
            if (ch == '('){
                stack.push(ch);
            }else if (ch == ')'){
                if (stack.isEmpty()){
                    return false;
                }
                char last = stack.peek();
                if ((ch == '(' && last == ')')){
                    stack.pop();
                }else {
                    return false;
                }
            }
            
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter something:");
        String str = scanner.nextLine();
        System.out.println(str + ":" + checkBracket(str));
    }
}

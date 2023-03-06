package ss1;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        int n;
        System.out.println("Nhập vào số nguyên");
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        String lessTen = String.valueOf(n);
        int dozens = n / 10;
        int unitRow = n % 10;

        if (n < 10 && n >= 0) {
//           String result =  lessTen(n);
            System.out.println(lessTen(n));
        } else if (n < 20) {
            String moreTen = String.valueOf(unitRow);
            switch (unitRow) {
                case 0:
                    moreTen = "ten";
                    break;
                case 1:
                    moreTen = "eleven";
                    break;
                case 2:
                    moreTen = "twelve";
                    break;
                case 3:
                    moreTen = "thirteen";
                    break;
                case 4:
                    moreTen = "fourteen";
                    break;
                case 5:
                    moreTen = "fifteen";
                    break;
                case 6:
                    moreTen = "sixteen";
                    break;
                case 7:
                    moreTen = "seventeen";
                    break;
                case 8:
                    moreTen = "eighteen";
                    break;
                case 9:
                    moreTen = "nineteen";
                    break;
                default:
            }
            System.out.println(moreTen);

        } else if (n < 100) {
            String moreTwenty = String.valueOf(dozens);
            switch (dozens) {

                case 2:
                    moreTwenty = "twenty";
                    break;
                case 3:
                    moreTwenty = "thirty";
                    break;
                case 4:
                    moreTwenty = "forty";
                    break;
                case 5:
                    moreTwenty = "fifty";
                    break;
                case 6:
                    moreTwenty = "sixty";
                    break;
                case 7:
                    moreTwenty = "seventy";
                    break;
                case 8:
                    moreTwenty = "eighty";
                    break;
                case 9:
                    moreTwenty = "ninety";
                    break;
                default:
            }
            System.out.println(moreTwenty +" "+ lessTen(unitRow));

        }

    }

    public static String lessTen(int number) {
        String lessTen = "";
        switch (number) {
            case 0:
                lessTen = "zero";
                break;
            case 1:
                lessTen = "one";
                break;
            case 2:
                lessTen = "two";
                break;
            case 3:
                lessTen = "three";
                break;
            case 4:
                lessTen = "four";
                break;
            case 5:
                lessTen = "five";
                break;
            case 6:
                lessTen = "six";
                break;
            case 7:
                lessTen = "seven";
                break;
            case 8:
                lessTen = "eight";
                break;
            case 9:
                lessTen = "nine";
                break;
            default:
        }
        return lessTen;
    }
}





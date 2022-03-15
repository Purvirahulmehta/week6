package homeworkweek6;

import java.util.Scanner;

public class Programme18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//import the scanner
        System.out.print("Input first number:");
        int num1 = scan.nextInt();

        System.out.print("Input second number:");
        int num2 = scan.nextInt();


        System.out.println(num1 + " + " + num2 + " = " +
                (num1 + num2));

        System.out.println(num1 + " - " + num2 + " = " +
                (num1 - num2));

        System.out.println(num1 + " x " + num2 + " = " +
                (num1 * num2));

        System.out.println(num1 + " / " + num2 + " = " +
                (num1 / num2));

        System.out.println(num1 + " mod " + num2 + " = " +
                (num1 % num2));

    }
}

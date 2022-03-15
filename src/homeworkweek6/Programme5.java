package homeworkweek6;

import java.util.Scanner;

public class Programme5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();
        System.out.println(num1 + " + " + num2 + " = " +(num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " +(num1 - num2));
        System.out.println(num1 + " x " + num2 + " = " +(num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " +(num1 / num2));
        System.out.println(num1 + " mod " + num2 + " = " +(num1 % num2));

    }
}


package homeworkweek6;

import java.util.Scanner;

public class Programme13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number : ");
        int num1 = scan.nextInt();

        System.out.println("Input second number : ");
        int num2 = scan.nextInt();

        System.out.println("Input third number : ");
        int num3 = scan.nextInt();


        System.out.println("Average of three numbers is : " +(num1 +num2 + num3)/3);
    }
}

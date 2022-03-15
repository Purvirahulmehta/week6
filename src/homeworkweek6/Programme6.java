package homeworkweek6;

import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Area of Circle: ");
        double area = scan.nextDouble();
        double r = Math.sqrt(7 * area / 22);
        System.out.println("Redius of Circle = " + r);
    }
}

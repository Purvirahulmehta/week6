package homeworkweek6;

import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the width of the triangle;");
        double base = scan.nextDouble();
        System.out.println("Enter the height og the triangle;");
        double height = scan.nextDouble();
        //area =(width*height)/2;
        double area = (base* height)/2;
        System.out.println("Area of triangal is: " + area);

    }

}

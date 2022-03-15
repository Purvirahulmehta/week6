package homeworkweek6;

import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenhit:");
        double f = scan.nextDouble();
        double c = (f -32) * 5/9 ;
        System.out.println(f + " degree Fahrenhit = " + c + "degree Celsius");
    }

}

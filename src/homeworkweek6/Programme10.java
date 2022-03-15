package homeworkweek6;

import java.util.Scanner;

public class Programme10 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Input a number: ");
            int num1 = scan.nextInt();

            for (int i = 0; i < 10; i++) {
                System.out.println(num1 + " x " + (i + 1) + " = " +
                        (num1 * (i + 1)));
            }
        }
        }
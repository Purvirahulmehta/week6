package homeworkweek6;

public class Programme14 {

    public static void main(String[] strings) {

        final double width = 5.5;
        final double height = 8.5;

        double perimeter = 2*( width + height );

        double area = width * height;

        System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
        System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", width, height, perimeter);
    }
}

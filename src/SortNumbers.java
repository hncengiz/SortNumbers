import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {

        // Declare integer variables
        int n1, n2, n3;

        // Create a new object
        Scanner input = new Scanner(System.in);

        // Prompt the user to input numbers
        System.out.print(" Enter first number : ");
        n1 = input.nextInt();

        System.out.print(" Enter second number: ");
        n2 = input.nextInt();

        System.out.print(" Enter third number : ");
        n3 = input.nextInt();

        // Sort the numbers from large to small
        if ((n1 > n2 && n1 > n3)) {

            if (n2 > n3) {

                System.out.print(" n1 > n2 > n3 ");

            } else {
                System.out.print(" n1 > n3 > n2 ");
            }

        } else if ((n2 > n1 && n2 > n3)) {

            if (n1 > n3) {

                System.out.print(" n2 > n1 > n3 ");

            } else {

                System.out.print(" n2 > n3 > n1 ");
            }

        } else {

            if (n1 > n2) {
                System.out.print(" n3 > n1 > n2 ");

            } else {
                System.out.print(" n3 > n2 > n1 ");
            }
        }

    }
}

package App;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {

    private static int a, b, c;

    public static void main(String[] args) {

        Scanner scan;

        while(true){
            try {
                System.out.println("Enter three numbers");
                scan = new Scanner(System.in);
                a = Integer.parseInt(scan.nextLine());
                b = Integer.parseInt(scan.nextLine());
                c = Integer.parseInt(scan.nextLine());
                break;
            } catch (InputMismatchException | NumberFormatException e) {
                System.out.println("Enter numbers please");
            }
        }

        if (a < b + c && b < a + c && c < a + b) { // if triangle
            if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a != b && a != c && b != c) {
                System.out.println("Scalene");
            } else {
                System.out.println("Isosceles");
            }
        } else {
            System.out.println("Cannot be a Triangle");
        }
    }

}

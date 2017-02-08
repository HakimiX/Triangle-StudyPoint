package App;

import java.util.Scanner;

public class Triangle {

    static Scanner scan = new Scanner(System.in);
    private static int a, b, c;

    public Triangle(int value1, int value2, int value3) {
        a = value1;
        b = value2;
        c = value3;
    }

    public static void main(String[] args) {

        System.out.print("Enter first value: ");
        a = scan.nextInt();

        System.out.print("Enter second value: ");
        b = scan.nextInt();

        System.out.print("Enter third value: ");
        c = scan.nextInt();

        if (a < b + c && b < a + c && c < a + b) { 
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

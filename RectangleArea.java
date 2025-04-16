// RectangleArea.java
// A simple Java program to calculate the area of a rectangle

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Rectangle Area Calculator ===");

        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();

        double area = width * height;

        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}

package edu.wit.cs.comp1000;
import java.util.Scanner;
// TODO: document this class
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a b c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double discriminant = (b*b) - (4 * a * c);
		
		if (discriminant < 0) {
			System.out.println("Roots: imaginary");
			System.exit(0);
		}
		
		double root1 = (-b + Math.sqrt(discriminant))/(2*a);
		if (discriminant == 0) {
			System.out.printf("Root: %.2f%n", root1);
		}
		
		double root2 = (-b - Math.sqrt(discriminant))/(2*a);
		if (discriminant > 0) {
			System.out.printf("Roots: %.2f, %.2f%n", root2, root1);
		}
	}

}

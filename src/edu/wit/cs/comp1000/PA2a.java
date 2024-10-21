package edu.wit.cs.comp1000;
import java.util.Scanner;
// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
		
		Scanner input = new Scanner(System.in);
		
		int posSum = 0;
		int posCount = 0;
		int negSum = 0;
		int negCount = 0;
		int total = 0;
		
		System.out.print("Enter five whole numbers: ");
		for (int i = 0; i < 5; i++) {
			
			int num = input.nextInt();
			total += num;
			if (num>0) {
				posSum += num;
				posCount ++;
			}else {
				negSum += num;
				negCount ++;
			}
		}
		
		double posAvg = (double) posSum / posCount;
		double negAvg = (double) negSum / negCount;
		double totalAvg = (double) total / 5;
		
		if (posCount == 0) {
			posAvg = 0;
		}else if (negCount ==0) {
			negAvg = 0;
		}
		
		System.out.printf("The sum of the %d positive numbers: %d%n", posCount, posSum);
		System.out.printf("The sum of the %d non-positive numbers: %d%n", negCount, negSum);
		System.out.printf("The sum of the 5 numbers: %d%n", total);
		System.out.printf("The average of the %d positive numbers: %.2f%n", posCount, posAvg);
		System.out.printf("The average of the %d non-positive numbers: %.2f%n", negCount, negAvg);
		System.out.printf("The average of the 5 numbers: %.2f%n", totalAvg);
		
		input.close();
	}

}

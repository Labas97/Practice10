package practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		int[] myIntArray = new int[5];
	
		Scanner scanner = new Scanner(System.in);
	
		for (int i = 0; i < myIntArray.length; i++) {
			
			System.out.println("Please enter " + (i + 1) + ". integer number!\nNumber:");
			
			boolean falseInput = true;
			
			do {
				
				try {
					
					myIntArray[i] = scanner.nextInt();
					falseInput = false;
					
				} catch (InputMismatchException exception) {
					System.out.println("This number doesn't integer!");
					System.out.println("Please enter again!\nNumber:");
					
				} catch (Exception e) {
					System.out.println("This number doesn't integer!");
				} finally {
					scanner.nextLine();
				}
			} while (falseInput);
			
		}
		
		scanner.close();
		
		System.out.println("\nScanned numbers:");
		
		for (int i : myIntArray) {
			System.out.println(i);
		}
		
	}
		
}

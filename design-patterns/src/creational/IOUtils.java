package creational;

import java.util.Scanner;

public class IOUtils {
	public static <T> T readUserInput(T[] options) {
		Scanner sc = new Scanner(System.in);
		
		// Select choice
		System.out.println("Choose a type: ");
		for (int i=0; i<options.length; i++) {
			System.out.println(i + ": " + options[i].toString());
		}
		System.out.print("> Your choice: ");
		
		// Cleanup and return
		T selectedType = null;
		try {
			int c = sc.nextInt();
			selectedType = options[c];
		} catch (Exception e) {
			System.out.println("Error when processing input: " + e.getMessage());
		}
		
		sc.close();
		return selectedType;
	}
}

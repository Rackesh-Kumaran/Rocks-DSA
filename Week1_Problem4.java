package java_DSA;
import java.util.Scanner;

public class Week1_Problem4 {
	public static void main(String[] args) {
		
		System.out.println("Enter the size");
		Scanner si = new Scanner(System.in);
		
		int size = si.nextInt();
		
		switch(size) {
		case 29:
			System.out.println("Small");
			break;
		case 30:
			System.out.println("Medium");
			break;
		case 38:
			System.out.println("Large");
			break;
		case 42:
			System.out.println("XLarge");
			break;
		default:
			System.out.println("Invalid");
			break;
		}
	}

}

package java_DSA;

import java.util.Scanner;

public class Week1_problem2 {
	public static void main(String[] args) {
		System.out.println("Enter the inputs");
		
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		Scanner c = new Scanner(System.in);
		
		int s1 = a.nextInt();
		int s2 = b.nextInt();
		int s3 = c.nextInt();
		
		int sum = s1+s2+s3;
		
		if(sum == 180) {
			System.out.println("Triangle can be formed");
		}
		else {
			System.out.println("Triangle cannot be formed");
		}
	}
	

}

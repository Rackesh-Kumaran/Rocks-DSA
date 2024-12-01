package java_DSA;

import java.util.Scanner;

public class Week1_Problem6 {
	public static void main(String[] args) {
		
		System.out.println("inputs");
		
		Scanner in = new Scanner(System.in);
		
		int mul = in.nextInt();
		
		int i = 1;
		
		while(i<=10) {
			
			System.out.println(mul*i );
			i++;
		}
		
	}

}

package java_DSA;

import java.util.Scanner;

public class Week2_Pattern7 {
	public static void main (String[] args) {
		System.out.println("enter the no of stars to print: ");
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		for(int i=N;i>=1;i--) {
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println("");
		}
		
	}

}

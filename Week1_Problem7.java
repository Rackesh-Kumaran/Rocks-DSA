package java_DSA;

import java.util.Scanner;
public class Week1_Problem7 {
	public static void main(String[] args) {
		
		System.out.println("enter the names:");
		Scanner input1 = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);
		
		String name1 = input1.next();
		String name2 = input1.next();
		int no = input3.nextInt();
		
		String fullName = name1 + name2;
		
		int i = 0;
		
		while(i<no) {
			System.out.println(fullName);
			i++;
		}
	}

}

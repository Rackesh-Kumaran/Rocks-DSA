package java_DSA;
import java.util.Scanner;

public class Week1_Problem3 {
	public static void main(String[] args) {
		System.out.println("enter the mark");
		
		Scanner m = new Scanner(System.in);
		
		int mark = m.nextInt();
		
		if(mark >= 90) {
			System.out.println("Grade A");
		}
		
		else if(mark >= 80) {
			System.out.println("Grade B");
		}
		
		else if(mark >= 60) {
			System.out.println("Grade C");
		}
		
		else if(mark >= 35) {
			System.out.println("Grade D");
		}
		
		else {
			System.out.println("Fail");
		}
	}

}

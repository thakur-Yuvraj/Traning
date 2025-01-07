import java.util.Scanner;

public class Subtraction {
	public static void main(String args[]) {
		System.out.println("Enter two integer");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Sum is :" + (a - b));
	}
}
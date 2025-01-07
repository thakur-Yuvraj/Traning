import java.util.Scanner;

public class Addition {
	public static void main(String args[]) {
		System.out.println("Enter two numbers");

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a + b);
	}
}
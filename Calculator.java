import java.util.Scanner;
class Calculator {
	public static void main(String... args) {

		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter Input in this format: num1 [operation] num2");
		
		//float a = sc.nextFloat();
		//char operation = sc.next().charAt(0);
		//float b = sc.nextFloat();

		float a = Float.parseFloat(args[0]);
		float b = Float.parseFloat(args[2]);
		char c = args[1].charAt(0);
		
		
		int res = -1;
		switch(c) {
			case('+'): System.out.println(a + b);
				   break;
			case('-'): System.out.println(a - b);
				   break;
			case('*'): System.out.println(a * b);
				   break;
			case('/'): System.out.println(a / b);
				   break;
			default  : System.out.println("Invalid Input");
		}
		
			
	}

}
// LAPTOP-C6AONGDF

create a repo named traning.


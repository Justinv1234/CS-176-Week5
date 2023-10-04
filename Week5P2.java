import java.util.Scanner;

public class Week5P2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter number 1: ");
			double n = in.nextDouble();
			
		System.out.print("Enter an operator: ");
			char op = in.next().charAt(0);
		
		System.out.print("Enter number 2: ");
			double m = in.nextDouble();

		
		System.out.print("The answer of " + n + op + m + " = ");
		
		switch (op) {
		case '+':
			System.out.printf("%.2f",n+m);
			break;
			
		case '-':
			System.out.printf("%.2f",n-m);
			break;
			
		case '*':
			System.out.printf("%.2f",n*m);
			break;
			
		case '/':
			System.out.printf("%.2f",n/m);
			break;
		}
		
		in.close();
	}

}

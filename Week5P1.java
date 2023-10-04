import java.util.Scanner;

public class Week5P1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter name 1: ");
			String name1 = in.nextLine();
		
		System.out.print("Enter name 2: ");
			String name2 = in.nextLine();
		
		if (name1.equals(name2))
			System.out.println("Same name");
		else
			System.out.println("name1 and name2 are different");
		
		in.close();
	}
}

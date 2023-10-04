import java.util.Scanner;

public class Week5P3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a string:");
			String s = in.nextLine();
			
		if (s.substring(0,1).matches("^[0-9].*")) {
			switch(s.substring(0,1)) {
			case "0":
				System.out.print("zero");
				break;
				
			case "1":
				System.out.print("one");
				break;
				
			case "2":
				System.out.print("two");
				break;
				
			case "3":
				System.out.print("three");
				break;
				
			case "4":
				System.out.print("four");
				break;
				
			case "5":
				System.out.print("five");
				break;
				
			case "6":
				System.out.print("six");
				break;
				
			case "7":
				System.out.print("seven");
				break;
				
			case "8":
				System.out.print("eight");
				break;
				
			case "9":
				System.out.print("nine");
				break;
			}
			System.out.print(s.substring(1));
		}
		else {
			System.out.print(s);
		}
		
		in.close();
	}

}

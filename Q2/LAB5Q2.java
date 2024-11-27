import java.util.Scanner;

public class LAB5Q2{
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

	System.out.print("Enter the number of new members introduced: ");
	int members = scanner.nextInt();

	if (members < 0 ) {
	System.out.println("Invalid input. Number of new members must be greater than or equal to 0. ");
	}

	else{
		String prize;
		switch (members) {
			case 0:
				prize = "No Prize" ;
				break;
			case 1:
				prize = "Pen" ;
				break;
			case 2:
				prize = "Umbrella" ;
				break;
			case 3:
				prize = "Bag" ;
				break;
			case 4:
				prize = "Travelling Chair" ;
				break;
			default:
				prize = "Headphone" ;
				break;
			}

			System.out.println("Prize: " + prize);
		}

	scanner.close();
	}
}
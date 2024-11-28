import java.util.Scanner;
public class LAB5Q3{

	public static final int ROOM_CHARGE_PER_DAY = 48000;
	public static final int DISCOUNT_3_TO_4_DAYS = 10;
	public static final int DISCOUNT_5_OR_MORE_DAYS = 20;


	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the start date (day): ");
		int startDate = scanner.nextInt();
		System.out.print("Enter the end date (date) ");
		int endDate = scanner.nextInt();

		if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31){
			System.out.println("Error: Start date must be less than the end date.");
			return;
		}
		int numberOfDays = endDate - startDate;
	
		int discountRate = 0;
		if (numberOfDays >=3 && numberOfDays <= 4) {
			discountRate = DISCOUNT_5_OR_MORE_DAYS;
		}

		int totalCharge = numberOfDays * ROOM_CHARGE_PER_DAY;
		int discountAmount = (totalCharge * discountRate) / 100;
		int totalAmountToPay = totalCharge - discountAmount;

		
		System.out.println("Number of days reserved: " + numberOfDays);
		System.out.println("Total charge before discount: Rs " + totalCharge);
		System.out.println("Discount applied: " + discountRate + "% (Rs " + discountAmount + ")");
		System.out.println("Total amount to be paid: Rs " + totalAmountToPay);

		scanner.close();
	}
}
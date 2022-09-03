import java.util.Scanner;

public class pg1_Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int number = sc.nextInt();
		System.out.println("Enter the Order :");
		int order = sc.nextInt();
		int lastDigit, power, sum = 0;
		while (number > 0) {
			lastDigit = number % 10;
			power = (int) Math.pow(lastDigit, order);
			sum = sum + power;
			number = number / 10;
		}
		if (sum == number) {
			System.out.println("Given number is Armstrong!!");
		} else {
			System.out.println("Given number is not Armstrong!!");
		}
	}
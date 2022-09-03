import java.util.Scanner;

public class pg4_EquilateralTriangle {
	public static void main(String[] args) {
		int i, j, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No for the Equilateral Triangle :");
		n = sc.nextInt();

		for (i = 1; i <= n; i++) {
			for (j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
     

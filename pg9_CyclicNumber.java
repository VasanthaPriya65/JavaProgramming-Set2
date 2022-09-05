import java.math.BigInteger;
import java.util.Scanner;

public class pg9_CyclicNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Get the number
		System.out.println("Enter a number: ");
		String num = in.nextLine().trim();
		// Store number into BigInteger variable
		BigInteger tempnum = new BigInteger(num);

		// make length as number.length+1
		int len = num.length() + 1;

		// assign the length to str String variable
		String str = String.valueOf(len);

		// Assign back the str to BigInteger variable
		BigInteger len1 = new BigInteger(str);

		// create StringBuilder object created to form the string 9999999
		StringBuilder buffer = new StringBuilder();
		for (int i = 0; i < (len - 1); i++) {
			buffer.append('9');
		}

		// buffer converted to StringBuilder to BigInteger
		BigInteger buffernum = new BigInteger(buffer.toString());
		// Cyclic number condition to check
		// it is equal to 999999 or not after multiplying the number with it’s length+1.
		// Eg: 142857*7(6+1)=999999
		if (tempnum.multiply(len1).equals(buffernum)) {
			System.out.println("Given Number is a cyclic number.");
		} else {
			System.out.println("Given Number is not a cyclic number.");
		}
	}
}
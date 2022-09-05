import java.util.Arrays;

public class pg10_MirrorInverse {
	public static void main(String[] args) {
		// Initialize the array with the given length
		int[] array = { 3, 4, 5, 0, 1, 2 };
		int len;
		len = array.length;

		boolean flag = true;
		System.out.println("Enter the elements of the array: ");
		System.out.println(Arrays.toString(array));
		// Logic : swapping of index and value of the given array and the original array
		// are same then the array is Mirror Inverse
		for (int i = 0; i < len; i++) {
			if (array[array[i]] != i) {
				flag = false;
			}
		}
		if (flag)
			System.out.println("Given Array is Mirror Inverse!!");
		else
			System.out.println("Given Array is not Mirror Inverse!!");
	}
}
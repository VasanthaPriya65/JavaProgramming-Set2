import java.util.Scanner;

public class pg8_PronicPrimeNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Range : ");
		int input = in.nextInt();
		int s=0;
		System.out.println("Pronic Numbers :");
		for (int i = 0; i < input; i++) {
			s=i * (i + 1);
			System.out.print(s+" ");
		}
		System.out.println("\n\nPrime Numbers :");
		 int num = 1, range = input;  
	      while(num < range) 
	      {
	         boolean flag = false;
	         for(int a = 2; a <= num / 2; ++a) 
	         {
	            if(num % a == 0)
	            {
	               flag = true;
	               break;
	            }
	         }
	         if(!flag && num != 0 && num != 1)
	             System.out.print(num + " ");
	         ++num;
	      }
	}
}
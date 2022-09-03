import java.util.Scanner;
import java.util.*;

public class pg2_HappyNum {
	
	
	public static int checkHappyNum(int number)
	{
	int rem = 0,sum = 0;
	while(number >0)
	{
	rem = number%10;
	sum = sum + (rem*rem);
	number = number/10;
	}
	return sum;
	}
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the range number to print happy numbers :");
	int j=sc.nextInt();
	System.out.println("The happy numbers till "+1+" and "+j+" are: ");
	for (int x=1 ; x <= j; x++)
	{
	int result = x;
	//Happy number always ends with 1 and unhappy number ends with 4
	while(result != 1 && result != 4)
	{
	result = checkHappyNum(result);
	}
	if(result == 1)
	System.out.print(x + ",");
	}
	}
	}
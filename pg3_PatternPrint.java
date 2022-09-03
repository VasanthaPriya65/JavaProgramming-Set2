import java.util.Scanner;

public class pg3_PatternPrint {


   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = 0;
      System.out.print("Enter No of Rows to print half diamond Pattern : ");
      n = sc.nextInt();
 
      

      int place = 0;

      for(int i=1; i < 2*n; i++) {

         if(i < n) place = i;
         else place = Math.abs(2*n-i);

         for(int j = 1; j <= 2*place-1; j++) {
            System.out.print("*"); 
         }
         System.out.println();
      }
   }

}

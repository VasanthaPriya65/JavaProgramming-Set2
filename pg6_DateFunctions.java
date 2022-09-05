import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class pg6_DateFunctions {
public static void main(String[] args) {

	
	        Date d1 = new Date(2023, 11, 21);
	        Date d2 = new Date();  // Current date
	  
	        boolean flag = d1.after(d2);
	        if(flag)
	        	System.out.println("a) Yes , it is a future date[today is "+d2+" ]"   );
	       int month = d2.getMonth();
	       
	        Calendar gc = new GregorianCalendar();
	        gc.set(Calendar.MONTH, month);
	        gc.set(Calendar.DAY_OF_MONTH, 1);
	        Date monthStart = gc.getTime();
	        gc.add(Calendar.MONTH, 1);
	        gc.add(Calendar.DAY_OF_MONTH, -1);
	        Date monthEnd = gc.getTime();
	        SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY");
	        gc.add(Calendar.DAY_OF_YEAR , +45);
	        

	        System.out.println("b) Month start date and end date : " + format.format(monthStart)+" and "+ format.format(monthEnd));
	        System.out.println("c) After adding 45 days to the current date :"+gc.getTime());
	        
	    }
	}
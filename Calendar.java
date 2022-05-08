//Ruben Gonzalez
//
//
//

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;

public class UsernameGen
{
	public static void main(String[] args)
	{
	
		Calendar cal = Calendar.getInstance();
		Date now = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat ("mm/dd/yyyy  hh:mm:ss a");
		
		System.out.println("Date: " + sdf.format(now));
	}
}
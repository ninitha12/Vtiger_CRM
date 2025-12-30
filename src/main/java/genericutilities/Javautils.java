package genericutilities;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;

public class Javautils {
	/**
	 * this methos is used to generate random number
	 * @return
	 */
	public int getRandomNum()
	{
	Random ran=new Random();
	int random=ran.nextInt(1000);
	return random;
	
	}
	/**
	 * this method will get the system date
	 * @return
	 */
	public String systemDate()
	{
		LocalDate date=LocalDate.now();
		DateTimeFormatter d=DateTimeFormatter.ofPattern("yyyy-dd-MM");
		String systemdate=d.format(date);
		return systemdate;
	}
	/**
	 *this method  will get the time along with the date
	 * @return
	 */
	public String sysDate()
	{
		 Date date = new Date();
		 //SimpleDateFormat will get the time 
		SimpleDateFormat sim=new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
		String systemdateInFormat=sim.format(date);
		return systemdateInFormat;
		
	}
	/**
	 * this method is used to get future date in terms of months
	 * @param futureMon
	 * @return
	 */
	public String futureDateIntermsofMonths(long futureMon)
	{
		LocalDate date=LocalDate.now();
		LocalDate future=date.plusMonths(futureMon);
		DateTimeFormatter d=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String futureMonth =d.format(future);
		return futureMonth;
	}

}

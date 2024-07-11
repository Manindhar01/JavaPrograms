package javaprg;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class _39CurrentDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime curdt=LocalDateTime.now();
		System.out.println("current date and time is: "+curdt);
		
		//current zone date time
		ZonedDateTime zdt=ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("current date and time in new york: "+zdt);

	}

}

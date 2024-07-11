package javaprg;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _40LocalDateFormatDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtFormat=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate=LocalDate.of(2024, 06, 21);
		System.out.println(localDate.format(dtFormat));
		System.out.println();
		
		//local Date and time formatter
		DateTimeFormatter dtFormat1=DateTimeFormatter.ofPattern("E,MMM dd yyyy,hh:mm:ss a");
		LocalDateTime ldt=LocalDateTime.of(2024, 9, 27, 3, 45);
		System.out.println(ldt.format(dtFormat1));

	}
}
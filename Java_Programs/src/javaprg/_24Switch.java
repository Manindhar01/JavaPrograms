package javaprg;

import java.util.Scanner;

public class _24Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a week day 1 t0 7:");
		int day=s.nextInt();
		if((day<8)&&(day>0)) {
			switch(day) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			}
		}else {
			System.out.println("you entered wrong number");
		}

	}

}

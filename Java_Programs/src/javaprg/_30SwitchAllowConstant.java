package javaprg;

public class _30SwitchAllowConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15;
		 final int b=20;
		switch(a) {
		case 10:
			System.out.println("the value is 10");
			break;
		case 15:
			System.out.println("the value is 15");
			
		case b:
			System.out.println("the value is 20");
			break;
			default:
				System.out.println("no value there");
		}

	}

}

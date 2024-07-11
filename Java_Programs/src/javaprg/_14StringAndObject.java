package javaprg;

public class _14StringAndObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l=1000;
		Long x=Long.valueOf(l);//object
		String s=x.toString();//string
		Long z=Long.valueOf(s);//object
		System.out.println(z);

	}

}

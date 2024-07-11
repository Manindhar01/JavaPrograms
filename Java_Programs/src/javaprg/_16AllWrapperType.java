package javaprg;

public class _16AllWrapperType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;//primitive
		
		String b=Integer.toString(a);//string
		
		Integer c=new Integer(b);//object
		
		int d=c.intValue();//primitive
		
		Integer e=new Integer(d);//object
		
		String f=e.toString();//string
		
		int g=Integer.parseInt(f);//primitive
	}

}

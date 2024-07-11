package javaprg;

class NonStaticCons{
	{
		System.out.println("inside non static block");
	}
}

public class _05NonStaticWithoutConstructor {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NonStaticCons();
		new NonStaticCons();
		new NonStaticCons();
		System.out.println("inside main method");
		

	}

}

package javaprg;

public class _02StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main method");
		_02StaticMethod.method1();
		

	}
	static void method1() {
		System.out.println("Inside static method1");
	}
	static {
		System.out.println("Inside static block");
		_02StaticMethod.method1();
	}

}

package javaprg;



public class _04NonStaticMembers {
	int num;
	_04NonStaticMembers(){
		System.out.println("Inside Constructor");
	}
	{
		System.out.println("Non static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside a Main method");
		_04NonStaticMembers obj=new _04NonStaticMembers();
		//new _04NonStaticMembers();
		//new _04NonStaticMembers();
		obj.dosomething();

	}
	static {
		System.out.println("Inside static block");
	}
	
	void dosomething(){
		System.out.println("inside non static method");
	}

}

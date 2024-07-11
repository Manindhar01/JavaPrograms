package javaprg;

class Demo{
	
static Demo obj;
	
	static {
		System.out.println(Demo.obj);
		Demo.obj=new Demo();
		
	}
}

public class _08CreateStaticReferenceDirectly {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Demo.obj);

	}

}

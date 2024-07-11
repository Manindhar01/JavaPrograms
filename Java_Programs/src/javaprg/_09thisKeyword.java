package javaprg;

public class _09thisKeyword {
	
	int x;
	_09thisKeyword(){
		System.out.println(this);
		System.out.println(this.x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _09thisKeyword();
		new _09thisKeyword();

	}

}

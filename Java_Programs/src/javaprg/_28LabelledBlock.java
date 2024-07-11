package javaprg;

public class _28LabelledBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		System.out.println("block begin");
		f:{
			if(x==10) {
				break f;
			}
			System.out.println("block end");
		}
		System.out.println("outside block");

	}

}

package javaprg;

public class _34StringReverse {
	
	public String firstway(String actual) {
		String reversed=" ";
		for(int i=actual.length();i>0;i--) {
			reversed=reversed+actual.charAt(i-1);
		}
		return reversed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Sanjay";
		_34StringReverse sr=new _34StringReverse();
		System.out.println(sr.firstway(str));
		

	}

}

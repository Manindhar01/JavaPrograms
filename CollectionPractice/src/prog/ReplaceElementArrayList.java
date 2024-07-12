package prog;

import java.util.ArrayList;

public class ReplaceElementArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		System.out.println("before replace element:"+al);
		System.out.println("after replace element:"+al.set(2,"E"));
		System.out.println(al);

	}

}

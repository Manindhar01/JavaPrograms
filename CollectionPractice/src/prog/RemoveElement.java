package prog;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(1);
		al.add(2);
		System.out.println("Array list before removed"+al);
		al.remove(1);
		System.out.println("Array List after removed"+al);

	}

}

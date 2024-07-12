package prog;

import java.util.ArrayList;

public class CompareTwoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al1=new ArrayList<>();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		ArrayList<Integer> al2=new ArrayList<>();
		al2.add(4);
		al2.add(2);
		al2.add(3);
		al2.add(1);
		
		if(al1.equals(al2)) {
			System.out.println("Array List is equal");
		}else {
			System.out.println("Array List Not Equal");
		}
		

	}

}

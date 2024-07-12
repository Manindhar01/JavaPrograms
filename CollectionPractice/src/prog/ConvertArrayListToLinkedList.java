package prog;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertArrayListToLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<>();
		al.add(22);
		al.add(55);
		al.add(99);
		al.add(33);
		System.out.println("Values of ArrayList="+al);
		LinkedList<Integer> ll=new LinkedList<>();
		ll.addAll(al);
		System.out.println("Values of linked list="+ll);

	}

}

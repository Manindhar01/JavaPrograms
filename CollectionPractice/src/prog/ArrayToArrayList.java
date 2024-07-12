package prog;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,3,4,5,8};
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			al.add(arr[i]);
		}
		System.out.println("ArrayList Value is:"+al);

	}

}

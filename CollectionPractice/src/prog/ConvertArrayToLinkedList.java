package prog;

import java.util.LinkedList;

public class ConvertArrayToLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4};
		LinkedList<Integer> ll=new LinkedList<>();
		for(int i=0;i<arr.length;i++) {
			ll.add(arr[i]);
		}
		System.out.println("Arry to Linked List:"+ll);

	}

}

package prog;

import java.util.Collections;
import java.util.HashSet;

public class ConvertArrayToHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			hs.add(arr[i]);
		}
		System.out.println(hs);

	}

}

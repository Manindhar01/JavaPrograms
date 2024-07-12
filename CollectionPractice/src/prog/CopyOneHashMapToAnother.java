package prog;

import java.util.Collections;
import java.util.HashMap;

class CopyOneHashMapToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm1=new HashMap<>();
		hm1.put("A", 1);
		hm1.put("B", 2);
		hm1.put("C", 3);
		System.out.println(hm1);
		HashMap<String,Integer> hm2=new HashMap<>(hm1);
		

	}

}

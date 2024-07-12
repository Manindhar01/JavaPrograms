package prog;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfWordHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Alise is a girl bob is a boy";
		Map<String,Integer> m=new HashMap<>();
		String[] words=s.split(" ");
		for(String word:words) {
			Integer integer=m.get(word);
			if(integer==null)
				m.put(word, 1);
		else {
			m.put(word, integer+1);

		}

	}
		System.out.println(m);
		
	
	}
}

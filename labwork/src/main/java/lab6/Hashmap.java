package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>bookno=new HashMap<Integer,String>();
		bookno.put(1, "saikrishna");
		bookno.put(2,"nanda");
		bookno.put(3, "bhagath");
		bookno.put(4, "shiva");
		Set<Entry<Integer,String>> value1=bookno.entrySet();
		for(Entry<Integer, String> e: value1) {
			System.out.println( e.getValue());
		}
		

	}

}

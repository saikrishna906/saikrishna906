package lab6;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class Exercise1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer>hash=new HashMap<String,Integer>();
		hash.put("one", 1);
		hash.put("two", 2);
		hash.put("ten", 10);
		hash.put("seven", 7);
		hash.put("eighteen", 18);
		hash.put("seventy one", 71);
		
	List<Entry<String,Integer>>list=new LinkedList<Entry<String,Integer>>(hash.entrySet());
	Collections.sort(list,new Comparator<Entry<String,Integer>>(){
		@Override
		public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
			// TODO Auto-generated method stub
			return arg0.getValue().compareTo(arg1.getValue());
		}
	});
	for (Entry<String,Integer>item:list) {
		System.out.println(item);
	}
	
	
}
}
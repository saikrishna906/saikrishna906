package lab6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Exercise6 {
	
	public static List<Integer> votersList(Map<Integer, Integer> m1) {
		// TODO Auto-generated method stub
		List<Integer>l1=new ArrayList<Integer>();    //Creating list l1 for output
		Set<Entry<Integer,Integer >> s1=m1.entrySet();     //set s1=m.entrySt();
		for(Entry<Integer,Integer > x:s1) {
			if(x.getValue()>18) {                      
				l1.add(x.getKey());
			}
		}
		
		return l1;
	}

	
	
	public static void main(String[] args) throws Exception, Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//String x=br.readLine();
		// TODO Auto-generated method stub
		//System.out.println(":");
		Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
		for(int i=0;i<3;i++) {
			System.out.println("Enter the id,Enter the age:");
			m1.put(Integer.parseInt(br.readLine()),Integer.parseInt(br.readLine()));
		}
		System.out.println(votersList(m1));
		
		
		
	}

	

}

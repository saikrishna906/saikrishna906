package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example4 {
	//public HashMap<Integer,String> m2;
	
	private static Map<Integer, String> studentsMedals(Map<Integer, Integer> m1) {
		// TODO Auto-generated method stub
		
		//HashMap<Integer,String> m3 = null;
		Map<Integer,String> m2=new HashMap<Integer,String>() ;                   // Creating M2 set
		
		
		Set<Entry<Integer,Integer >> s1=m1.entrySet();                        // making Set s1 through Map m1
		for(Entry<Integer, Integer> i:s1) {
			if(i.getValue()>=90) {
				m2.put(i.getKey(),"Gold");
			}
			else if(i.getValue()>=80 && i.getValue()<90) {
				m2.put(i.getKey(),"silver");
			}
			else if(i.getValue()>=70 && i.getValue()<80) {
				m2.put(i.getKey(),"bronze");
			}
			else if(i.getValue()>=25 && i.getValue()<60)
			{
				m2.put(i.getKey(),"pass");
			}
			else
			{
				m2.put(i.getKey(),"RETAKE");
			}
			
		}
		
		return m2;
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
		m1.put(20210601,90);
		m1.put(20210602,80);
		m1.put(20210603,70);
		m1.put(20210604,65);
		m1.put(20210608,55);
		System.out.println(studentsMedals(m1));

	}

	
}

package lab6;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {
	
	public static void countChar(char[] xyz) {
		Map<Character,Integer>m1=new HashMap<>();
		for(Character x:xyz) {
			Integer count=m1.get(x);
			if (count==null) {
				count=0;
			}
			count++;
			m1.put(x,count);
			}
		System.out.println(m1);
	}
	
	
	public static void main(String[] args) {
		char[] xyz=new char[] {'a','b','c','a','d',};
		countChar(xyz);
	}
}
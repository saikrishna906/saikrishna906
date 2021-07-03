package lab6;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {
	
	
	private static Map<Integer, Integer> Squares(int[] arr) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> m1=new HashMap<Integer,Integer>();
		for(int i:arr) {
			m1.put(i,i*i);
		}
		
		return m1;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		System.out.print(Squares(arr));

	}

	
}

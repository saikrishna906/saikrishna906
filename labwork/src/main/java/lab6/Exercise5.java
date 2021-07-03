package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise5 {
	
	private static int getSecondSmallest(List<Integer> l1) {
		// TODO Auto-generated method stub
		
		Collections.sort(l1);
		System.out.println(l1);
		
		return l1.get(1);
	}

	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer>l1=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			l1.add(i);
		}
		l1.add(2);
		System.out.println("Elements before sort");
		//for(int i:l1) {
			System.out.println(l1);
		//}
		System.out.println("Elements After sort");
		System.out.println(getSecondSmallest(l1));

	}

	
}

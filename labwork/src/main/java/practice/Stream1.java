package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Stream1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>l1=new ArrayList<Integer>();
		for(int i=5;i<50;i++) {
			l1.add(i);
		}
		System.out.println(l1);
		System.out.println(l1.stream().reduce(0,(c,e)->c+e));
		System.out.println(l1.stream().reduce(0, (c, e) -> c * e));/*
																	 * // int c=0; for(int e: ll) { c+=e; }
																	 */
		System.out.println(l1.stream().map(i->i*3).findFirst());
		l1.forEach(i->System.out.print(i+" "));
		Set<Integer>L2=l1.stream().map(i->i*3).collect(Collectors.toSet());
		List<Integer>l3=l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		Map<Object, Object>l4=l1.stream().collect(Collectors.toMap(i->i*2, i->i*4));
		System.out.println("");
		System.out.println("set:");
		System.out.println(L2);
		System.out.println("List");
		System.out.println(l3);
		System.out.println("Map");
		System.out.print(l4);
		
		
		
		
		
		

	}

	/*
	 * @Override public String toString() { return "Stream1 [getClass()=" +
	 * getClass() + ", hashCode()=" + hashCode() + ", toString()=" +
	 * super.toString() + "]"; }
	 */
}

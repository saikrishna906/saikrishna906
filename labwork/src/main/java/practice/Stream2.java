package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Stream2 {
	private static Set<Stream2_1> m2(List<Stream2_1> m1) {
		// TODO Auto-generated method stub
		
		Set<Stream2_1>s1=m1.stream().filter(i->i.z>=7).collect(Collectors.toSet());
		//Set<String>s2=s1.stream().forEach(i->i.y);
		return s1;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Stream2_1>m1=new ArrayList<Stream2_1>();
		m1.add(new  Stream2_1(5,"ä",6f));
		m1.add(new Stream2_1(6,"b",7f));
		m1.add(new Stream2_1(7,"c",8f));
		System.out.println(m2(m1));

	}

	
}


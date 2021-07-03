package com.doselect;
import java.util.HashSet;
import java.util.Set;
public class HashsetImplementation {
	public static Set<Integer> unionofelements(Set<Integer> s1, Set<Integer>s2){
		Set<Integer> x=new HashSet<Integer>();
		x.addAll(s1);
		x.addAll(s2);
		return x;
	}
	public static Set<Integer> subractionofelements(Set<Integer> s1, Set<Integer>s2){
		Set<Integer> w=new HashSet<Integer>();
		w.addAll(s1);
		Set<Integer> v=new HashSet<Integer>();
		v.addAll(s2);
		w.removeAll(v);
		return w;
	}
	public static Set<Integer> intersectionofelements(Set<Integer> s1, Set<Integer>s2){
		Set<Integer> y=new HashSet<Integer>();
		Set<Integer> z=new HashSet<Integer>();
		y.addAll(s1);
		z.addAll(s2);
		y.retainAll(z);
		return y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer>s1=new HashSet<Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		Set<Integer>s2=new HashSet<Integer>();
		s2.add(3);
		s2.add(4);
		s2.add(5);
		System.out.println(unionofelements(s1,s2));
		System.out.println(subractionofelements(s1,s2));
		System.out.println(intersectionofelements(s1,s2));
	}
}

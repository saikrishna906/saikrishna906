package com.doselect;

import java.util.ArrayList;
import java.util.List;

public class Studentimplemenation {
	public static long countstudents(List<Studentsreport> list) {
		//long count=list.stream().filter(i->i.getScore()>70).count();
		
		return list.stream().filter(i->i.getScore()>70).count();
		
	}
	public List<String> getname(List<Studentsreport>list){
		List<String>x=list.stream().map(i->i.getFirstname())
		
		
		
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Studentsreport> list = new ArrayList<Studentsreport>();
		list.add(new Studentsreport("saikrishna","pasuparthi",72));
		list.add(new Studentsreport("shiva","unkown",27));
		list.add(new Studentsreport("bhagath","gorgella",73));
		list.add(new Studentsreport("nanda","mikeoff",100));
		
		System.out.println(countstudents(list));
		
		

	}

}

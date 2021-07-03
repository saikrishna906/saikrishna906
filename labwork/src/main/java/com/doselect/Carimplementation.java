package com.doselect;

import java.util.ArrayList;
import java.util.List;

public class Carimplementation {
	public static double sumofprices(List<CarStory> carlist) {
		double x=0;
		for(CarStory i:carlist) {
			 x =x+ i.getVariable();
		}
		return x;	
	}
	public static List<String> carListnames(List<CarStory> carlist){
		List<String> x=new ArrayList<String>();
		for(CarStory i:carlist) {
			x.add(i.getName());
		}	
		return x;
	}
	public static double maxprice(List<CarStory>carList) {
		double x=0;
		for(CarStory i:carList) {
			if(x<i.getVariable()) {
				x=i.getVariable();
				
			}
		}	
		
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<CarStory> carlist= new ArrayList<CarStory>();
		carlist.add(new CarStory("krishna","benz",555.5));
		carlist.add(new CarStory("bhagath","maruthi",556.5));
		carlist.add(new CarStory("nanda","swift",557.5));
		
		System.out.println(sumofprices(carlist));
		System.out.println(carListnames(carlist));
		System.out.println(maxprice(carlist));
	}

}

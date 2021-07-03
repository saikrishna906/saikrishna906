package com.doselect;
public class Fitdos {
	public static float weight(String str) {
		String[] a=str.split("@");
		String[] b=a[0].split("-");
		String x=b[0]+"."+b[1];
		float y=Float.parseFloat(x);
		
		return y;	
	}
	public static float height(String str) {
		String[] a=str.split("@");
		String[] b=a[1].split("-");
		String  x=b[0]+"."+b[1];
		float y=Float.parseFloat(x);
		return y;
		
	}
	public static float Bmi(float height,float weight) {
		
		float BMI=weight/(height*height);
		return BMI;
		
	}
	public static String checkstatus(float bmi) {
		if(bmi>20 && bmi<24) {
			return "nourshied";
		}
		return "mainnourshied";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(weight("68-45@1-78"));
		System.out.println(height("68-45@1-78"));
		
		System.out.println(Bmi(new Fitdos().height("68-45@1-78"),new Fitdos().weight("68-45@1-78")));
		System.out.println(checkstatus(new Fitdos().Bmi(new Fitdos().height("68-45@1-78"),new Fitdos().weight("68-45@1-78"))));
		
	}

}

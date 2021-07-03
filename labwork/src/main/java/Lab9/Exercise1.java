package Lab9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.BiFunction;
import java.lang.Math;

public class Exercise1 {
	public static void power(int x1,int y1, lab_9 la) {
		System.out.println(la.operate(x1, y1));
	}
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		power(4,2,(int x,int y)->{ return (int) (Math.pow(x, y));});
		power(8,6,(int x,int y)->{return (int) (5*6);});
		power(100,10,(int x,int y)->{return (int)(x/y);});
		

	}

}

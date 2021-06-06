package labwork3;
import java.io.BufferedReader;
import java.io.*;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
//import java.util.StringBuffer;


public class Exercise2 
{ 	static void getImage(String a) {
		
		StringBuilder sb=new StringBuilder(a);
		System.out.println(sb+"|"+sb.reverse());
		
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine().toUpperCase();
		getImage(s);

	}

}

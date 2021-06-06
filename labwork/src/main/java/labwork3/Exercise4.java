package labwork3;
import java.util.*;
import java.io.*;

public class Exercise4 {
	public static void modifynumbers(String s) {
		int y=0;
		int m=Character.getNumericValue(s.charAt(s.length()-1));
		for (int i=0;i<s.length()-1;i++) {
			int x=Character.getNumericValue((s.charAt(i)))-Character.getNumericValue(s.charAt(i+1));
			//System.out.println(x+1);
			if (x<0) {
				x=x+(-2*x);
				//System.out.println(x);
			}
			 y=y*10+x;
		}
		System.out.println(y*10+m);
		    
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		modifynumbers(s);
		
		

	}

}

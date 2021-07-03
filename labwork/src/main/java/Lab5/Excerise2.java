package Lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Excerise2 {
	
	
	
	public static void main(String[] args)throws NullException, IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		try {
		if(s.equals("")) {
			//throw new NullException("krishna");
			throw new NullException("Krishna");
		}
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		
		
	}


}

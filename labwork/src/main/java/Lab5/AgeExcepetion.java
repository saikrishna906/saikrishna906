package Lab5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

public class AgeExcepetion {

	public static void main(String[] args) throws ArithmeticException4, IOException {
		// TODO Auto-generated method stub
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    String s=br.readLine();
	     	int age=Integer.parseInt(s);
	     	try {
	     	if (age<15) {
	     		throw new ArithmeticException4(" Age of a person should be above 15.");
	     	}
	     	}
	     	catch(ArithmeticException e){
	     	     System.out.println(e);	
	     	}
		
	}

}

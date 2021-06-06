package Lab5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

public class AgeExcepetion {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    String s=br.readLine();
	     	int age=Integer.parseInt(s);
	     	if (age<15) {
	     		throw new ArithmeticException(" Age of a person should be above 15.");
	     	}
		
	}

}

package Lab5;

import java.util.Scanner;

public class Èxercise3 {

	public static void main(String[] args)throws Exception,Salaryexception {
		// TODO Auto-generated method stub`
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		try {
		if(x<5000) {
			throw new Salaryexception("Workhard");
		}
		}
		finally {
			sc.close();
		}
		

	}

}

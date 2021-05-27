package labday5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ncubesum {
	public static int sum(int n) {
		int s=0;
		while (n>0) {
			int r=n%10;
			s=s+(r*r*r);
			n/=10;
		}
		return s;
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("enter the number =");
		String b1=br.readLine();
		int a=Integer.parseInt(b1);
		System.out.println("sum of the cubes of given digit="+ sum(a));
		

	}

}

package classday2;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("enter the required factorial number n=");
		int n=sc.nextInt();
		int x=1;
		while (n>0) {
			x=x*n;
			n=n-1;
		}
		System.out.print("the factorial of given number is ="+x);
		

	}

}

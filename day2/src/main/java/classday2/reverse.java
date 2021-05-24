package classday2;
import java.util.Scanner;


public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the input number n=");
		int n=sc.nextInt();
		int x=0;
		while(n>0) {
			int r= n%10;
			x=x+r;
			x=x*10;
			n=n/10;
		}
		System.out.println("the reverse of input n is ="+x/10);
		
		

	}

}

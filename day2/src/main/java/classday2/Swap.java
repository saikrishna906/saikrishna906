package classday2;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter 1st variable a=");
		int a=sc.nextInt();
		System.out.print("enter 2nd variable b=");
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("a="+a+"\n");
		System.out.print(" b="+b);

	}

}

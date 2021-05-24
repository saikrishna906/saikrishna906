package classday2;
import java.util.Scanner;

public class Cubenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.print("enter the number between 1 to 10 for the cube of the number n=");
		int n =sc.nextInt();
		if (n>=1 && n<=10) {
			System.out.println("the cube of the given number "+n+"is ="+n*n*n);
		}
		else {
			System.out.println("enter the number in a given limit");
		}

	}

}

package classday2;
import java.util.Scanner;

public class Circlearea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the radius of the given circle r=");
		int r=sc.nextInt();
		System.out.println("The area of the given circle is ="+(float) (Math.PI*r*r));

	}

}

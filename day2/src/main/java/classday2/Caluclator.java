package classday2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Caluclator {
	int addition(int i, int j) {
		return i+j;
	}
	void subraction (int i,int j) {
		System.out.println(i-j);
	}
	static int multiplication(int i ,int j) {
		return i*j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss= "y";
		while(ss.equals("y")) {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Scanner sc=new Scanner(System.in);
			System.out.println("enter i  value=");
			int i=sc.nextInt();
			System.out.println("enter j  value=");
			int j=sc.nextInt();
			System.out.println("enter your choice \n 1)Addition \n 2)subraction \n 3)multiplication b3=");
			int k=sc.nextInt();
			Caluclator c=new Caluclator();
			switch (k) {
			case 1 :System.out.println(c.addition(i, j));
			break;
			case 2: c.subraction(i, j);
			break;
			case 3: System.out.println(multiplication(i, j));
			break;
			
			
			
			}
			
			
			
		}
		
		

	}

}

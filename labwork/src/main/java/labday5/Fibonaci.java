package labday5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonaci {
	public static void recursive(int a,int b) {
		//System.out.println(a);
		while (b<10) {
			System.out.println(a);
			int k=a;
			a=b;
			b=a+k;
		
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int a=Integer.parseInt(s);
		String b1=br.readLine();
		int b=Integer.parseInt(b1);
		//Fibonaci x=new Fibonaci();
		recursive(a,b);
		
		

	}

}

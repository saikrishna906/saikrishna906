package labday5;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Checknumber {
	public static void checknumber(int n) {
		int x = 0;
		while(n>0) {
			int cr=n%10;
			n/=10;
			if (cr<n%10) {
				x=1;
			}
		}
		if (x==1) {
			System.out.println("Digits are not increasing");
		}
		else {
			System.out.println("Digits are increasing");
		}
			
			
	}

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int n=Integer.parseInt(s);
		checknumber(n);
		

	}

}

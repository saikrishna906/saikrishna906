package labday5;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sumwith35 {
	public static int sum(int n) {
		int sum=0;
		while (n>0)
		{
			if (n%3==0 || n%5==0) {
					sum+=n;
			}
			n--;
		}
		return sum;
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader x= new BufferedReader(new InputStreamReader(System.in));
		String b=x.readLine();
		int a =Integer.parseInt(b);
		
		System.out.println(sum(a));

	}

}

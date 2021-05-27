package labday5;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Checknumberpow2 {
	public static void checknumber(int n) {
		while(n>0) {
			if (n%2!=0) {
				System.out.println("no");
				break;
			}
			else {
				if (n==2) {
				   System.out.println("yes");
				   break;
				}
				n/=2;
			}
			
		}
		
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		int n=Integer.parseInt(s);
		checknumber(n);

	}

}

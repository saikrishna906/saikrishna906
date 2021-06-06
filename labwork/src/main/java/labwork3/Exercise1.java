package labwork3;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise1 {
	static int stringsum(String s) {
		StringTokenizer st=new StringTokenizer(s);
		int n=0;
		while (st.hasMoreTokens()) {
			int x=Integer.parseInt(st.nextToken());
			n+=x;
		}
		return n;
		
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the string only digits with base 10 = ");
		String s=br.readLine();
		System.out.println(stringsum(s));
	}
	

}

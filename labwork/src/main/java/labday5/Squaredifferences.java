package labday5;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Squaredifferences {
	public  int CaluclateDifference(int n) {
		int tot=0;
		int tot1=0;
		while (n>0) {
			tot+=n;
			tot1+=(n*n);
			n--;
		}
		return tot1-(tot*tot);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		String y=x.readLine();
		int b=Integer.parseInt(y);
		Squaredifferences a=new Squaredifferences();
		System.out.println(a.CaluclateDifference(b));
		

	}

}

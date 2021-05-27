package labday5;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primenumbers {
	public void printnumbers(int n) {
		if (n<=3) {
			for (int i=1;i<n;i++) {
				System.out.println(i);
			}
		}
		else {
			System.out.println("1"+"\n"+"2");
			for (int i=3;i<=n;i++) {
				int c=0;
				for (int m=2;m<i;m++) {
					if (i%m==0) {
						//System.out.println(i);
						//System.out.println("\n");
						c++;
					}
				}
				if (c==0) {
						System.out.println(i);
				 }
			}
		}
		
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader y=new BufferedReader(new InputStreamReader(System.in));
		String a=y.readLine();
        int n=Integer.parseInt(a);
		Primenumbers x=new Primenumbers();
		x.printnumbers(n);

	}

}

package lab2;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exercise2 {
	public static void sortstring(String[] str) {
		
		for (String k:str) {
			//System.out.println(k);
			if (k.length()%2==0) {
				for (int i=0;i<k.length()/2;i++) {
					String x=k.toUpperCase();
					System.out.println(x);
				}
			}
			else {
				
				System.out.println(0);
			}
			
			
		}
		
	}
	
	
	

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number of elements =");
		int a=Integer.parseInt(br.readLine());
		String [] s=new String[a];
		
		for (int i=0;i<a;i++) {
			System.out.println("enter the sting"+i+1+"=");
			s[i]=br.readLine();
		}
		sortstring(s);

	}

}

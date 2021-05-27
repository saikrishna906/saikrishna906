package labday5;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Trafficlights {
	public void trafficlights(int n) {
		if (n==1) {
			System.out.println("STOP");
		}
		else if(n==2){
			System.out.println("Ready");
		}
		else if(n==3){
			System.out.println("go");
		}
		else {
			System.out.println("enter the corect option");
		}
		
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.out.println("1)RED"+"\n"+"2)YELLOW"+"\n"+"3)GREEN"+"\n"+"chose the option=");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String b1=br.readLine();
		int a=Integer.parseInt(b1);
		Trafficlights x=new Trafficlights();
		x.trafficlights(a);
		
		
		

	}

}

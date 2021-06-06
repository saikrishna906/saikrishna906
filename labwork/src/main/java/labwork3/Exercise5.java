package labwork3;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Exercise5 {
	public static void count(String s) {
		int m=0;
		int n=0;
		String[] l=s.split("\\s");
		
		char a;
		for (int i=0;i<s.length();i++) {
			char k=s.charAt(i);
		    boolean x=Character.isDigit(k);
		    if (x) {
			   m++;
		    }
		    else {
		    	//int m1=Character.compare(k,a);
		    	//if ()
			     n++;
		     }
		}
		System.out.println("number of integers="+m+","+"number of charecters="+(n-(l.length-1))+","+"number of spaces="+(l.length-1));
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		count(s);

	}

}

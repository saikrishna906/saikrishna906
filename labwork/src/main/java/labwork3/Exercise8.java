package labwork3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Exercise8 {
	
	
	private boolean sort(String s) {
		// TODO Auto-generated method stub
		char sorteds[]=s.toCharArray();
		Arrays.sort(sorteds);
		for (int i=0;i<s.length()-1;i++) {
			if (sorteds[i]!=s.charAt(i)) {
				return false;
			}
		}
	
		return true;
	
	}


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		String s=b.readLine();
		Exercise8 ob=new Exercise8();
		System.out.println(ob.sort(s));
		
	}
}

package lab2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Exercise4 {
	
	private void RemoveDuplicates(String[] s) {
		// TODO Auto-generated method stub
		int k=0;
		String[] latest=new String[s.length-1];
		Arrays.sort(s);
		for(int i=0;i<s.length-1;i++) {
				if(s[i]!=s[i+1]) {
				//if(s[i]==s[j]) {
					latest[k++]=(s[i]);
				  }//end if
				else {
					continue;		
				 }//end else
				//k++;
		  }//end for
		for (int m=0;m<latest.length-1;m++) {
			System.out.println(latest[m]);
		}
			
	}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.out.println("enter the number of strings=");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String br1=br.readLine();
		int total=Integer.parseInt(br1);
		String[] s=new String[total];
		 for(int i=0;i<total;i++) {
			 System.out.println("enter the element"+(i+1)+"=");
			 s[i]=br.readLine();
		 }
		 Exercise4 ob=new Exercise4();
		 ob.RemoveDuplicates(s);

	}
	

}

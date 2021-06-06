package lab2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter number of elements");
		String b1=br.readLine();
		int total=Integer.parseInt(b1);
		String[] list=new String[total];
		for (int i=0;i<total;i++) {
			System.out.println("enter the "+(i+1)+"string=");
			list[i]=br.readLine();
		}
		getsorted(list,total);
		
		
	}
//void getsorted method below

	private static void getsorted(String[] list,int total) {
		// TODO Auto-generated method stub
		
		for (int i=0;i<total;i++) {
			for (int j=i+1;j<total;j++) {
				if (list[i].compareTo(list[j])>0) {
					String temp=list[i];
					list[i]=list[j];
					list[j]=temp;
				}
			}
			
		}
		for (int i=0;i<total;i++) {
				System.out.println(list[i]);
			}
		
		
		
	}

}

package lab2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Exercise1 {
	public static void secondsmallest(int[] a) {
		Arrays.sort(a);
		System.out.println("the second smallest number in list is="+a[1]);
		

		
	}

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements=");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int arr[]=new int[a];
		for (int i=0;i<a;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		secondsmallest(arr);
		
		
		
		

	}

}

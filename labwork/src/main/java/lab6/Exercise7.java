package lab6;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise7 {
	
	private static List<Integer> getSorted(List<Integer> arr) {
		// TODO Auto-generated method stub
		List<Integer> l1=new ArrayList<Integer>();
		
		for(Integer i:arr) {
			int sum=0;
			while(i>0) {
			int r=i%10;
			sum=sum*10+r;
			i=i/10;
			}
			arr.remove(i);
			l1.add(sum);
		}
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		
		return l1;
	}

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("enter the number of arrays=");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		List<Integer> arr=new ArrayList<Integer>();
		for (int i=0;i<a;i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		System.out.println(arr);
		System.out.println("ok");
		System.out.println(getSorted (arr));		
	}

	
}

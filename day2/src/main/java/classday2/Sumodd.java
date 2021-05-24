package classday2;

public class Sumodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		for(int i=1;i<=99;i++) {
			if ( i%2!=0) {
				x=x+i;
				System.out.print("  "+i);
			}
		}
		System.out.println("\n"+ x);

	}

}

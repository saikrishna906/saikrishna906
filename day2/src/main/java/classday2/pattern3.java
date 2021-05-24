package classday2;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=3;i>=0;i--) {
			for (int j =i-1;j>=0;j--) {
				System.out.print("#");
			}
			for (int j=1;j<=3-i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}

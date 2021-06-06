package labwork4.Exercise1;

public class MainAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account[] ac=new Account[3];
		ac[0]=new Account(204416,4511,"krishna",2000);
		ac[1]=new SavingsAccount(204416,4511,"krishna",2000);
		ac[2]=new Currentaccount(204416,4511,"krishna",2000,1000);
		
		
		for (Account a:ac) {
			a.deposit();
			a.withdraw();
		}

	}

}

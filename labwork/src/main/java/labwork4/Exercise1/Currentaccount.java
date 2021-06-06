package labwork4.Exercise1;

public class Currentaccount extends SavingsAccount{

	public Currentaccount(long Accountnumber, double balence, String accountholder, double deposit,double withdraw) {
		super(Accountnumber, balence, accountholder, deposit);
		// TODO Auto-generated constructor stub
		this.withdraw=withdraw;
		
	}
	public void deposit() {
		System.out.println("Total amount"+balence);
	}
	public void withdraw() {
		System.out.println("withdraw="+withdraw);
		System.out.println("Total amount"+(balence-withdraw));
	}

}

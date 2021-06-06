package labwork4.Exercise1;

public class SavingsAccount extends Account{
	double withdraw;

	public SavingsAccount(long Accountnumber, double balence, String accountholder, double deposit) {
		super(Accountnumber, balence, accountholder, deposit);
		// TODO Auto-generated constructor stub
		this.withdraw=withdraw;
		
	}

	public void deposit() {
		System.out.println("deposit="+deposit);
		System.out.println("Total amount="+(balence+deposit));
	}
	public void withdraw() {
		System.out.println("Total amount"+balence);
	}

}

package labwork4.Exercise1;

public class Account {
	long Accountnumber;
	double balence;
	String accountholder;
	double deposit;
	public Account(long Accountnumber,double balence,String accountholder, double deposit){
		this.Accountnumber=Accountnumber;
		this.balence=balence;
		this.accountholder=accountholder;
		this.deposit=deposit;
		
	}
	public void deposit() {
		System.out.println("Total amount"+balence);
	}
	public void withdraw() {
		System.out.println("Total amount"+balence);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}

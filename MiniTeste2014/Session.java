package atm;

public class Session implements Countable {
	private ATM atm;
	private int transactions;
	public Session(ATM atm) {
		this.atm = atm;
		this.transactions = 0;
	}
	public ATM getATM() {
		return atm;
	}
	public void setATM(ATM atm) {
		this.atm = atm;
	}
	public void addTransaction(Deposit dep) {
		transactions++;
	}
	public void addTransaction(Withdrawal dep) {
		transactions++;
	}
	public int getCount() {
		return transactions;
	}
	@Override
	public int count() {
		// TODO Auto-generated method stub
		return transactions;
	}
	public boolean equals(Session ses) {
		return ses.getATM().getID() == this.atm.getID() 
				&& ses.getATM().getCity() == this.atm.getCity()
				&& ses.getATM().getDistrict() == this.atm.getDistrict();
	}


}

package atm;

public class Deposit {
	private ATM atm;
	private Session session;
	private Card card;
	private double amount;
	
	public Deposit(ATM atm, Session session,Card card, double amount) {
		this.atm = atm;
		this.session = session;
		this.card = card;
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}


	
}

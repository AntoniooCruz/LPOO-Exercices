package atm;

public class Withdrawal {
	private ATM atm;
	private Session session;
	private Card card;
	private double amount;
	
	public Withdrawal(ATM atm, Session session,Card card, double amount) {
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
	public String toString() {
		String str;
		str = "Withdrawal at ATM " + atm.getID() + " (" + atm.getCity() + ", " + atm.getDistrict() +") of " +  amount + "0";
		return str;
		
	}

}

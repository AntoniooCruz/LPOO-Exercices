package atm;

public class ATM {
	private int ID;
	private String city;
	private String district;
	
	public ATM(int id, String city, String district) {
		this.ID = id;
		this.city = city;
		this.district = district;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
	

}

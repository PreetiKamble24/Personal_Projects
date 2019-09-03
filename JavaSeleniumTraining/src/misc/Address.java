package misc;

public class Address {

	String streetname;
	String city;
	int pin;
	public Address(String streetname, String city, int pin) {
		super();
		this.streetname = streetname;
		this.city = city;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [streetname=" + streetname + ", city=" + city + ", pin=" + pin + "]";
	}
	
	
}

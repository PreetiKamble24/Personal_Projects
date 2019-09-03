package exceptionHandling;

public class AgeInvalidException extends Exception {

	int age;
	
	public AgeInvalidException(int g) {
	this.age=g;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Age is less than 18...i.e."+ this.age;
	}
}

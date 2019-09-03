package exceptionHandling;

public class AcceptAge implements AutoCloseable {
	int age;

	public AcceptAge() {
	this.age=45;
	}
	public void acceptingAge() throws AgeInvalidException{
		if(age<18)
		throw new AgeInvalidException(age);
		else
			System.out.println("Vote!!!");
	}
	@Override
	public void close() throws Exception {
		System.out.println("In AcceptAge close()...");
	}
}

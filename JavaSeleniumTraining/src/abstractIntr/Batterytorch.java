package abstractIntr;

public class Batterytorch implements Operations {

	boolean flag = true;
	
	@Override
	public boolean on() {
	this.flag = true;
		return flag;
	}

	@Override
	public boolean off() {
		this.flag= false;
		return flag;
	}

	
}

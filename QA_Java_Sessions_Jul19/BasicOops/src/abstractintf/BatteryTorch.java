package abstractintf;

public class BatteryTorch implements Operations {

	boolean flag=true;
	@Override
	public boolean on() {
		// TODO Auto-generated method stub
		this.flag=true;
		return flag;
	}

	@Override
	public boolean off() {
		this.flag=false;
		return flag;
	}

	public boolean getStatus(){
		return flag;
	}
}

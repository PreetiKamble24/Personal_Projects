package abstractintf;

public abstract class Shape {
	
	public Shape() {
	System.out.println("Inside shape const..");
	}
	abstract public float findArea();
	
	public void implementedMethod(){
		System.out.println("Inside parebt Shape...");
	}

}

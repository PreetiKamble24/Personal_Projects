package abstractintf;

public class Circle extends Shape {

	int rad;
	
	public Circle(int r) {
		
	this.rad=r;
	}
	
	@Override
	public float findArea() {
		
		return (3.14f)*rad*rad;
	}

	/*public void implementedMethod(){
		System.out.println("Circle implementation..");
	}*/
}

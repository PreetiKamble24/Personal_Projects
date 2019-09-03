package abstractIntr;

public class Circle extends Shape {

	int rad;
	float pi=3.15f;
	
	public Circle(int r){
		this.rad=r;
	}
	
	public void findArea(){
		float ar= pi*rad*rad;
		System.out.println(ar);
	}

//	public void implementMethod(){
//		System.out.println("defined in child class");
//	}
}


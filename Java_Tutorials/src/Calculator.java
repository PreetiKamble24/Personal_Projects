
public class Calculator {

	//method for addition
	public int add(int num1, int num2) // here num1 and num2 are called parameters
	{
		int result;
		result = num1 + num2;
		return result;
		
	}
	
	public int sub(int num1, int num2) // method for substraction
	{
		int result = num1 - num2; 
		return result;
		
	}
	
	public int div(int num1, int num2) // method for division
	{
		
		return num1 / num2;
		
	}
	
	public int multiply(int num1, int num2) // method for multiplication
	{
		
		return num1 * num2;
		
	}
	
	public static void main(String[] args) {
		
		//public static void main
		double num = Math.random()*10; // u can also do Math.random()*100
		System.out.println(num);
		
	}

}

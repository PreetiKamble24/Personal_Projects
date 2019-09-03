
public class IfElseCondition {

	public static void main(String[] args) {
	
		int num= (int)(Math.random()*20);
		System.out.println(num);
		
		if(num>12)
		{
			System.out.println(num + "Num is greater than 12");
			
		}
		else if(num<12 && num>6)
			System.out.println(num+" is between 12 and 6");
		else
			System.out.println(num+"is less than 12");
	}

}

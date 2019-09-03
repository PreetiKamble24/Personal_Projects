
public class boolean_datatype {

	public static void main(String[] args) {
		//boolean bol = true;
		
		//System.out.println(10>12);
		int First_no = 35;
		int second_no = 25;
		int third_no= 45;
		
		/*boolean result = 15 > 25;
		System.out.println(result);
		*/
		if( First_no< second_no && First_no<third_no)
		{
			System.out.println(First_no + "First number is less than "+ second_no + "and" + third_no );
			
		}else if (First_no > second_no || First_no > third_no){
			System.out.println(First_no + "First number is greater than "+ second_no + "and" + third_no );
		}
		
	}

}

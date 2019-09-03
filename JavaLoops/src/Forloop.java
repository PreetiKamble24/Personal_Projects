
public class Forloop {

	public static void main(String[] args) {
		
		/*for(int i=1; i<10; i++){
			System.out.println(i);
		}*/

		// even numbers
		/*for(int x=2; x<=20; x=x+2){
			System.out.println("Even numbers are" +x );
		}*/
		
	/*	for(int x=1; x<=10; x++){
			System.out.println("Table for 2:- "+ x*2);
		}*/
		
		/*for(int x=1; x<=10; x++){
			System.out.println("Table for 3:- "+ x*3);
		}*/
		
		//nested loops
		for (int table=1; table<=10; table++){
			System.out.println("Table of " + table);
			for(int a=1; a<10; a++){
				System.out.println(table + "*" + a + "=" + table*a);
			}
		if (table==3){
			break;
		}
			
		}
		
		
	}

}


public class TwoDArray {

	public static void main(String[] args){
		int rows=4;
		int cols=4;
		
		int table[][] = new int[rows][cols]; // declaration of 2D array
		
		//assigning values to the array
		table[0][0]=10;
		table[0][1]=11;
		table[0][2]=12;
		table[0][3]=13;
		
		table[1][0]=20;
		table[1][1]=21;
		table[1][2]=22;
		
		table[2][0]=30;
		table[2][1]=31;
		table[2][2]=32;
		
		table[3][0]=40;
		table[3][1]=41;
		table[3][2]=42;
		
		System.out.println(table.length); // thia gives rows length
		System.out.println(table[0].length); // this gives columns length
		
		System.out.println(table[3][3]);
		
		// to display complete 2D array
		for(int i=0; i<rows; i++){
			for( int j=0; j<cols; j++){
				System.out.print(" "+table[i][j]);
			}
			
			System.out.println(" ");
		}
		
	}
	
	}

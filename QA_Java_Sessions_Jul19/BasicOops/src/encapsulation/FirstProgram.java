package encapsulation;




public class FirstProgram {
	public static void main(String[] args) {
		int table_Value=Integer.parseInt(args[0]);
		//int s_Value=Integer.parseInt(args[1]);
		//for(int cnt=1;cnt<=10;cnt++)
			int cnt=1;
			do
			{
				System.out.println(table_Value+" * "+cnt+" = "+table_Value*cnt);
				cnt++;
			}while(cnt<=10);
	}

}

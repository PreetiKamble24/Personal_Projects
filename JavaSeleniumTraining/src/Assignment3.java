import java.util.Scanner;

public class Assignment3 {
	static int num1;
	static int mod;
	static int IntergerSum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number in between 0 to 1000");
		num1 = sc.nextInt();

		while(num1 >= 0 && num1<=1000)
		{
			mod = num1 % 10;
			IntergerSum = IntergerSum + mod;
			num1 = num1 / 10;
		}

		System.out.println("Sum of the Interger in given number is:" + IntergerSum);

		if (num1>1000)
		{
			System.out.println("Number is greater than 1000");

		}
		else if (num1<0)
		{
			System.out.println("Number cant be less than 0");
		}
		sc.close();
	}
}
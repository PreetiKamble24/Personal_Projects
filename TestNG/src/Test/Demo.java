package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo {

	@Test
	public void Personal_login(){
		System.out.println("Hello");
	}
	
	@Test
	public void Personal_app(){
		System.out.println("second test");
	}
	
	@Test(dataProvider="getdata")
	public void Mobile_Personal_signin(String username, String password){
		System.out.println("Personal - Sign in");
		System.out.println(username);
		System.out.println(password);
	}
	@Test
	public void Mobile_Personal_signout(){
		System.out.println("Mobile Personal - Sign out");
	}
	@Test
	public void Mobile_Personal_home(){
		System.out.println("Mobile Personal - home");
	}
	@Test
	public void API_Personal_signin(){
		System.out.println("API Personal - Sign in");
	}
	@Test
	public void API_Personal_signout(){
		System.out.println("API Personal - Sign out");
	}
	
	@DataProvider
	public Object[][] getdata(){
		Object[][] data = new Object[2][2];
		//1st good history data
		data[0][0]= "firstname";
		data[0][1]="firstpwd";
		
		//2nd fraudulent history data
		data[1][0]= "secondname";
		data[1][1]= "secondpwd";
		return data;
	}
}

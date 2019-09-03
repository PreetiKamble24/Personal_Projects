package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PL1 {

	@Parameters({"URL"})
	@Test(groups={"smoke"})
	public void Personal_login(String urlname){
		System.out.println("Smoke-PL1 test");
		System.out.println(urlname);
	}
	
	@Test
	public void Personal_app(){
		System.out.println("PL1-2 test");
	}
	
}

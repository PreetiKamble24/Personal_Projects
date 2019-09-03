package Test;

import org.testng.annotations.Test;

public class Carloan {
		
		@Test(groups={"smoke"})
		public void Carloan_mobileLogin()
		{
			System.out.println("Smoke-This is Mobile login");
		}
		
		@Test
		public void Carloan_APILogin()
		{
			System.out.println("This is API login");
		}
		@Test(groups={"regression"})
		public void Carloan_mobile_model()
		{
			System.out.println("This is Mobile login");
		}
		@Test(groups={"regression"})
		public void Carloan_mobileBrand()
		{
			System.out.println("This is Mobile login");
		}
	}
	
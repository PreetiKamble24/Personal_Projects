import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Elementenabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.findElement(By.id("Div1")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		// System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
			
		try{
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {

			System.out.println("Button is disabled");
			Assert.assertTrue(true);
		} else {

			System.out.println("Button is enabled");
			Assert.assertTrue(false);
		}}
		finally{
		driver.close();
		}
	}

}

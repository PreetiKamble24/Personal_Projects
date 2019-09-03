import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Dynamicdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		//checkbox selection code
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		// this step expects false to be returned as we are using assertFalse() method.
		//similarly assertTrue() expects only True to be returned. thus if it gets 'True' value our test will fail
		//thus we can use this for asserting an expectation of only 'False' or 'True'
		Assert.assertEquals(driver.findElement(By.cssSelector("label[for*='ctl00_mainContent_chk_friendsandfamily']")).getText(), "Family and Friends");
		//System.out.println(driver.findElement(By.cssSelector("label[for*='ctl00_mainContent_chk_friendsandfamily']")).getText());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='PNQ']")).click();
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		driver.findElement(By.xpath("(//a[@value='GWL'])[2]")).click();
		driver.close();
		
	}

}

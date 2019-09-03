 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class customxpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chorme.driver", "c:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://qa-test.trustingsocial.com/login");
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("testteamlead");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Pass");
//		driver.findElement(By.xpath("//button[contains(@class,'formControlMargin')]")).click();
//		driver.close();
		
//		driver.get("https://qa-test.trustingsocial.com/login");
//		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("test");
//		//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("pass");
//		driver.findElement(By.cssSelector("#password")).sendKeys("pass");
//		driver.findElement(By.cssSelector("button[type*='submit']")).click();
//		System.out.println(driver.findElement(By.xpath("//div[@class='FormHolderMsgControls']")).getText());
		
		
		driver.get("https://www.salesforce.com");
		driver.findElement(By.xpath("//a[@href='https://login.salesforce.com/?locale=in']")).click();
		driver.findElement(By.cssSelector("#username")).sendKeys("test");
		//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("pass");
		driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("pass");
		driver.findElement(By.cssSelector(".button.r4.wide.primary")).click();
		//String text = driver.findElement(By.cssSelector(".loginError")).getText();
		String text = driver.findElement(By.xpath("//div[@id='error']")).getText();
		System.out.println(text);
		driver.close();
	}

}

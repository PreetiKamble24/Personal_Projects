import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class NavigateUrl {
	
	private static Object sendkeys;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "c:\\webdrivers\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://www.google.com/");
//		System.setProperty("webdriver.edge.driver", "c:\\webdrivers\\MicrosoftWebDriver.exe");
//		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com/"); // method used to hit url on browser
		System.out.println(driver.getTitle()); // method to validate if your page title is correct
		System.out.println(driver.getCurrentUrl()); //validate if you have landed on correct page
		//System.out.println(driver.getPageSource()); //print page source
		
		//driver.manage().window().maximize();
		//WebElement searchtext = driver.findElement(By.xpath("//div[2]/div/div[3]/center/input[1]"));
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		WebElement searchtext = driver.findElement(By.xpath("//button[@type='submit']"));
//		System.out.println(searchtext.isDisplayed());;
//		System.out.println(searchtext.getText());
		
//		WebElement searchbox = driver.findElement(By.xpath("//div[2]/div/div[1]/div/div[1]/input"));
//		searchbox.sendKeys("java");
//		searchbox.sendKeys(Keys.chord(Keys.SHIFT,"program"));
//		searchbox.submit();
//		searchbox.clear();
		driver.get("https://www.udemy.com");
		driver.navigate().back();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("this is first click"); 
		// sendkeys is used to enter text in the element identified
		//driver.findElement(By.linkText("Forgotten account?")).click(); //click and sendkeys are actions to be taken
		driver.findElement(By.id("pass")).sendKeys("123");
		
		System.out.println(driver.findElement(By.xpath("//*[@id='u_0_a']")).getText());
		driver.findElement(By.xpath("//*[@id='u_0_a']")).click();
		
//		driver.navigate().forward();
//		driver.navigate().refresh();
		driver.close();// closed current window
		//driver.quit(); // closes all the browsers opened by selenium script(closes all child windows)
	}

	private static Object sendkeys(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}

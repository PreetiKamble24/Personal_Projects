import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		Select a = new Select(driver.findElement(By.id("Adults")));
		a.selectByValue("3");
		Select c = new Select(driver.findElement(By.id("Childrens")));
		c.selectByValue("1");;
		Select i = new Select(driver.findElement(By.id("Infants")));
		i.selectByValue("2");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Spicejet");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='homeErrorMessage']")).getText());
		driver.close();
		
		}

}

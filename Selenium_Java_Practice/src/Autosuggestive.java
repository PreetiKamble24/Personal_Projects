import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		int count= driver.findElements(By.cssSelector(".tabsCircle.appendRight5")).size();
		System.out.println(count);
		
		for(int i=0; i<count;i++)
		{
			String text = (driver.findElements(By.xpath("//ul[@class='fswTabs latoBlack greyText']")).get(i).getText());
			System.out.println(text);
			if (text.equals("round trip"))
			{
				driver.findElements(By.xpath("//ul[@class='fswTabs latoBlack greyText']")).get(i).click();
			}			
		}

		driver.findElement(By.id("fromCity")).click();
		WebElement source = driver.findElement(By.cssSelector(".react-autosuggest__input.react-autosuggest__input--open"));
		source.sendKeys("mum");
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		
//		driver.findElement(By.id("toCity")).click();
//		WebElement destination = driver.findElement(By.xpath("//div[@class='react-autosuggest__container react-autosuggest__container--open']/input"));
//		//Thread.sleep(2000);
//		destination.clear();
//		destination.sendKeys("del");
//		destination.sendKeys(Keys.ARROW_DOWN);
//		destination.sendKeys(Keys.ENTER);
		driver.close();
		
	}

}

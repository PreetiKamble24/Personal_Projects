import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.get("https://www.cleartrip.com/");
//		driver.findElement(By.id("FromTag")).sendKeys("Pune");
//		driver.findElement(By.id("FromTag")).sendKeys(Keys.ENTER);
//		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		driver.findElement(By.id("ToTag")).sendKeys("ams");
//		//driver.findElement(By.id("DepartDate").s
//		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[1]/a")).click();
//		Select s=new Select(driver.findElement(By.id("Adults")));
//		s.selectByValue("1");
//		driver.findElement(By.id("SearchBtn")).click();
//		WebDriverWait d =new WebDriverWait(driver, 20);
//		d.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[@data-sort='airline']")));
//		driver.findElement(By.xpath("//a[@data-sort='airline']")).click();
		
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.xpath("//a[@href='javascript: void(0);loadAjax();']")).click();
		WebDriverWait d=new WebDriverWait(driver, 20);
		System.out.println(d.until(ExpectedConditions.visibilityOfElementLocated(By.id("results"))).getText());
		driver.close();
	}

}

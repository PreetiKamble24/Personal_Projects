import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:\\webdrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.id("divpaxinfo")).click();
		int i = 1;
		while (i<5){
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
//		driver.findElement(By.id("divpaxinfo")).click();
//
//		   Thread.sleep(2000L);
//
//		   /*int i=1;
//
//		while(i<5)
//
//		{
//
//		driver.findElement(By.id("hrefIncAdt")).click();//4 times
//
//		i++;
//
//		}*/
//
//		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//
//		for(int i=1;i<5;i++)
//
//		{
//
//		driver.findElement(By.id("hrefIncAdt")).click();
//
//		}
//
//		driver.findElement(By.id("btnclosepaxoption")).click();
//
//		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
//
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText(
//
		Select s= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("AED");
		s.selectByIndex(2);
		driver.close();
	}

}

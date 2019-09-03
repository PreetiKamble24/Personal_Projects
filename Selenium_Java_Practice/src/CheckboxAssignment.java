import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckboxAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
//		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
//		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		
//		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
//		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
//		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		WebElement check1= driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		check1.click();
		Assert.assertTrue(check1.isSelected());
		check1.click();
		Assert.assertFalse(check1.isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		driver.close();
	}

}

package selenium_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmt1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.nopcommerce.com/ ");
		driver.findElement(By.linkText("Electronics ")).click();
		
	}
}

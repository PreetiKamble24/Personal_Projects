import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
//		Actions a=new Actions(driver);
//		WebElement move=driver.findElement(By.id("nav-link-accountList"));
//		a.moveToElement(move).build().perform();
//		WebElement search_text=driver.findElement(By.id("twotabsearchtextbox"));
//		a.moveToElement(search_text).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
//		System.out.println("done");
//		//driver.close();
	
		
		driver.findElement(By.xpath("//a[@rel='noopener']")).click();
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parent_id=it.next();
		String child_id=it.next();
		driver.switchTo().window(child_id);
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}

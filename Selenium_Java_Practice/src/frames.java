import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		WebElement fr= driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(fr);
		driver.findElement(By.id("draggable")).click();
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		System.out.println(driver.getCurrentUrl());
		System.out.println(target.getText());	
		driver.switchTo().defaultContent(); // this step is used to switch back to window from frames
		//driver.close();
		
	}

}

package BULETAutomation;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling {
 public static void main(String args[]) throws Exception {
	 System.setProperty("webdriver.chrome.driver" ,"D:\\Hruthick softwares\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		driver.navigate().to("https://www.whatsapp.com/");
		WebElement wh = driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/div/section/div/div/div[1]/div/div/ul/li[1]/a/span[2]"));
		wh.click();
		String parent = driver.getWindowHandle();
		Set<String> ele =driver.getWindowHandles();
		Iterator<String> ele1 =ele.iterator();
		
		driver.switchTo().window(parent);
				
		
 }

}

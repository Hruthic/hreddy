package BULETAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seaarchbar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Hruthick softwares\\BLUE_T\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://dev.bluet.co:4200/e-commerce/after-login");
		WebElement Search =driver.findElement(By.xpath("//input[@placeholder=\"Search Product...\"]"));
		Search.sendKeys("marathon");
	    JavascriptExecutor js =(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].value, marathon");
		 if(Search.isEnabled())
		 {
			 System.out.println("Testcase passed");
			 
		 }
		 else {
			 System.out.println("Testcase failed");
			 
		 }
		 driver.findElement(By.xpath("//i[@class='uil uil-search']")).click();
		 
		 
	}

}




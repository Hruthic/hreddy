package BULETAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) {
		 {
			System.setProperty("webdriver.chrome.driver" ,"D:\\Hruthick softwares\\Java\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://dev.bluet.co:4200/");
			List<WebElement>links =driver.findElements(By.tagName("a"));
			System.out.println("The Links count:"+links.size());
			driver.getPageSource();
			for(WebElement link: links)
			{
				System.out.println("The count of the link " +link.getAttribute("value"));
			}
			driver.getPageSource();

	}

	}}

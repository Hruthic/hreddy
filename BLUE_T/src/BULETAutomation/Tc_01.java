package BULETAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc_01 {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver" ,"D:\\Hruthick softwares\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://dev.bluet.co:4200/");
	List<WebElement> button = driver.findElements(By.tagName("a"));
	System.out.println("The button count :" +button.size());
	for(WebElement Buttons:button) {
		System.out.println("The Buttons" +Buttons.getAttribute("value"));
		
	}

}}

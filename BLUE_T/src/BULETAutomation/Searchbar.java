package BULETAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchbar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Hruthick softwares\\BLUE_T\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().getImplicitWaitTimeout();
		driver.navigate().to("https://dev.bluet.co:4200/");
		driver.manage().window().maximize();
		WebElement searchbar = driver.findElement(By.xpath("//div[@class=\"input-group input-group-sm border rounded-sm\"]//input"));
		searchbar.sendKeys("Mara");
	
	if(searchbar.isEnabled()) {
			System.out.println("Test case passed");
		}
				
		else {
			System.out.println("Test case failed");
		}
		WebElement Searchbar1=driver.findElement(By.xpath("//div[@class=\"schResPCard__des card-body\"]//h4"));
			
	}
}


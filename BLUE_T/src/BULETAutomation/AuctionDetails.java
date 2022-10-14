package BULETAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuctionDetails {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Hruthick softwares\\New Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://dev.bluet.co:4200/auction");
		driver.manage().window().maximize();
		WebElement seller=driver.findElement(By.xpath("//a[text()='Seller']"));
		WebElement Auctions=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/ul/li[5]/a/span"));
		System.out.println("The Auctions is clicked");
		driver.findElement(By.xpath("//input[@placeholder='Enter Auction Title']")).sendKeys("test");
	driver.findElement(By.xpath("//label[normalize-space()='Auction Description']"));
	driver.findElement(By.xpath("//input[@placeholder='Enter Description']")).sendKeys("test1");
		System.out.println("The Title name is:" +driver.getTitle());
		
WebElement date = driver.findElement(By.xpath("//input[@id='time-date-01']"));


	}

}

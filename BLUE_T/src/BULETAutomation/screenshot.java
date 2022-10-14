package BULETAutomation;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

@SuppressWarnings("unused")
public class screenshot {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver" ,"D:\\Hruthick softwares\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://dev.bluet.co:4200/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		File fl = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(fl, new File("D:\\Hruthick softwares\\BLUE_T"));
		
	}

	

}

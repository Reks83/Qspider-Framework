package Food;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Morrisons_Test {
	@Test
	public void Morrisonss() {
		     WebDriverManager.chromedriver().setup();
	 		  WebDriver driver =new ChromeDriver();
	 		  driver.manage().window().maximize();
	 		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	         driver.get("https://groceries.morrisons.com/webshop/startWebshop.do");
	         driver.quit();
		 }

}

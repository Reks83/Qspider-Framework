package beauty;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Matalan_Test {
	 @Test
     public void Matalann() {
   	  WebDriverManager.chromedriver().setup();
 		  WebDriver driver =new ChromeDriver();
 		  driver.manage().window().maximize();
 		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
         driver.get("https://www.matalan.co.uk/");
         driver.quit();
	 }

}

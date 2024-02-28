package bags;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Michael_Test {
	@Test
    public void Mk() {
		 WebDriverManager.chromedriver().setup();
		  WebDriver driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get("https://www.michaelkors.co.uk/");
        driver.quit();
    }

}

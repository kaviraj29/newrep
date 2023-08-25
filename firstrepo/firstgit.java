package gitfirstrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firstgit {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://spm.sierradigitalinc.com/");
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(5000);

		driver.quit();		
		
		
		
	}

}

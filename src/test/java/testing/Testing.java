package testing;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testing {

	@Test
	//@Parameters({"user@phptravels.com", "demouser"})
	public void f() {
		ChromeOptions options =  new ChromeOptions();
		options.addArguments("start-maximized", "-disable--notifications");
		ChromeDriver d =  new ChromeDriver(options);
		d.get("https://phptravels.net/login");
		//Thread.sleep(2000);
//		WebElement findElement2 = d.findElement(By.name("email"));
//		findElement2.sendKeys(Uname);
//		WebElement findElement3 = d.findElement(By.name("password"));
//		findElement3.sendKeys(Upwd);
//		WebElement findElement = d.findElement(By.id("submitBTN"));
//		findElement.click();
		
	}
	
}

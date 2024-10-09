package CreditScore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E2e {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("username"));
		driver.findElement(By.name("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		WebElement element= driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message'])[1]"));
		String Actualmsg=element.getText();
		String expectedmsg="Required";
		if(Actualmsg.equals(expectedmsg)) {
			System.out.println("actual message matched with expected");
		}
		else {
		System.out.println("actual message not matched with expected");
		}
		driver.quit();
	}

}

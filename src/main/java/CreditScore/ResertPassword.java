package CreditScore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResertPassword {

	public static void main(String[] args) {
		
		
		
		//Login
		
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("url");
				driver.manage().window().maximize();
				

		//Password reset
				WebElement element4=driver.findElement(By.cssSelector("resetPassword"));
				element4.click();
				WebElement newpassword=driver.findElement(By.cssSelector("newpassword"));
				newpassword.sendKeys("radha123");
				WebElement reenterpassword=driver.findElement(By.cssSelector("reenterpassword"));
				reenterpassword.sendKeys("radha123");
				
		//login
				
				WebElement element=driver.findElement(By.id("s-first-name"));
				element.sendKeys("Radha");
				WebElement element1=driver.findElement(By.id("s-last-name"));
			    element1.sendKeys("pagadala");
			    WebElement element2=driver.findElement(By.id("password"));
			    element2.sendKeys("radha123");
				WebElement element3=driver.findElement(By.cssSelector("input[type='submit']"));
				element3.click();

				
				
				
				
	}

}

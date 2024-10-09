package CreditScore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("url");
		driver.manage().window().maximize();
		//valid credentials
		WebElement element=driver.findElement(By.id("s-first-name"));
		element.sendKeys("Radha");
		WebElement element1=driver.findElement(By.id("s-last-name"));
		element1.sendKeys("pagadala");
		WebElement element2=driver.findElement(By.id("password"));
		element2.sendKeys("radhapagadala123");
		WebElement element3=driver.findElement(By.cssSelector("input[type='submit']"));
		element3.click();
		//invalid
//		WebElement element=driver.findElement(By.id("s-first-name"));
//		element.sendKeys("radha123");
//		WebElement element1=driver.findElement(By.id("s-last-name"));
//		element1.sendKeys("pagadala12");
//		WebElement element2=driver.findElement(By.id("passworrd"));
//		element2.sendKeys("1234567890");
//		WebElement element3=driver.findElement(By.cssSelector("input[type='submit']"));
//		element3.click();
		
		//invalid(valid username + invalid password)
		//WebElement element=driver.findElement(By.id("s-first-name"));
//		element.sendKeys("radha");
//		WebElement element1=driver.findElement(By.id("s-last-name"));
//		element1.sendKeys("pagadala");
//		WebElement element2=driver.findElement(By.id("password"));
//		element2.sendKeys("1234567890");
//		WebElement element3=driver.findElement(By.cssSelector("input[type='submit']"));
		
		//invalid(invalid username + valid password)
//		WebElement element=driver.findElement(By.id("s-first-name"));
//		element.sendKeys("Radha123");
//		WebElement element1=driver.findElement(By.id("s-last-name"));
//		element1.sendKeys("pagadala123");
//		WebElement element2=driver.findElement(By.id("password"));
//		element2.sendKeys("radhapagadala123");
//		WebElement element3=driver.findElement(By.cssSelector("input[type='submit']"));
//		element3.click();
		
}
}

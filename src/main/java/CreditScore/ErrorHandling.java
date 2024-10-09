package CreditScore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorHandling {
	
	public static void main(String args[]) {
	//Login
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("url");
	driver.manage().window().maximize();
	
	WebElement element=driver.findElement(By.id("s-first-name"));
	element.sendKeys("Radha");
	WebElement element1=driver.findElement(By.id("s-last-name"));
    element1.sendKeys("pagadala");
    //Enter wrong password
    WebElement element2=driver.findElement(By.id("password"));
    element2.sendKeys("1234");
	WebElement element3=driver.findElement(By.cssSelector("input[type='submit']"));
	element3.click();
	
	//we will get incorrect password error
	
	WebElement ErrorMsg=driver.findElement(By.cssSelector("incorrectpasswordmsg"));
	String ErrorMessage=ErrorMsg.getAttribute("Value");
	System.out.println(ErrorMessage);
}
}

package CreditScore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataIntegrity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Login
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("url");
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.id("s-first-name"));
		element.sendKeys("Radha");
		WebElement element1=driver.findElement(By.id("s-last-name"));
	    element1.sendKeys("pagadala");
	    WebElement element2=driver.findElement(By.id("password"));
	    element2.sendKeys("radhapagadala123");
		WebElement element3=driver.findElement(By.cssSelector("input[type='submit']"));
		element3.click();
		
		//get already stored number from data base
		
		WebElement OldNumber= driver.findElement(By.id("number"));
		String OldNumberinDataBase=OldNumber.getAttribute("value");
		
		//Update phonenumber
		
		WebElement Updatenumber=driver.findElement(By.id("UpdateNumber"));
		Updatenumber.sendKeys("1234567890");
		WebElement Submit=driver.findElement(By.cssSelector("input[type='submit']"));
		Submit.click();
		if(Updatenumber.equals(OldNumberinDataBase)) {
			System.out.println("Number Not Updated Successfully ");
			
		}
		else
			System.out.println("Number Updated  successfully ");
		
		

	}

}

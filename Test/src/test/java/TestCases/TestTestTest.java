package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class TestTestTest {

	public static void main(String[] args) {

		WebDriver driver ;
		 System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   driver.get("https://automationexercise.com/");

		WebElement BT ;
	    BT = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
	    Actions action = new Actions(driver);
		action.click(BT).perform();

	   WebElement Name ;
	   Name = driver.findElement(By.name("name"));
	   Name.sendKeys("Maroua");
		 WebElement Email ; 
		 Email = driver.findElement(By.name("email"));
		 Email.sendKeys("SellamiSellami2020@gmail.com");
	    WebElement signup ; 
	    signup = driver.findElement(By.xpath("//button[normalize-space()='Signup']"));
	    action.click(signup).perform();
	    String resultat_attendu ;
	    String resultat_obtenu;
	    resultat_attendu =("https://automationexercise.com/signup");
	    resultat_obtenu =driver.getCurrentUrl();
	    Assert.assertEquals(resultat_attendu, resultat_obtenu);

	}
	

	}



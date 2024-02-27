package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionList {

	public static void main(String[] args) throws InterruptedException {
		// chemin du chrome
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//Ouvrir chrome
		WebDriver navig = new ChromeDriver();
		//Implicitywait
		navig.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//maximaze 
		navig.manage().window().maximize();
		//ouvrir Url
		navig.get("https://demoqa.com/select-menu");
		//Déclaration
		WebElement OldMenu ;
		//Identification
		OldMenu = navig.findElement(By.id("oldSelectMenu"));
		//Action
		Select liste = new Select(OldMenu);
		liste.selectByValue("6");
		Thread.sleep(5000);
	    liste.selectByVisibleText("Green");
	
		
		

	}

}

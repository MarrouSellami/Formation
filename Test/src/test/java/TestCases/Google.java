package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class Google {

	public static void main(String[] args) {
		// Chemin chrome 
		System.setProperty("webdriver.chrome.driver","src/test/ressources/chromedriver.exe");
		//ouvrir chrome
		WebDriver driver = new ChromeDriver ();
		//maximaze windows
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//ouvrir url
		driver.get("https://www.google.fr/");
		//déclaration
		WebElement recherche ;
		WebElement R_affiché;
		//identification
		recherche = driver.findElement(By.xpath("//textarea[@title='Rechercher']"));
		recherche.sendKeys("tunisie");
		recherche.sendKeys(Keys.ENTER);
		R_affiché = driver.findElement(By.id("result-stats"));
		String resultat_obtenu;
		resultat_obtenu = R_affiché.getText();
		String resultat_attendu = ("résultats");
		Assert.assertTrue(resultat_obtenu.contains(resultat_attendu));
		System.out.println("Test ok");
		
		
		
		
		
		
		
		
		
		
		

	}

}

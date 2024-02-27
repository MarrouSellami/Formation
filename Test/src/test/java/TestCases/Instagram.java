package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class Instagram {

	public static void main(String[] args) {
		// chemin de chrome
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		//ouvrir chrome
		WebDriver driver = new  ChromeDriver();
		//Implicity Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Maximaze Windows 
		driver.manage().window().maximize();
		//Ouvrir Url 
		driver.get("https://www.instagram.com/");
		//Déclaration 
		WebElement Email;
		WebElement pass;
		WebElement BT_connecter ;
		WebElement BT_inscrit; 
		
		//identification
	    Email = driver.findElement(By.xpath("//input[@name='username']"));
	    pass = driver.findElement(By.xpath("//input[@name='password']"));
	   BT_connecter = driver.findElement(By.xpath("//body/div/div/div/div/div/div/div/section/main[@role='main']/article/div/div/div/form[@method='post']/div/div[3]"));
	    BT_inscrit = driver.findElement(By.xpath("//span[normalize-space()='Inscrivez-vous']"));
	    
	   //Action
	    Email.sendKeys("SellamiSellami2020@gmail.com");
	    pass.sendKeys("admin123");
	    Actions action = new Actions(driver);
	    action.click(BT_connecter).perform();
	    action.click(BT_inscrit).perform();
	    System.out.println("Test ok");
	    WebElement affichage ; 
	    affichage = driver.findElement(By.xpath("//span[contains(text(),'Inscrivez-vous pour voir les photos et vidéos de v')]"));
	    String resultat_attendu = "Inscrivez-vous pour voir les photos et vidéos de vos amis.";
	    String resultat_obtenu ;
	    resultat_obtenu = affichage.getText();
	    Assert.assertEquals(resultat_attendu, resultat_obtenu);
	    System.out.println("ok");
	    
	    
	    
	    
	    
	    
	    
		
	
	}	
		

	

	

}
